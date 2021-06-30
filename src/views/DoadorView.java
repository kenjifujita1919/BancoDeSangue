package views;

import java.util.Scanner;

import Utils.GerarID;
import controllers.DoadorController;
import models.Doador;

public class DoadorView {
	
	private static Doador doador;	
	private static Scanner sc = new Scanner(System.in);
	private static int opcao;
	
	
	public static void Menu() {
		String nome, cpf, telefone, email;
		double peso;
		
		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar doador");
			System.out.println("2 - Listar doadores");
			System.out.println("3 - Remover doador");
			System.out.println("0 - Sair\n");
			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR DOADOR --\n");
				
				 System.out.print("Digite o nome do Doador: ");
				 nome = sc.nextLine();
				 
				 System.out.print("Digite o CPF do Doador: ");
				 cpf = sc.nextLine(); 
				 
				 System.out.print("Digite o Telefone do Doador: ");
				 telefone = sc.nextLine();
				 
				 System.out.print("Digite o Email do Doador: "); 
				 email = sc.nextLine();
				 
				 System.out.print("Digite o Peso do Doador: ");
				 peso = sc.nextDouble();
				
				doador = new Doador(GerarID.GerarDoador(),nome,cpf, email, telefone, peso);
				DoadorController.cadastrarDoador(doador);
				
				break;
			case 2:
				System.out.println("\n-- LISTA DE DOADORES --\n");
				System.out.println(DoadorController.listarDoador());
				break;
			case 3:
				System.out.println("\n-- REMOVER DOADOR --\n");
				System.out.print("Digite o cpf do doador que deseja remover: ");
				cpf = sc.next();
				DoadorController.removerDoador(cpf);
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
