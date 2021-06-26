package views;

import java.util.Scanner;

import controllers.ColetaController;

public class ConsultaView {
	public static void Menu() {
	
		int opcao,id,tipo;
		Scanner sc = new Scanner(System.in);
		
		do {System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
		System.out.println("1 - Buscar por ID");
		System.out.println("2 - Buscar por Data da Doação");
		System.out.println("3 - Tipo de sangue");
		System.out.println("0 - Sair\n");
		System.out.println("Digite a opção desejada: ");
		opcao = sc.nextInt();
		sc.nextLine();
		switch (opcao) {
		case 1:
			System.out.println("Digite seu ID: ");			
			id=sc.nextInt();
			ColetaController.BuscarID(id);
			break;
		case 2:
			
			break;
		case 3:
			System.out.println("Selecione o tipo de sangue ");
			System.out.println(" 1 = Tipo Sanguineo A+ ");
			System.out.println(" 2 = Tipo Sanguineo A- ");
			System.out.println(" 3 = Tipo Sanguineo B+ ");
			System.out.println(" 4 = Tipo Sanguineo B- ");
			System.out.println(" 5 = Tipo Sanguineo AB+ ");
			System.out.println(" 6 = Tipo Sanguineo AB- ");
			System.out.println(" 7 = Tipo Sanguineo O+ ");
			System.out.println(" 8 = Tipo Sanguineo O- ");
			tipo=sc.nextInt();
			ColetaController.BuscarTipo(tipo);
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
		
		
		
	}
	
}
