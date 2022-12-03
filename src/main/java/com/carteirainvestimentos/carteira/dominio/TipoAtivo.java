package com.carteirainvestimentos.carteira.dominio;

/**
 * carteira-investimentos
 *
 * @author cshen on 30/11/2022.
 */
public enum TipoAtivo {
    ACAO(0, "Ação"), FII(1, "Fundo Imobiliário"), TESOURO_DIRETO(2, "Tesouro Direto");

    private int codigo;
    private String nome;

    TipoAtivo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
