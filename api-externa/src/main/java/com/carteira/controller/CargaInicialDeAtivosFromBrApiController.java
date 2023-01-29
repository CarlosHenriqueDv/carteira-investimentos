package com.carteira.controller;



import com.carteira.dominio.Root;
import com.carteira.service.CargaInicialService;
import com.carteira.service.ConsultaAtivosService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * carteira-investimentos
 *
 * @author cshen on 11/01/2023.
 */
@RestController
@RequestMapping("/carga-brapi")
public class CargaInicialDeAtivosFromBrApiController {

    private static final Logger LOG = LogManager.getLogger(CargaInicialDeAtivosFromBrApiController.class);

    @Resource
    private CargaInicialService cargaInicialService;

    @Resource
    private ConsultaAtivosService consultaAtivosService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Root> cargaAtivos(){

        Root root = null;

        try {

            root = consultaAtivosService.getTodosAtivos();
            return ResponseEntity.ok(root);

        }catch (Exception e){
            LOG.error("erro ao realizar carga dos ativos", e);
            return ResponseEntity.internalServerError().body(root);
        }


    }


}
