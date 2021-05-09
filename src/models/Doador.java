package models;

import java.util.ArrayList;
import java.util.List;

public class Doador {

	// Características, atributos ou propriedades
	int ID;
	String nome;
	String cpf;
	String email;
	String telefone;
	double peso;

	public List<Doador> doadores = new ArrayList<Doador>();

	public List getDoadores() {
		return doadores;
	}

	public Doador(String nome, String cpf, String email, String telefone, double peso) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.peso = peso;
	}

	public double getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean equals(Object obj) {
		Doador outroDoaodr = (Doador) obj;
		return getCpf().equals(outroDoaodr.getCpf());
	}

	@Override
	public String toString() {
		return "ID: " + getId() + "| Nome: " + getNome() + " | CPF: " + getCpf() + " | Email: " + getEmail()
				+ " | Telefone: " + getTelefone() +  " | Peso: "
				+ Double.toString(getPeso());
	}

}
