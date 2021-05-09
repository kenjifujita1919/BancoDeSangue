package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.GerarID;
import models.PedidoDeSangue;
import models.TipoSanguineo;

public class TipoSanguineoController {

	public static ArrayList<TipoSanguineo> tipos = new ArrayList<TipoSanguineo>();

	public static void Cadastro(TipoSanguineo tipoSanguineo) {

		boolean tipoSanguineoEncontrado = false;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Selecione de 1 e 8:");
		System.out.println(" 1 = A+ ");
		System.out.println(" 2 = A- ");
		System.out.println(" 3 = B+ ");
		System.out.println(" 4 = B- ");
		System.out.println(" 5 = AB+ ");
		System.out.println(" 6 = AB- ");
		System.out.println(" 7 = O+ ");
		System.out.println(" 8 = O- ");

		int tipos = entrada.nextInt();

		switch (tipos) {
		case 1:
			System.out.println("Tipo Sanguineo = A+");
			break;
		case 2:
			System.out.println("Tipo Sanguineo = A-");
			break;
		case 3:
			System.out.println("Tipo Sanguineo = B+");
			break;
		case 4:
			System.out.println("Tipo Sanguineo = B-");
			break;
		case 5:
			System.out.println("Tipo Sanguineo = AB+");
			break;
		case 6:
			System.out.println("Tipo Sanguineo = AB-");
			break;
		case 7:
			System.out.println("Tipo Sanguineo = O+");
			break;
		case 8:
			System.out.println("Tipo Sanguineo = O-");
			break;
		default:
			System.out.println("Tipo Sanguineo Inválido!");
		}

	}

	boolean tipoSanguineoEncontrado = false;
	for(TipoSanguineo t : tipos) {
		if(t.getTipo_sanguineo().equals(tipoSanguineo.getID())) {
			tipoSanguineoEncontrado = true;
		}
	}
		if(!pedidoDeSangueEncontrado) {
			tipoSanguineo.setID(GerarID.GerarPedidoDeSangue());
			tipos.add(tipoSanguineo);
		}else {
			System.out.println("Esse Tipo Sanguineo já existe!");
		}
		
	}
	
	public static List<TipoSanguineo> Listar() {
		return tipos;
	}

	
}
