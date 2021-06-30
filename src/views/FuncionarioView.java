package views;
import java.util.Scanner;

import Utils.GerarID;
import controllers.FuncionarioController;
import models.Doador;
import models.Funcionario;

public class FuncionarioView {

	public static void Menu() {
		int opcao;
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario;	

		String nome, email, cpf, telefone;

		do {
			System.out.println("\n-- PROJETO DE BANCO DE SANGUE --\n");
			System.out.println("1 - Cadastrar funcion�rio");
			System.out.println("2 - Listar funcion�rios");
			System.out.println("3 - Remover funcion�rio");
			System.out.println("0 - Sair\n");
			System.out.print("Digite a op��o desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR FUNCION�RIO --\n");
				
				System.out.print("Digite o nome do funcion�rio: ");
				nome = sc.nextLine();
				
				System.out.print("Digite o CPF do funcion�rio: ");
				cpf = sc.nextLine();
				
				System.out.print("Digite o Email do funcion�rio: ");
				telefone = sc.nextLine();
				
				System.out.print("Digite o Telefone do funcion�rio: ");
				email = sc.nextLine();
				
				try {
					funcionario = new Funcionario(GerarID.GerarFuncionario(), nome, cpf, email, telefone);
					FuncionarioController.cadastrarFuncionario(funcionario);
				}
				catch (Exception e) {
					System.out.println("ERRO: " +  e.getMessage());
				}

				break;
			case 2:
				System.out.println("\n-- LISTA DE FUNCION�RIO --\n");
				System.out.println(FuncionarioController.listarFuncionario());
				break;
			case 3:
				System.out.println("\n-- REMOVER FUNCION�RIO --\n");
				System.out.print("Digite o cpf do funcion�rio que deseja remover: ");
				cpf = sc.nextLine();
				try {
					FuncionarioController.removerFuncionario(cpf);
				}
				catch (Exception e) {
					System.out.println("ERRO: " +  e.getMessage());
				}
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
