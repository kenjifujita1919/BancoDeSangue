package controllers;

import java.util.ArrayList;

import Utils.GerarID;
import models.Doador;
import models.Funcionario;
import models.Pessoa;


public class PessoaController {
	

	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void cadastrar(Pessoa doador) {

		boolean clienteEncontrado = false;
		for (Pessoa d : pessoas) {
			if (d.getCpf().equals(doador.getCpf())) {
				clienteEncontrado = true;
			}
		}
		if (!clienteEncontrado) {
			doador.setId(GerarID.GerarDoador());
			pessoas.add(doador);
		} else {
			System.out.println("Esse cliente já existe!");
		}

	}
	
	
	
	public static void castrar(Pessoa funcionario) {
		
		boolean funcionarioEncontrado = false;
		for(Pessoa f : pessoas) {
			if(f.getCpf().equals(funcionario.getCpf())) {
				funcionarioEncontrado = true;
			}
		}
			if(!funcionarioEncontrado) {
				funcionario.setId(GerarID.GerarDoador());
				pessoas.add(funcionario);
			}else {
				System.out.println("Esse funcionario já existe!");
			}
			
		}
	
	
	
	
	public static ArrayList<Pessoa> listarDoador() {

		ArrayList<Pessoa> doador = new ArrayList<Pessoa>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Doador) {
				doador.add(pessoa);

			}

		}
		return doador;
	}
	
	public static ArrayList<Pessoa> listarFuncionario() {

		ArrayList<Pessoa> funcionario = new ArrayList<Pessoa>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Funcionario) {
				funcionario.add(pessoa);

			}

		}
		return funcionario;
	}
	
	public static void removerFuncionario(String Funcionario) {
		
		for(int i=0; i < pessoas.size(); i++) {
		    Pessoa funcionario = pessoas.get(i);
		    
		    if(funcionario.getNome().equals(Funcionario)) {
		    	pessoas.remove(funcionario);
		    	if(pessoas.size() > 0) {
		    		listarFuncionario();
		    	}else {
		    		System.out.println("Lista de funcionarios vazia!");
		    	}
		    }else {
		    	System.out.println("Funcionario não encontrado!");
		    }
		}
		
	}
	
	public static void removerDoador(String Doador) {

		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa doador = pessoas.get(i);

			if (doador.getNome().equals(Doador)) {
				pessoas.remove(doador);
				if (pessoas.size() > 0) {
					listarDoador();
				} else {
					System.out.println("Lista de doadores vazia!");
				}
			} else {
				System.out.println("Doador não encontrado!");
			}
		}
	
	}
	
}
