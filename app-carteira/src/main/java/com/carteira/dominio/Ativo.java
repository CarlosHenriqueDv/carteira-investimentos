package com.carteira.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * carteira-investimentos
 *
 * @author cshen on 30/11/2022.
 */
@Entity
@Table
public class Ativo extends AbstractEntity<Long>{

    @Column(length = 150, nullable = false)
    @NotBlank(message = "Informe o nome do ativo")
    private String nome;

    @Column(unique = true, nullable = false, length = 100)
    @NotBlank(message = "Informe o código do ativo")
    private String codigo;

    @Column(nullable = false)
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
