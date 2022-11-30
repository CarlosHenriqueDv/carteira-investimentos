package com.carteirainvestimentos.carteira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * carteira-investimentos
 *
 * @author cshen on 26/11/2022.
 */
@Controller
@RequestMapping("/carteiras")
public class CarteirasController {

    private static final String PAGINA_CARTEIRAS = "/carteira/carteiras";
    private static final String PAGINA_CAD_CARTEIRA = "/carteira/cadastro-carteira";

    @GetMapping
    public String carteiras(){
        return PAGINA_CARTEIRAS;
    }

    @GetMapping("/cadastro")
    public String cadCarteiras(){
        return PAGINA_CAD_CARTEIRA;
    }

}
