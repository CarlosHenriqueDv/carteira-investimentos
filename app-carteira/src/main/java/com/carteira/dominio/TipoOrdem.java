package com.carteira.dominio;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
public enum TipoOrdem {

    VENDA(0, "Venda"), COMPRA(1, "Compra");

    private int id;
    private String descricao;

    TipoOrdem(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
