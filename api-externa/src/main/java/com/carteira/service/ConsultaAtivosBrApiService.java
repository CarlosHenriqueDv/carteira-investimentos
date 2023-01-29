package com.carteira.service;


import com.carteira.dominio.Results;
import com.carteira.dominio.Root;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * carteira-investimentos
 *
 * @author cshen on 02/01/2023.
 */
@Service
public class ConsultaAtivosBrApiService implements ConsultaAtivosService {

    @Resource
    private WebClient webClientBrApi;

    private static final String URI_BASE = "api/quote/";


    @Override
    public Mono<?> getCotacoes(String ativos) {

        return webClientBrApi.get()
                .uri(URI_BASE + ativos + "?range=1d&interval=1d&fundamental=true")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Results.class);


    }

    @Override
    public Mono<?> getCotacoes(String ativos, String range, String interval) {
        String URI = URI_BASE + ativos + "?range=" + range + "&interval=" + interval +
                "&fundamental=true";

        return webClientBrApi.get()
                .uri(URI)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Results.class);
    }

    @Override
    public Root getTodosAtivos() {

        return webClientBrApi.get()
                .uri(URI_BASE + "/list")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Root.class)
                .block();
    }

}
