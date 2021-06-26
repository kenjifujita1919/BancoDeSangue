package models;

import Utils.GerarID;

public class Hospital {

	// Características, atributos ou propriedades
	int id;
	String nome;
	String endereco;
	String responsavel;
	String telefone;

	public Hospital(String nome, String endereco, String responsavel, String telefone) {
		this.id = GerarID.GerarHospital();
		this.nome = nome;
		this.endereco = endereco;
		this.responsavel = responsavel;
		this.telefone = telefone;
	}

	// Getters and Setters
	public double getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public boolean equals(Object obj) {
		Hospital outroHospital = (Hospital) obj;
		return getNome().equals(outroHospital.getNome());
	}

	@Override
	public String toString() {
		return " | Id: " + getId() + " |Nome: " + getNome() + " | Endereco: " + getEndereco() + " | Responsavel: " + getResponsavel()
				+ " | Telefone: " + getTelefone();
	}

}
