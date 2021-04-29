package views;

import java.util.Scanner;

import controllers.ColetaController;
import controllers.DoadorController;
import models.Doador;

public class ColetaView {
	public static void Menu() {
	
	int opcao;
	Scanner sc = new Scanner(System.in);
	
	String nome;
	
	do {
		System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
		System.out.println("1 - Cadastrar doador");
		System.out.println("2 - Listar doadores");
		System.out.println("3 - Remover doador");
		System.out.println("0 - Sair\n");
		System.out.println("Digite a opção desejada: ");
		opcao = sc.nextInt();
		sc.nextLine();
		switch (opcao) {
		case 1:
			System.out.println("\n-- CADASTRAR DOADOR --\n");
			System.out.println("Digite o nome do Doador:");
			nome = sc.nextLine();
			ColetaController.Cadastro(nome);
			break;
		case 2:
			break;
		case 3:
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
