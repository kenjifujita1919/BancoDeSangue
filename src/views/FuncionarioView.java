package views;

import java.util.ArrayList;

import models.Doador;
import models.Funcionario;

public class FuncionarioView {
	
	private static	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public static void Cadastro(Funcionario funcionario) {
		
		boolean funcionarioEncontrado = false;
		for(Funcionario f : funcionarios) {
			if(f.getCpf().equals(funcionario.getCpf())) {
				funcionarioEncontrado = true;
			}
		}
			if(!funcionarioEncontrado) {
				funcionarios.add(funcionario);
			}else {
				System.out.println("Esse funcionario já existe!");
			}
			
		}
		
		public static String Listar(){
			String lista = "";
			
			for(Funcionario f : funcionarios) {
				lista += f.toString() + "\n";
			}
			return lista;
		}
		
public static void Remover(String Funcionario) {
			
			for(int i=0; i < funcionarios.size(); i++) {
			    Funcionario f = funcionarios.get(i);
			    
			    if(f.getNome().equals(Funcionario)) {
			    	funcionarios.remove(f);
			    	if(funcionarios.size() > 0) {
			    		Listar();
			    	}else {
			    		System.out.println("Lista de funcionarios vazia!");
			    	}
			    }else {
			    	System.out.println("Funcionario não encontrado!");
			    }
			}
			
		}

}
