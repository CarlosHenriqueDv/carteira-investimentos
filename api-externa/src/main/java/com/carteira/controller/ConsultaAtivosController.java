package com.carteira.controller;

import com.carteira.service.ConsultaAtivosService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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


    @GetMapping(value = "/cotacoes/{ativos}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCotacoes(@PathVariable("ativos") String ativos,
                                         @RequestParam(defaultValue = "1d") String range,
                                         @RequestParam(defaultValue = "1d") String interval) {

        try {

            if (StringUtils.isBlank(ativos) || StringUtils.isNumeric(ativos)) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            Mono<?> cotacoes;

            if (range.equals("1d")) {
                cotacoes = serviceConsulta.getCotacoes(ativos);
            } else {
                cotacoes = serviceConsulta.getCotacoes(ativos, range, interval);
            }

            if (Objects.isNull(cotacoes)) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            return new ResponseEntity<>(cotacoes.block(), HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
