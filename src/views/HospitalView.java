package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import controllers.HospitalController;
import models.Funcionario;
import models.Hospital;

public class HospitalView {
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);

		Hospital Hospital;

		String nome, endereco, responsavel, telefone;

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar hospital");
			System.out.println("2 - Listar hospitais");
			System.out.println("3 - Remover hospital");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR HOSPITAL --\n");
				System.out.println("Digite o nome do hospital:");
				nome = sc.nextLine();
				System.out.println("Digite o endereco do hospital:");
				endereco = sc.nextLine();
				System.out.println("Digite o responsavel do hospital:");
				responsavel = sc.nextLine();
				System.out.println("Digite o telefone do hospital:");
				telefone = sc.nextLine();

				Hospital = new Hospital(nome, endereco, responsavel, telefone);
				HospitalController.Cadastro(Hospital);

				break;
			case 2:
				System.out.println("\n-- LISTA DE HOSPITAL --\n");
				System.out.println(HospitalController.Listar());
				break;
			case 3:
				System.out.println("\n-- REMOVER HOSPITAL --\n");
				System.out.println("Digite o nome do hospital que deseja remover:");
				nome = sc.nextLine();
				HospitalController.Remover(nome);
				break;

			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}
}

