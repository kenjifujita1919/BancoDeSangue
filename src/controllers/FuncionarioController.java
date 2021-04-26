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
			System.out.println("1 - Cadastrar funcion�rio");
			System.out.println("2 - Listar funcion�rios");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a op��o desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR FUNCION�RIO --\n");
				System.out.println("Digite o Id do funcion�rio:");
				id = sc.nextInt();				
				System.out.println("Digite o nome do funcion�rio:");
				nome = sc.nextLine();
				System.out.println("Digite o CPF do funcion�rio:");
				cpf = sc.nextLine();
				System.out.println("Digite o Email do funcion�rio:");
				telefone = sc.nextLine();
				System.out.println("Digite o Telefone do funcion�rio:");
				email = sc.nextLine();
				
				
				Funcionario = new Funcionario(id, nome, cpf, telefone, email);
				FuncionarioView.Cadastro(Funcionario);
				
				break;
			case 2:
				System.out.println("\n-- LISTA DE FUNCION�RIO --\n");
				System.out.println(FuncionarioView.Listar());
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}			
		} while (opcao != 0);

		sc.close();
	}	
}



