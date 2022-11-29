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


    @RequestMapping
    public String carteiras(){
        return "/carteira/carteiras";
    }

}
