package com.carteirainvestimentos.carteira.repositorio;

import com.carteirainvestimentos.carteira.dominio.Ordens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Repository
public interface OrdemRepositorio extends JpaRepository<Ordens, Long> {
}
