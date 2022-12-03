package com.carteirainvestimentos.carteira.controller;

import com.carteirainvestimentos.carteira.dominio.Ativo;
import com.carteirainvestimentos.carteira.dominio.TipoAtivo;
import com.carteirainvestimentos.carteira.servico.AtivoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

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

    @Resource
    private AtivoService ativoService;



    @GetMapping("/cadastro")
    public String cadastroAtivos(Ativo ativo){
        return PAGINA_CADASTRO_ATIVOS;
    }

    @GetMapping("/listar")
    public String listarAtivos(){
        return PAGINA_LISTAR_ATIVOS;
    }

    @PostMapping("/salvar")
    public String salvar(Ativo ativo, RedirectAttributes redirectAttributes){

        ativoService.salvar(ativo);
        if (ativo.getId() != null){
            redirectAttributes.addFlashAttribute("sucesso", "Cadastro realizado com sucesso!");
        }
        return "redirect:/ativos/cadastro";
    }


    @ModelAttribute("tiposAtivos")
    public List<TipoAtivo> listaTiposAtivos(){
        return Arrays.asList(TipoAtivo.values());
    }





}
