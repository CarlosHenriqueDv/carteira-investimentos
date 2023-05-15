package com.carteira.controller;

import com.carteira.servico.CargaAtivoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * carteira-investimentos
 *
 * @author cshen on 29/01/2023.
 */
@RestController
@RequestMapping("/carga-ativos")
public class CargaAtivosController {

    private static final Logger LOGGER = LogManager.getLogger(CargaAtivosController.class);

    @Resource
    private CargaAtivoService cargaAtivoService;;

    @GetMapping("/all")
    public ResponseEntity<?> getTodosAtivos(){

        try {

            cargaAtivoService.realizaCarga();
        }catch (Exception e){
            ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }





}
