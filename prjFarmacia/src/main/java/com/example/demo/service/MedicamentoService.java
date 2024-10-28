package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitie.Medicamento;
import com.example.demo.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

	private final MedicamentoRepository medicamentoRepository;

	@Autowired
	public MedicamentoService(MedicamentoRepository medicamentoRepository) {
		this.medicamentoRepository = medicamentoRepository;
	}

	public Medicamento slavarMedicamento(Medicamento medicamento) {
		return medicamentoRepository.save(medicamento);
	}

	public Medicamento buscarMedicamentoPorId(Long id) {
		return medicamentoRepository.findById(id).orElse(null);
	}

	public List<Medicamento> buscarTodosMedicamentos() {
		return medicamentoRepository.findAll();
	}

	public void excluirMedicamento(Long id) {
		medicamentoRepository.deleteById(id);
	}

	public Medicamento atualizarMedicamento(Long id, Medicamento medicamentoAtualizado) {
		Optional<Medicamento> medicamentoExistente = medicamentoRepository.findById(id);
		if (medicamentoExistente.isPresent()) {
			Medicamento medicamento = medicamentoExistente.get();
			medicamento.setNome(medicamentoAtualizado.getNome());
			medicamento.setBula(medicamentoAtualizado.getBula());
			medicamento.setIdFornec(medicamentoAtualizado.getIdFornec());
			medicamento.setDataValid(medicamentoAtualizado.getDataValid());
			return medicamentoRepository.save(medicamento);
		} else {
			return null;
		}
	}
}
