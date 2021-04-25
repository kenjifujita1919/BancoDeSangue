package models;

public class Doador {

	// Características, atributos ou propriedades
	String nome;
	String cpf;
	String email;
	String telefone;
	String tipo_sanguineo;
	double peso;
	
	

	public Doador(String nome, String cpf, String email, String telefone, String tipo_sanguineo, double peso) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.tipo_sanguineo = tipo_sanguineo;
		this.peso = peso;
	}

	// Getters and Setters
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

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
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
		return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Email: " + getEmail() + " | Telefone: " + getTelefone() + 
				" | Tipo Sanguineo: " + getTipo_sanguineo() + " | Peso: " + Double.toString(getPeso());
	}

}
