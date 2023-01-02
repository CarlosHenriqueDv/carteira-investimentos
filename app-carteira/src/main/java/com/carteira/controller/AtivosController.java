package com.carteira.controller;

import com.carteira.dominio.Ativo;
import com.carteira.dominio.TipoAtivo;
import com.carteira.servico.AtivoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    private static final String REDIRECT_CADASTRO_ATIVOS = "redirect:/ativos/cadastro";

    @Resource
    private AtivoService ativoService;



    @GetMapping("/cadastro")
    public String cadastroAtivos(Ativo ativo){
        return PAGINA_CADASTRO_ATIVOS;
    }

    @GetMapping("/listar")
    public String listarAtivos(ModelMap model){

        model.addAttribute("ativos", ativoService.findAll());

        return PAGINA_LISTAR_ATIVOS;
    }

    @PostMapping("/salvar")
    public String salvar(@Valid Ativo ativo, BindingResult bind, RedirectAttributes redirectAttributes){

        if (bind.hasErrors()){
            return PAGINA_CADASTRO_ATIVOS;
        }
        ativoService.salvar(ativo);
        if (ativo.getId() != null){
            redirectAttributes.addFlashAttribute("sucesso", "Cadastro realizado com sucesso!");
        }
        return REDIRECT_CADASTRO_ATIVOS;
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap modelMap){
        modelMap.addAttribute("ativo", ativoService.findById(id));
        return PAGINA_CADASTRO_ATIVOS;
    }

    @PostMapping("/editar")
    public String editar(Ativo ativo){
        ativoService.editar(ativo);
        return REDIRECT_CADASTRO_ATIVOS;
    }

    @ModelAttribute("tiposAtivos")
    public List<TipoAtivo> listaTiposAtivos(){
        return Arrays.asList(TipoAtivo.values());
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes redirectAttributes){
        ativoService.excluirAtivoById(id);
        redirectAttributes.addFlashAttribute("sucesso", "Ativo excluído com sucesso!");
        return "redirect:/ativos/listar";
    }





}
