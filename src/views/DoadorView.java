package views;

import java.util.Scanner;

import Utils.GerarID;
import controllers.PessoaController;
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
				 System.out.println("Digite o Peso do Doador:");
				 peso = sc.nextDouble();
				
				doador = new Doador(GerarID.GerarDoador(),nome,cpf, email, telefone, peso);
				PessoaController.cadastrarPessoa(doador);
				
				break;
			case 2:
				System.out.println("\n-- LISTA DE DOADORES --\n");
				System.out.println(PessoaController.listarDoador());
				break;
			case 3:
				System.out.println("\n-- REMOVER DOADOR --\n");
				System.out.println("Digite o nome do doador que deseja remover:");
				doador.setNome(sc.next());
				//PessoaController.removerDoador(doador.setNome(null););
				break;
			case 0:
				System.out.println("\nVoltando ao menu principal");
				Principal.main(null);
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}
}
