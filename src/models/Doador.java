package models;

import java.util.ArrayList;
import java.util.List;

public class Doador extends Pessoa {

	double peso;

	public Doador(int _id, String _nome, String _cpf, String _email, String _telefone) {
		super(_id, _nome, _cpf, _email, _telefone);
		
	}

	

	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}




	public List<Doador> doadores = new ArrayList<Doador>();

	public List<Doador> getDoadores() {
		return doadores;
	}

	@Override
	public boolean equals(Object obj) {
		Doador outroDoaodr = (Doador) obj;
		return getCpf().equals(outroDoaodr.getCpf());
	}


	@Override
	public String toString() {
		return "Doador [peso=" + peso + "]";
	}

	

}
