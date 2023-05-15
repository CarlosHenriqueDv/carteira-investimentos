package com.carteira.servico;

import com.carteira.dominio.Ativo;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 29/01/2023.
 */
@Service
public class CargaAtivoServiceImpl implements CargaAtivoService {

    private RestTemplate template = new RestTemplate();
    private static final String URI = "http://localhost:8081/carga-ativos";

    @Resource
    private AtivoService ativoService;


    @Override
    public void realizaCarga() {

        JsonNode forObject = template.getForObject(URI + "/all", JsonNode.class);

        List<Ativo> ativos = processaCarga(forObject);



    }

    private List<Ativo> processaCarga(JsonNode root) {
        List<Ativo> ativos = new ArrayList<>();

        if (root != null){

        }

        return ativos;
    }
}
