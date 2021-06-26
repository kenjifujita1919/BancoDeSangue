package models;

public class Pessoa {
	
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	public Pessoa(int _id, String _nome, String _cpf, String _email, String _telefone) {
		
		this.id = _id;
		this.nome = _nome;
		this.cpf = _cpf;
		this.email = _email;
		this.telefone = _telefone;
	}

	public int getId() {
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
	public String toString() {
		return "PessoaController [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone="
				+ telefone + "]";
	}
	
	
	
}
