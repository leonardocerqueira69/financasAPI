package com.example.financas.entidades;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

    @Entity
    @Data
    @Table(name = "despesas")
    public class Despesas {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long despesaId;

        @ManyToOne
        @JoinColumn(name = "usuario_id", nullable = false)
        private Usuario usuario;

        @ManyToOne
        @JoinColumn(name = "categoria_id", nullable = false)
        private Categoria categoria;

        @ManyToOne
        @JoinColumn(name = "metodo_pagamento_id", nullable = false)
        private MetodoPagamentos metodoPagamento;

        @NotNull
        @Column(nullable = false, precision = 10, scale = 2)
        private BigDecimal valor;

        @Size(max = 255)
        @Column(length = 255)
        private String descricao;

        @NotNull
        @Column(nullable = false)
        private LocalDate dataDespesa;

        @NotNull
        @Column(nullable = false)
        private LocalDateTime criadoEm = LocalDateTime.now();

    }
