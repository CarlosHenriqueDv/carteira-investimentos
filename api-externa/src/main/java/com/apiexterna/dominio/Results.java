package com.apiexterna.dominio;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 02/01/2023.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Results {

    private List<Ticker> results;

    public List<Ticker> getResults() {
        return results;
    }

    public void setResults(List<Ticker> results) {
        this.results = results;
    }
}
