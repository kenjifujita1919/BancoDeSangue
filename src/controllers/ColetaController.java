package controllers;

import java.util.ArrayList;

import models.ColetaDeSangue;
import models.Doador;

public class ColetaController {

	private static	ArrayList<ColetaDeSangue> coletas = new ArrayList<ColetaDeSangue>();
	
public static void Cadastro(String doador) {
		
		boolean clienteEncontrado = false;
		for(ColetaDeSangue d : coletas) {
			if(d.getDoador().equals(doador)) {
				clienteEncontrado = true;
			}			
		}
}
}
