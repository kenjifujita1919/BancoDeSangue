package views;

import java.util.Date;
import java.util.Scanner;

import controllers.ColetaController;
import controllers.PedidoDeSangueController;
import models.ColetaDeSangue;
import models.Funcionario;
import models.PedidoDeSangue;

public class PedidoDeSangueView {

	public static void Menu() {

		int opcao;
		Scanner sc = new Scanner(System.in);

		PedidoDeSangue PedidoDeSangue;
		int optipo;
		String nome_do_hospital;
		String tipoSanguineo ="";
		int quantidade_doada;
		Date criadoEm;

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
				if(optipo == 1)
				{
					tipoSanguineo = "A+";
				}
				if(optipo == 2)
				{
					tipoSanguineo = "A-";
				}
				if(optipo == 3)
				{
					tipoSanguineo = "B+";
				}
				if(optipo == 4)
				{
					tipoSanguineo = "B-";
				}
				if(optipo == 5)
				{
					tipoSanguineo = "AB+";
				}
				if(optipo == 6)
				{
					tipoSanguineo = "AB-";	
				}
				if(optipo == 7)
				{
					tipoSanguineo = "O+";
				}
				if(optipo == 8)
				{
					tipoSanguineo = "O-";
				}
				System.out.println("Digite a quantidade de sangue doada:");
				quantidade_doada = sc.nextInt();
				
				
				PedidoDeSangue = new PedidoDeSangue(nome_do_hospital, quantidade_doada,tipoSanguineo);
				PedidoDeSangueController.Cadastro(PedidoDeSangue);
				break;
			case 2:
				System.out.println("\n-- LISTAR PEDIDO DE SANGUE --\n");
				for (PedidoDeSangue pedidos : PedidoDeSangueController.Listar()) {
					System.out.println(pedidos);
				}
				break;
			case 3:
				System.out.println("\n-- REMOVER PEDIDO DE SANGUE --\n");
				System.out.println("Digite o Tipo Sanguineo:");
				tipoSanguineo = sc.nextLine();
				PedidoDeSangueController.Remover(tipoSanguineo);
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
