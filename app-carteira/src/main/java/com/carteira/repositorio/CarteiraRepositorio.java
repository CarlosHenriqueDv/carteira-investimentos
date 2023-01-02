package com.carteira.repositorio;

import com.carteira.dominio.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Repository
public interface CarteiraRepositorio extends JpaRepository<Carteira, Long> {
}
