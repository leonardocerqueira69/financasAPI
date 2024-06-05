package com.example.financas.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaId;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false, unique = true, length = 50)
    private String nome;

    @Size(max = 255)
    @Column(length = 255)
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Despesas> despesas;
}