package models;

public class Funcionario {

	// Características, atributos ou propriedades
	int id;
	String nome;
	String cpf;
	String email;
	String telefone;

	public Funcionario(String nome, String cpf, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
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

	@Override
	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return getCpf().equals(outroFuncionario.getCpf());
	}

	@Override
	public String toString() {
		return " | Id: " + getId() + " |Nome: " + getNome() + " | CPF: " + getCpf() + " | Email: " + getEmail()
				+ " | Telefone: " + getTelefone();
	}

}
