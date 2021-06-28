package views;

import java.util.Scanner;

import controllers.ColetaController;

public class EstoqueView {
	public static void Menu() {
		
		int opcao;
		int optipo = 0;
		Scanner sc = new Scanner(System.in);
		
		String nome, funcionario, tipo;
		int quantidadeSangue;
		
		
		
		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Por tipo de sangue");
			System.out.println("2 - Estoque total");
			System.out.println("0 - Sair\n");
			
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Qual tipo de sangue desaja pesquisar: ");
				System.out.println(" 1 = Tipo Sanguineo A+ ");
				System.out.println(" 2 = Tipo Sanguineo A- ");
				System.out.println(" 3 = Tipo Sanguineo B+ ");
				System.out.println(" 4 = Tipo Sanguineo B- ");
				System.out.println(" 5 = Tipo Sanguineo AB+ ");
				System.out.println(" 6 = Tipo Sanguineo AB- ");
				System.out.println(" 7 = Tipo Sanguineo O+ ");
				System.out.println(" 8 = Tipo Sanguineo O- ");
				optipo = sc.nextInt();
				try {
					ColetaController.Estoque(optipo);
				}
				catch (Exception e) {
					System.out.println("ERRO: " +  e.getMessage());
				}
				
				break;
			case 2:
				ColetaController.EstoqueTotal();
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
