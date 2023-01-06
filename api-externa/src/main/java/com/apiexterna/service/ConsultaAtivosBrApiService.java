package com.apiexterna.service;

import com.apiexterna.dominio.Results;
import com.apiexterna.dominio.Ticker;
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


    @Override
    public Mono<?> getCotacoes(String ativos) {

        return webClientBrApi.get()
                .uri("api/quote/" + ativos + "?range=1d&interval=1d&fundamental=true")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Results.class);


    }

    @Override
    public Mono<?> getCotacoes(String ativos, String range, String interval) {
        String URI = "api/quote/" + ativos + "?range=" + range + "&interval=" + interval +
                "&fundamental=true";

        return webClientBrApi.get()
                .uri(URI)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Results.class);
    }
}
