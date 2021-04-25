package controllers;

import java.util.Scanner;

import models.Doador;
import views.DoadorView;

public class DoadorContoller {
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		Doador Doador;
		
		String nome, email, cpf, telefone, tipo_sanguineo; 
		double peso;
		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a op��o desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR DOADOR --\n");
				System.out.println("Digite o nome do Doador:");
				nome = sc.nextLine();
				System.out.println("Digite o CPF do Doador:");
				cpf = sc.nextLine();
				System.out.println("Digite o Telefone do Doador:");
				telefone = sc.nextLine();
				System.out.println("Digite o Email do Doador:");
				email = sc.nextLine();
				System.out.println("Digite o Tipo Sanguineo do Doador:");
				tipo_sanguineo = sc.nextLine();
				System.out.println("Digite o Peso do Doador:");
				peso = sc.nextDouble();
				
				Doador = new Doador(nome, cpf, telefone, email, tipo_sanguineo, peso);
				DoadorView.Cadastro(Doador);
				
				break;
			case 2:
				System.out.println("\n-- LISTA DE DOADORES --\n");
				System.out.println(DoadorView.Listar());
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
