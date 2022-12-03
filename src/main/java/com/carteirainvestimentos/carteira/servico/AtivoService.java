package com.carteirainvestimentos.carteira.servico;

import com.carteirainvestimentos.carteira.dominio.Ativo;
import org.springframework.stereotype.Service;

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


}
