package views;

import java.util.Scanner;

import controllers.DoadorController;
import controllers.FuncionarioController;
import models.Funcionario;

public class FuncionarioView {

	public static void Menu() {
		int opcao;
		Scanner sc = new Scanner(System.in);

		Funcionario Funcionario;

		String nome, email, cpf, telefone;

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar funcion�rio");
			System.out.println("2 - Listar funcion�rios");
			System.out.println("3 - Remover funcion�rio");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a op��o desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR FUNCION�RIO --\n");
				System.out.println("Digite o nome do funcion�rio:");
				nome = sc.nextLine();
				System.out.println("Digite o CPF do funcion�rio:");
				cpf = sc.nextLine();
				System.out.println("Digite o Email do funcion�rio:");
				telefone = sc.nextLine();
				System.out.println("Digite o Telefone do funcion�rio:");
				email = sc.nextLine();

				Funcionario = new Funcionario(nome, cpf, telefone, email);
				FuncionarioController.Cadastro(Funcionario);

				break;
			case 2:
				System.out.println("\n-- LISTA DE FUNCION�RIO --\n");
				System.out.println(FuncionarioController.Listar());
				break;
			case 3:
				System.out.println("\n-- REMOVER FUNCION�RIO --\n");
				System.out.println("Digite o nome do funcion�rio que deseja remover:");
				nome = sc.nextLine();
				FuncionarioController.Remover(nome);
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
