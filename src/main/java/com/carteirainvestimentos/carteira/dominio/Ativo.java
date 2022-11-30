package com.carteirainvestimentos.carteira.dominio;

/**
 * carteira-investimentos
 *
 * @author cshen on 30/11/2022.
 */
public class Ativo {

    private String nome;
    private String codigo;
    private TipoAtivo tipoAtivo;

    public Ativo(String nome, String codigo, TipoAtivo tipoAtivo) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipoAtivo = tipoAtivo;
    }

    public Ativo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoAtivo getTipoAtivo() {
        return tipoAtivo;
    }

    public void setTipoAtivo(TipoAtivo tipoAtivo) {
        this.tipoAtivo = tipoAtivo;
    }
}
