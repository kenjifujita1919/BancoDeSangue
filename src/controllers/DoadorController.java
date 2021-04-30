package controllers;

import java.util.ArrayList;
import java.util.Iterator;

import models.Doador;

public class DoadorController {

	private static ArrayList<Doador> doadores = new ArrayList<Doador>();

	public static void Cadastro(Doador doador) {

		boolean clienteEncontrado = false;
		for (Doador d : doadores) {
			if (d.getCpf().equals(doador.getCpf())) {
				clienteEncontrado = true;
			}
		}
		if (!clienteEncontrado) {
			doadores.add(doador);
		} else {
			System.out.println("Esse cliente já existe!");
		}

	}

	public static String Listar() {
		String lista = "";

		for (Doador d : doadores) {
			lista += d.toString() + "\n";
		}
		return lista;
	}

	public static void Remover(String Doador) {

		for (int i = 0; i < doadores.size(); i++) {
			Doador d = doadores.get(i);

			if (d.getNome().equals(Doador)) {
				doadores.remove(d);
				if (doadores.size() > 0) {
					Listar();
				} else {
					System.out.println("Lista de doadores vazia!");
				}
			} else {
				System.out.println("Doador não encontrado!");
			}
		}
	}

	public static void Alterar(String nome) {

		for (int i = 0; i < doadores.size(); i++) {
			Doador d = doadores.get(i);

			if (d.getNome().equals(nome)) {
				doadores.set(nome, new d);
				if (doadores.size() > 0) {
					Listar();
				} else {
					System.out.println("Lista de doadores vazia!");
				}
			} else {
				System.out.println("Doador não encontrado!");
			}
		}

	}
}
