package com.carteira.service;



import com.carteira.dominio.Root;
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

    Mono<?> getCotacoes(String ativos, String range, String interval);

    Root getTodosAtivos();
}
