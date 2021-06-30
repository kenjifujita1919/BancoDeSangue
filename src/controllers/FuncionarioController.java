package controllers;

import java.util.ArrayList;

import models.Funcionario;
import models.Pessoa;

public class FuncionarioController {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static void cadastrarFuncionario(Funcionario novoFuncionario) {

		boolean funcionarioEncontrado = false;
		for (Pessoa funcionario : funcionarios) {
			if (funcionario.getCpf().equals(novoFuncionario.getCpf())) {
				funcionarioEncontrado = true;
			}
		}
		if (!funcionarioEncontrado) {
			funcionarios.add(novoFuncionario);
		} else {
			System.out.println("Esse funcionario já existe!");
		}

	}

	public static ArrayList<Funcionario> listarFuncionario() {
		return funcionarios;
	}

	public static void removerFuncionario(String cpfFuncionario) {

		for (int i = 0; i < funcionarios.size(); i++) {
			Pessoa funcionario = funcionarios.get(i);

			if (funcionario.getCpf().equals(cpfFuncionario)) {
				funcionarios.remove(funcionario);
				if (funcionarios.size() > 0) {
					listarFuncionario();
				} else {
					System.out.println("Lista de funcionarios vazia!");
				}
			} else {
				System.out.println("Funcionario não encontrado!");
			}
		}

	}
	
}
