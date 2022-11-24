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

    private static final String PAGINA_CADASTRO_ATIVOS = "/ativos/cadastro-ativos";
    private static final String PAGINA_LISTAR_ATIVOS = "/ativos/listar-ativos";



    @GetMapping("/cadastro")
    public String cadastroAtivos(){
        return PAGINA_CADASTRO_ATIVOS;
    }

    @GetMapping("/listar")
    public String listarAtivos(){
        return PAGINA_LISTAR_ATIVOS;
    }




}
