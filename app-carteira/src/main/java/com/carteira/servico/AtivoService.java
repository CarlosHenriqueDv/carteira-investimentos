package com.carteira.servico;

import com.carteira.dominio.Ativo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 03/12/2022.
 */
@Service
public interface AtivoService {

    void salvar(Ativo ativo);

    void editar(Ativo ativo);

    void excluir(Ativo ativo);

    List<Ativo> findAll();

    Ativo findById(Long id);

    void excluirAtivoById(Long id);
}
