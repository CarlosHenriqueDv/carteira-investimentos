package com.carteira.controller;

import com.carteira.dominio.Carteira;
import com.carteira.servico.CarteiraServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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
    private static final String PAGINA_CARTEIRA_ATIVOS = "/carteira/carteira-ativos";
    private static final String REDIRECT_CAD_CARTEIRA = "redirect:/carteiras/cadastro";

    @Resource
    private CarteiraServiceImpl carteiraService;

    @GetMapping
    public String carteiras(ModelMap modelMap){

        modelMap.addAttribute("carteiras",carteiraService.findAll());
        return PAGINA_CARTEIRAS;
    }

    @GetMapping("/cadastro")
    public String cadCarteiras(Carteira carteira){
        return PAGINA_CAD_CARTEIRA;
    }

    @PostMapping("/salvar")
    public String salvar(Carteira carteira){
        carteiraService.salvar(carteira);
        return REDIRECT_CAD_CARTEIRA;
    }


    @GetMapping("/ativos/{idCarteira}")
    public String carteiraAtivos(@PathVariable("idCarteira") Long idCarteira){
        Carteira carteira = carteiraService.findById(idCarteira);

        return PAGINA_CARTEIRA_ATIVOS;
    }

}
