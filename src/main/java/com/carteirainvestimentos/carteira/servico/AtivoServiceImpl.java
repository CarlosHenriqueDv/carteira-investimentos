package com.carteirainvestimentos.carteira.servico;

import com.carteirainvestimentos.carteira.dominio.Ativo;
import com.carteirainvestimentos.carteira.repositorio.AtivoRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * carteira-investimentos
 *
 * @author cshen on 03/12/2022.
 */
@Service
@Transactional
public class AtivoServiceImpl implements AtivoService {

    @Resource
    private AtivoRepositorio ativoRepositorio;


    @Override
    public void salvar(Ativo ativo) {
        ativoRepositorio.save(ativo);
    }

    @Override
    public void editar(Ativo ativo) {

    }

    @Override
    public void excluir(Ativo ativo) {

    }
}
