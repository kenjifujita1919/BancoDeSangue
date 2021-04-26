package controllers;

import java.util.Scanner;

import models.Funcionario;
import views.FuncionarioView;


public class FuncionarioController {
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		Funcionario Funcionario;
		
		String nome, email, cpf, telefone; 
		int id;
		
		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar funcionário");
			System.out.println("2 - Listar funcionários");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR FUNCIONÁRIO --\n");
				System.out.println("Digite o Id do funcionário:");
				id = sc.nextInt();				
				System.out.println("Digite o nome do funcionário:");
				nome = sc.nextLine();
				System.out.println("Digite o CPF do funcionário:");
				cpf = sc.nextLine();
				System.out.println("Digite o Email do funcionário:");
				telefone = sc.nextLine();
				System.out.println("Digite o Telefone do funcionário:");
				email = sc.nextLine();
				
				
				Funcionario = new Funcionario(id, nome, cpf, telefone, email);
				FuncionarioView.Cadastro(Funcionario);
				
				break;
			case 2:
				System.out.println("\n-- LISTA DE FUNCIONÁRIO --\n");
				System.out.println(FuncionarioView.Listar());
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}			
		} while (opcao != 0);

		sc.close();
	}	
}



