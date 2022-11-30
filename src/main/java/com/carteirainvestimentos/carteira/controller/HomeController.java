package com.carteirainvestimentos.carteira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * carteira-investimentos
 *
 * @author cshen on 19/11/2022.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    private static final String PAGINA_HOME = "home";


    @RequestMapping
    public String getHome(){
        return PAGINA_HOME;
    }

}
