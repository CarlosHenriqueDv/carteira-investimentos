package com.carteira.servico;

import com.carteira.dominio.Carteira;
import com.carteira.repositorio.CarteiraRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Service
@Transactional
public class CarteiraServiceImpl implements CarteiraService {

    @Resource
    private CarteiraRepositorio carteiraRepositorio;

    @Override
    public List<Carteira> findAll() {
        return carteiraRepositorio.findAll();
    }

    @Override
    public Carteira salvar(Carteira carteira) {
        return carteiraRepositorio.save(carteira);
    }

    @Override
    public Carteira editar(Carteira carteira) {
        return carteiraRepositorio.save(carteira);
    }

    @Override
    public void excluir(Carteira carteira) {
        carteiraRepositorio.delete(carteira);
    }

    @Override
    public Carteira findById(Long id) {
        Optional<Carteira> carteira = carteiraRepositorio.findById(id);
        return carteira.orElse(null);
    }
}
