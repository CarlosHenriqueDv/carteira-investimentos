package com.carteirainvestimentos.carteira.servico;

import com.carteirainvestimentos.carteira.dominio.Ativo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
