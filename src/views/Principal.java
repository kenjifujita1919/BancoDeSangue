package views;

import java.util.Scanner;

import models.Doador;
import models.Funcionario;
import models.Hospital;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);

		String nome, cpf, email, telefone, tipo_sanguineo, endereco, responsavel, funcionario, data, tipo, hospital, fator;
		double peso, id, quantidade;
		
		Doador doador = new Doador();
		/*Funcionario funcionario = new Funcionario();
		Hospital hospital = new Hospital();*/

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar doador");
			System.out.println("2 - Listar doador");
			System.out.println("3 - Alterar doador");
			System.out.println("4 - Apagar doador");
			System.out.println("5 - Cadastrar funcionario");
			System.out.println("6 - Listar funcionario");
			System.out.println("7 - Alterar funcionario");
			System.out.println("8 - Apagar funcionario");
			System.out.println("9 - Cadastrar hospital");
			System.out.println("10 - Listar hospital");
			System.out.println("11 - Alterar hospital");
			System.out.println("12 - Apagar hospital");
			System.out.println("13 - Cadastrar coleta de sangue");
			System.out.println("14 - Cadastrar pedido de sangue");
			System.out.println("15 - Cadastrar tipo de sangue");
			System.out.println("16 - Cadastrar estoque");
			System.out.println("17 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR DOADOR --\n");
				System.out.println("Digite o nome do doador");
				nome = sc.nextLine();
				System.out.println("Digite o cpf do doador");
				cpf = sc.next();
				System.out.println("Digite o email do doador");
				email = sc.nextLine();
				System.out.println("Digite o telefone do doador");
				telefone = sc.next();
				System.out.println("Digite o tipo sanguineo do doador");
				tipo_sanguineo = sc.nextLine();
				System.out.println("Digite o peso do doador");
				//peso = sc.next();
				break;
			case 2:
				System.out.println("\n-- LISTAR DOADOR --\n");
				break;
			case 3:
				System.out.println("\n-- ALTERAR DOADOR --\n");
				break;
			case 4:
				System.out.println("\n-- APAGAR DOADOR --\n");
				break;
			case 5:
				System.out.println("\n-- CADASTRAR FUNCIONARIO --\n");
				System.out.println("Digite o id do funcionario");
				//id = sc.nextLine();
				System.out.println("Digite o nome do funcionario");
				nome = sc.nextLine();
				System.out.println("Digite o cpf do funcionario");
				cpf = sc.next();
				System.out.println("Digite o email do funcionario");
				email = sc.nextLine();
				System.out.println("Digite o telefone do funcionario");
				telefone = sc.next();
				break;
			case 6:
				System.out.println("\n-- LISTAR FUNCIONARIO --\n");
				break;
			case 7:
				System.out.println("\n-- ALTERAR FUNCIONARIO --\n");
				break;
			case 8:
				System.out.println("\n-- APAGAR FUNCIONARIO --\n");
				break;
			case 9:
				System.out.println("\n-- CADASTRAR HOSPITAL --\n");
				System.out.println("Digite o id do hospital");
				//id = sc.nextLine();
				System.out.println("Digite o nome do hospital");
				nome = sc.nextLine();
				System.out.println("Digite o endereço do hospital");
				endereco = sc.next();
				System.out.println("Digite o responsável do hospital");
				responsavel = sc.nextLine();
				System.out.println("Digite o telefone do hospital");
				telefone = sc.next();
				break;
			case 10:
				System.out.println("\n-- LISTAR HOSPITAL --\n");
				break;
			case 11:
				System.out.println("\n-- ALTERAR HOSPITAL --\n");
				break;
			case 12:
				System.out.println("\n-- APAGAR HOSPITAL --\n");
				break;
			case 13:
				System.out.println("\n-- CADASTRAR COLETA DE SANGUE --\n");
				System.out.println("Digite o id da coleta");
				//id = sc.nextLine();
				System.out.println("Digite o nome do doador");
				nome = sc.nextLine();
				System.out.println("Digite o funcionario");
				funcionario = sc.next();
				System.out.println("Digite a data");
				data = sc.nextLine();
				System.out.println("Digite o tipo sanguíneo");
				tipo = sc.next();
				System.out.println("Digite a quantidade doada");
				//quantidade = sc.next();
				break;
			case 14:
				System.out.println("\n-- CADASTRAR PEDIDO DE SANGUE --\n");
				System.out.println("Digite o id do pedido de sangue");
				//id = sc.nextLine();
				System.out.println("Digite o nome do hospital");
				hospital = sc.nextLine();
				System.out.println("Digite a data");
				data = sc.nextLine();
				System.out.println("Digite o tipo sanguíneo");
				tipo = sc.next();
				System.out.println("Digite a quantidade doada");
				//quantidade = sc.next();
				break;
			case 16:
				System.out.println("\n-- CADASTRAR TIPO DE SANGUE --\n");
				System.out.println("Digite o id do tipo de sangue");
				//id = sc.nextLine();
				System.out.println("Digite o tipo de sangue");
				tipo = sc.nextLine();
				System.out.println("Digite o fator RH");
				fator = sc.nextLine();
				break;
			case 17:
				System.out.println("\n-- CADASTRAR ESTOQUE --\n");
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
