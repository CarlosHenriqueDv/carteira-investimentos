package com.apiexterna.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * carteira-investimentos
 *
 * @author cshen on 02/01/2023.
 */
@Service
public interface ConsultaAtivosService {

    Mono<?> getCotacoes(String ativos);
}
