package controllers;

import java.util.ArrayList;

import models.Doador;
import models.Pessoa;

public class DoadorController {
	private static ArrayList<Doador> doadores = new ArrayList<Doador>();
	
	public static void cadastrarDoador(Doador novoDoador) {

		boolean clienteEncontrado = false;
		for (Pessoa doador : doadores) {
			if (doador.getCpf().equals(novoDoador.getCpf())) {
				clienteEncontrado = true;
			}
		}
		if (!clienteEncontrado) {
			doadores.add(novoDoador);
		} else {
			System.out.println("Esse Doador já existe!");
		}

	}
	
	public static ArrayList<Doador> listarDoador() {
		return doadores;
	}
	
	public static void removerDoador(String cpfDoador) {

		for (int i = 0; i < doadores.size(); i++) {
			Pessoa doador = doadores.get(i);

			if (doador.getCpf().equals(cpfDoador)) {
				doadores.remove(doador);
				if (doadores.size() > 0) {
					listarDoador();
				} else {
					System.out.println("Lista de doadores vazia!");
				}
			} else {
				System.out.println("Doador não encontrado!");
			}
		}

	}

}
