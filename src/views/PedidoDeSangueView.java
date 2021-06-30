package views;

import java.util.Date;
import java.util.Scanner;

import Utils.GerarID;
import controllers.ColetaController;
import controllers.PedidoDeSangueController;
import models.ColetaDeSangue;
import models.PedidoDeSangue;

public class PedidoDeSangueView {

	public static void Menu() {

		int opcao;
		Scanner sc = new Scanner(System.in);

		PedidoDeSangue PedidoDeSangue;
		int optipo;
		String nome_do_hospital, tipoSanguineo = null;

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar Pedido de Sangue");
			System.out.println("2 - Listar Pedido de Sangue");
			System.out.println("3 - Remover Pedido de Sangue");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR PEDIDO DE SANGUE --\n");
				System.out.println("Digite o nome de Hospital:");
				nome_do_hospital = sc.nextLine();
				System.out.println("Selecione o tipo de Sangue");
				System.out.println(" 1 = Tipo Sanguineo A+ ");
				System.out.println(" 2 = Tipo Sanguineo A- ");
				System.out.println(" 3 = Tipo Sanguineo B+ ");
				System.out.println(" 4 = Tipo Sanguineo B- ");
				System.out.println(" 5 = Tipo Sanguineo AB+ ");
				System.out.println(" 6 = Tipo Sanguineo AB- ");
				System.out.println(" 7 = Tipo Sanguineo O+ ");
				System.out.println(" 8 = Tipo Sanguineo O- ");
				optipo = sc.nextInt();
				switch (opcao) {
				case 1:
					tipoSanguineo = "A+";
					break;
				case 2:
					tipoSanguineo = "A-";
					break;
				case 3:
					tipoSanguineo = "B+";
					break;
				case 4:
					tipoSanguineo = "B-";
					break;
				case 5:
					tipoSanguineo = "AB+";
					break;
				case 6:
					tipoSanguineo = "AB-";
					break;
				case 7:
					tipoSanguineo = "O+";
					break;
				case 8:
					tipoSanguineo = "O-";
					break;

				default:
					System.out.println("\nOpção inválida!");
					break;
				}

				try {
					PedidoDeSangue = new PedidoDeSangue(nome_do_hospital, tipoSanguineo);
					PedidoDeSangueController.Cadastro(PedidoDeSangue);
				} catch (Exception e) {
					System.out.println("ERRO: " + e.getMessage());
				}

				break;

			case 2:
				System.out.println("\n-- LISTAR PEDIDO DE SANGUE --\n");

				System.out.println(PedidoDeSangueController.Listar());

				break;
			case 3:
				System.out.println("\n-- REMOVER PEDIDO DE SANGUE --\n");
				System.out.println("Digite o Tipo Sanguineo:");
				tipoSanguineo = sc.nextLine();
				try {
					PedidoDeSangueController.Remover(tipoSanguineo);
				} catch (Exception e) {
					System.out.println("ERRO: " + e.getMessage());
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
