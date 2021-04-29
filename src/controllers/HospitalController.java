package controllers;

import java.util.ArrayList;

import models.Funcionario;
import models.Hospital;

public class HospitalController {
	
	private static	ArrayList<Hospital> hospitais = new ArrayList<Hospital>();
	public static void Cadastro(Hospital hospital) {
		
		boolean hospitalEncontrado = false;
		for(Hospital h : hospitais) {
			if(h.getNome().equals(hospital.getNome())) {
				hospitalEncontrado = true;
			}
		}
			if(!hospitalEncontrado) {
				hospitais.add(hospital);
			}else {
				System.out.println("Esse hospital já existe!");
			}
			
		}
		
		public static String Listar(){
			String lista = "";
			
			for(Hospital h : hospitais) {
				lista += h.toString() + "\n";
			}
			return lista;
		}
		
public static void Remover(String Hospital) {
			
			for(int i=0; i < hospitais.size(); i++) {
				Hospital h = hospitais.get(i);
			    
			    if(h.getNome().equals(Hospital)) {
			    	hospitais.remove(h);
			    	if(hospitais.size() > 0) {
			    		Listar();
			    	}else {
			    		System.out.println("Lista de funcionarios vazia!");
			    	}
			    }else {
			    	System.out.println("Funcionario não encontrado!");
			    }
			}
			
		}


}
