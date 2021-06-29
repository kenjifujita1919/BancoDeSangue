package models;

public class Funcionario extends Pessoa {
	
	public Funcionario() {
		super();
	}

	public Funcionario(int id, String nome, String cpf, String email, String telefone) {
		super(id, nome, cpf, email, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return getCpf().equals(outroFuncionario.getCpf());
	}

	@Override
	public String toString() {
		return "Funcionario [Id=" + getId() + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Email=" + getEmail() + ", Telefone=" + getTelefone() + "]";
	}
	
	
	
	

}
