package com.carteirainvestimentos.carteira.dominio;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * carteira-investimentos
 *
 * @author cshen on 04/12/2022.
 */
@Entity
@Table
public class Ordens extends AbstractEntity<Long> {

    @Column(nullable = false, length = 2)
    @NotBlank(message = "Informe o tipo de ordem.")
    private TipoOrdem tipoOrdem;

    @Column(nullable = false)
    @NotBlank(message = "Informe o valor")
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "ativo_fk")
    private Ativo ativo;

    @Column(nullable = false)
    @NotBlank(message = "Informe a data de comppra")
    private LocalDate data;

    @Column(nullable = false)
    @NotBlank(message = "Informe a quantidade")
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "carteira_fk")
    private Carteira carteira;

    public Ordens() {
    }

    public TipoOrdem getTipoOrdem() {
        return tipoOrdem;
    }

    public void setTipoOrdem(TipoOrdem tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
}
