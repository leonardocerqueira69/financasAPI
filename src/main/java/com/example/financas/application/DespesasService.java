package com.example.financas.application;

import com.example.financas.entidades.Despesas;
import com.example.financas.repositories.DespesasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DespesasService {

    private final DespesasRepository despesasRepository;

    @Autowired
    public DespesasService(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }

    public List<Despesas> findAllDespesas() {
        return despesasRepository.findAll();
    }

    public Optional<Despesas> findDespesasById(Long id) {
        return despesasRepository.findById(id);
    }

    public Despesas saveDespesas(Despesas despesas) {
        return despesasRepository.save(despesas);
    }

    public void deleteDespesasById(Long id) {
        despesasRepository.deleteById(id);
    }
}
