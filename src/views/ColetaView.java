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
	String funcionario;
	
	do {
		System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
		System.out.println("1 - Cadastrar coleta");
		System.out.println("2 - Listar coleta");
		System.out.println("3 - Remover coleta");
		System.out.println("0 - Sair\n");
		System.out.println("Digite a opção desejada: ");
		opcao = sc.nextInt();
		sc.nextLine();
		switch (opcao) {
		case 1:
			System.out.println("\n-- CADASTRAR DOADOR --\n");
			System.out.println("Digite o nome do Doador:");
			nome = sc.nextLine();
			System.out.println("Digite o nome do funcionario:");
			funcionario = sc.nextLine();
			ColetaController.Cadastro(nome, funcionario);
			break;
		case 2:
			ColetaController.Listar();
			break;
		case 3:
			break;
		case 0:
			System.out.println("\nVoltando ao menu principal");
			Principal.main(null);
			break;
		default:
			System.out.println("\nOpção inválida!");
			break;
		}			
	} while (opcao != 0);

	sc.close();
}
}
