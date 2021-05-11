package views;

import java.util.Scanner;

import controllers.ColetaController;
import models.Doador;
import models.EstoqueDeSangue;
import models.Funcionario;
import models.Hospital;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Doador");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Hospital");
			System.out.println("4 - Coleta");
			System.out.println("5 - Pedido de Sangue");
			System.out.println("6 - Estoque de sangue");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				DoadorView.Menu();
				break;
			case 2:
				FuncionarioView.Menu();
				break;
			case 3:
				HospitalView.Menu();
				break;
			case 4:
				ColetaView.Menu();
				break;
			case 5:
				PedidoDeSangueView.Menu();
				break;
			case 6:
				EstoqueView.Menu();
				break;
			case 0:
				System.out.println("\nSaindo...\n");
				break;
			default:
				System.out.println("\nOpção Inválida!");
				break;

			}

		} while (opcao != 0);

		sc.close();

	}

}
