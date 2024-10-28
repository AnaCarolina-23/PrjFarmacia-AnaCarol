package com.example.demo.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
 
@Entity
@Table
public class Medicamento {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min = 3, message = "minimo de 3 caracteres")
	private String nome;
	@NotNull
	@Size(min = 10, message = "minimo de 10 caracteres")
	private String bula;
	@NotNull
	private Long idFornec;
	@NotNull
	@Size(min = 3, message = "minimo de 3 caracteres")
	private String dataValid;

	// Metodos get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public Long getIdFornec() {
		return id;
	}

	public void setIdFornec(Long id) {
		this.id = id;
	}

	public String getDataValid() {
		return dataValid;
	}

	public void setDataValid(String dataValid) {
		this.dataValid = dataValid;
	}
}