package com.example.financas.repositories;

import com.example.financas.entidades.MetodoPagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagamentosRepository extends JpaRepository<MetodoPagamentos, Long> {
}