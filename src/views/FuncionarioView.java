package views;

import java.util.ArrayList;

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

}
