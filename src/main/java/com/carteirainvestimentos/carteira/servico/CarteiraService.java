package com.carteirainvestimentos.carteira.servico;

import com.carteirainvestimentos.carteira.dominio.Carteira;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Service
@Transactional
public interface CarteiraService {

    List<Carteira> findAll();

    Carteira salvar(Carteira carteira);

    Carteira editar(Carteira carteira);

    void excluir(Carteira carteira);

    Carteira findById(Long id);




}
