package models;

import java.util.ArrayList;
import java.util.List;

public class Doador extends Pessoa {

	private double peso;
	

	public Doador(int id, String nome, String cpf, String email, String telefone, double peso) {
		super(id, nome, cpf, email, telefone);
		this.peso = peso;
	}
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Doador [Id=" + getId() + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Email=" + getEmail() + ", Telefone=" + getTelefone() + " peso="+peso+"]";
	}
	
	
}
