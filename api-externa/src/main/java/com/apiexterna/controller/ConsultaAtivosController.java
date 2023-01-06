package com.apiexterna.controller;

import com.apiexterna.error.BadRequestException;
import com.apiexterna.service.ConsultaAtivosService;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * carteira-investimentos
 *
 * @author cshen on 02/01/2023.
 */
@RestController
@RequestMapping("api")
public class ConsultaAtivosController {

    @Resource
    private ConsultaAtivosService serviceConsulta;


    @GetMapping(value = "/cota/{ativos}")
    public ResponseEntity<?> atualizarCotacoesPorAtivo(@PathVariable("ativos") String ativos) {

        try {
            if (StringUtils.isBlank(ativos) || StringUtils.isNumeric(ativos)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            Mono<?> cotacoes = serviceConsulta.getCotacoes(ativos);
            if (Objects.isNull(cotacoes) ){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            return new ResponseEntity<>(cotacoes.block(), HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
