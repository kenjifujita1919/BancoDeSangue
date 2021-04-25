package views;

import java.util.ArrayList;

import models.Doador;

public class DoadorView {
	
	private static	ArrayList<Doador> doadores = new ArrayList<Doador>();
	public static void Cadastro(Doador doador) {
		
		boolean clienteEncontrado = false;
		for(Doador d : doadores) {
			if(d.getCpf().equals(doador.getCpf())) {
				clienteEncontrado = true;
			}
		}
			if(!clienteEncontrado) {
				doadores.add(doador);
			}else {
				System.out.println("Esse cliente já existe!");
			}
			
		}
		
		public static String Listar(){
			String lista = "";
			
			for(Doador d : doadores) {
				lista += d.toString() + "\n";
			}
			return lista;
		}
}
