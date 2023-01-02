package com.carteira.servico;

import com.carteira.repositorio.AtivoRepositorio;
import com.carteira.dominio.Ativo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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
        ativoRepositorio.save(ativo);
    }

    @Override
    public void excluir(Ativo ativo) {

    }

    @Override
    public List<Ativo> findAll() {
        return ativoRepositorio.findAll();
    }

    @Override
    public Ativo findById(Long id) {
        Optional<Ativo> ativo = ativoRepositorio.findById(id);
        return ativo.orElse(null);
    }

    @Override
    public void excluirAtivoById(Long id) {
        ativoRepositorio.deleteById(id);
    }


}
