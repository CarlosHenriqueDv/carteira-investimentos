package com.carteira.dominio;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Entity
@Table
public class Carteira extends AbstractEntity<Long> {

    @Column(length = 100, nullable = false)
    @NotBlank(message = "Informe o nome da Carteira!")
    private String nome;

    @Column(length = 200)
    private String descricao;

    @OneToMany(mappedBy = "carteira")
    private List<Ordens> ordens;

    public Carteira() {
    }

    public Carteira(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ordens> getOrdens() {
        return ordens;
    }

    public void setOrdens(List<Ordens> ordens) {
        this.ordens = ordens;
    }
}
