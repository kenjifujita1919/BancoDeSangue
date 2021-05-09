package views;

import java.util.Scanner;

import controllers.DoadorController;
import models.Doador;

public class DoadorView {

	public static void Menu() {
		int opcao;
		Scanner sc = new Scanner(System.in);

		Doador Doador;

		String nome, email, cpf, telefone;
		double peso;

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar doador");
			System.out.println("2 - Listar doadores");
			System.out.println("3 - Remover doador");
			System.out.println("4 - Alterar doador");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
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

				Doador = new Doador(nome, cpf, telefone, email, peso);
				DoadorController.Cadastro(Doador);

				break;
			case 2:
				System.out.println("\n-- LISTA DE DOADORES --\n");
				System.out.println(DoadorController.Listar());
				break;
			case 3:
				System.out.println("\n-- REMOVER DOADOR --\n");
				System.out.println("Digite o nome do doador que deseja remover:");
				nome = sc.nextLine();
				DoadorController.Remover(nome);
				break;
			case 4:
				System.out.println("\n-- ALTERAR DOADOR --\n");
				System.out.println("Digite o nome do doador que deseja alterar:");
				nome = sc.nextLine();
				DoadorController.Alterar(nome);
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
