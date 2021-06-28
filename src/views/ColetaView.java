package views;

import java.util.Scanner;

import controllers.ColetaController;
import controllers.TipoSanguineoController;
import models.ColetaDeSangue;

public class ColetaView {
	public static void Menu() {
	
	int opcao;
	Scanner sc = new Scanner(System.in);
	
	String nome, funcionario, tipo;
	int quantidadeSangue;
	
	
	
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
			System.out.println("\n-- CADASTRAR COLETA --\n");
			System.out.println("Digite o nome do Doador:");
			nome = sc.nextLine();
			System.out.println("Digite o nome do funcionario:");
			funcionario = sc.nextLine();
			System.out.println("Digite a quantidade de sangue doada:");
			quantidadeSangue = sc.nextInt();
			try {
				ColetaController.Cadastro(nome, funcionario, TipoSanguineoController.Cadastro(), quantidadeSangue);
			}
			catch (Exception e) {
				System.out.println("ERRO: " +  e.getMessage());
			}
			
			break;
		case 2:
			System.out.println("\n-- LISTAR COLETAS --\n");
			for (ColetaDeSangue coleta : ColetaController.Listar()) {
				System.out.println(coleta);
			}
			break;
		case 3:
			System.out.println("\n-- REMOVER COLETA --\n");
			System.out.println("Digite o nome do Doador:");
			nome = sc.nextLine();
			try {
				ColetaController.Remover(nome);
			}
			catch (Exception e) {
				System.out.println("ERRO: " +  e.getMessage());
			}
			
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
