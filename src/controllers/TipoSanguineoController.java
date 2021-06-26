package controllers;

import java.util.Scanner;

public class TipoSanguineoController {

	public static String Cadastro() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Selecione de 1 e 8:");
		System.out.println(" 1 = Tipo Sanguineo A+ ");
		System.out.println(" 2 = Tipo Sanguineo A- ");
		System.out.println(" 3 = Tipo Sanguineo B+ ");
		System.out.println(" 4 = Tipo Sanguineo B- ");
		System.out.println(" 5 = Tipo Sanguineo AB+ ");
		System.out.println(" 6 = Tipo Sanguineo AB- ");
		System.out.println(" 7 = Tipo Sanguineo O+ ");
		System.out.println(" 8 = Tipo Sanguineo O- ");

		int tipos = entrada.nextInt();
		String Sangue = "";

		switch (tipos) {
		case 1:
			Sangue = "A+";
			break;
		case 2:
			Sangue = "A-";
			break;
		case 3:
			Sangue = "B+";
			break;
		case 4:
			Sangue = "B-";
			break;
		case 5:
			Sangue = "AB+";
			break;
		case 6:
			Sangue = "AB-";
			break;
		case 7:
			Sangue = "O+";
			break;
		case 8:
			Sangue = "O-";
			break;
		default:
			System.out.println("Tipo Sanguineo Inválido!");
		}
		return Sangue;

	}
	
}
