package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitie.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

}