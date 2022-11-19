package com.carteirainvestimentos.carteira.ativos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * carteira-investimentos
 *
 * @author cshen on 15/11/2022.
 */
@Controller
@RequestMapping("/ativos")
public class AtivosController {



    @GetMapping("/cadastro")
    public String cadastroAtivos(){
        return "/ativos/cadastro-ativos";
    }




}
