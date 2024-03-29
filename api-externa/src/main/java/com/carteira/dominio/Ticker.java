package com.carteira.dominio;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 02/01/2023.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Ticker {

    private String symbol;

    private String shortName;

    private String longName;

    private String regularMarketPrice;

    private String regularMarketTime;

    private List<HistoricalDatePrice> historicalDataPrice;

    private String sector;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(String regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public String getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(String regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public List<HistoricalDatePrice> getHistoricalDataPrice() {
        return historicalDataPrice;
    }

    public void setHistoricalDataPrice(List<HistoricalDatePrice> historicalDataPrice) {
        this.historicalDataPrice = historicalDataPrice;
    }
}
