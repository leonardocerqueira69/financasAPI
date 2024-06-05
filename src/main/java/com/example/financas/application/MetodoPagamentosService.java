package com.example.financas.application;

import com.example.financas.entidades.MetodoPagamentos;
import com.example.financas.repositories.MetodoPagamentosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MetodoPagamentosService {

    private final MetodoPagamentosRepository metodoPagamentosRepository;

    @Autowired
    public MetodoPagamentosService(MetodoPagamentosRepository metodoPagamentosRepository) {
        this.metodoPagamentosRepository = metodoPagamentosRepository;
    }

    public List<MetodoPagamentos> findAllMetodoPagamentos() {
        return metodoPagamentosRepository.findAll();
    }

    public Optional<MetodoPagamentos> findMetodoPagamentosById(Long id) {
        return metodoPagamentosRepository.findById(id);
    }

    public MetodoPagamentos saveMetodoPagamentos(MetodoPagamentos metodoPagamentos) {
        return metodoPagamentosRepository.save(metodoPagamentos);
    }

    public void deleteMetodoPagamentosById(Long id) {
        metodoPagamentosRepository.deleteById(id);
    }
}
