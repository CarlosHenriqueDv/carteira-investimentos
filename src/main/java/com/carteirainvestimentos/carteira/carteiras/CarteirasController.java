package com.carteirainvestimentos.carteira.carteiras;

import org.springframework.stereotype.Controller;
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

    @RequestMapping
    public String carteiras(){
        return PAGINA_CARTEIRAS;
    }

    @RequestMapping("/cadastro")
    public String cadCarteiras(){
        return PAGINA_CAD_CARTEIRA;
    }

}
