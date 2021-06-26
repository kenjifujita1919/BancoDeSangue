package models;

public class Funcionario extends Pessoa {

	public Funcionario(int _id, String _nome, String _cpf, String _email, String _telefone) {
		super(_id, _nome, _cpf, _email, _telefone);
		
	}


	@Override
	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return getCpf().equals(outroFuncionario.getCpf());
	}


}
