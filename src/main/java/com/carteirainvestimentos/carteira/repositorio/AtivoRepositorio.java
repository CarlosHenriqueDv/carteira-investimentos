package com.carteirainvestimentos.carteira.repositorio;

import com.carteirainvestimentos.carteira.dominio.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * carteira-investimentos
 *
 * @author cshen on 03/12/2022.
 */
@Repository
public interface AtivoRepositorio extends JpaRepository<Ativo, Long> {



}
