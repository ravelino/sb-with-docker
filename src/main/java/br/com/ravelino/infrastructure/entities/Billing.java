package br.com.ravelino.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name ="billing")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Billing {

    @Id
    @GeneratedValue//(strategy=GenerationType.AUTO)
    private BigDecimal id;

    @Column(name = "data_vencimento")
    private Date dataVencimento;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    private BigDecimal valor;

    private String descricao;

    private String situacao;
}
