package controllers;

import java.util.ArrayList;
import java.util.List;

import models.ColetaDeSangue;
import models.Doador;
import models.Funcionario;
import models.GerarID;
import views.ColetaView;
import views.DoadorView;

public class ColetaController {

	private static	ArrayList<ColetaDeSangue> coletas = new ArrayList<ColetaDeSangue>();
		
	
public static void Cadastro(String doador, String funcionario) {
		
	ColetaDeSangue coleta = new ColetaDeSangue();
	doadores = DoadorController.doadores;
	funcionarios = FuncionarioController.funcionarios;
		
		for(int i = 0; i < doadores.size(); i++) {
			Doador d = doadores.get(i);
			if(d.getNome().equals(doador)) {
				coleta.setDoador(d);
			}			
		}
		
		if(coleta.getDoador() == null) {
			System.out.println("Doador não encontrador!");
			System.out.println("Não e possivel fazer a coleta sem um doador!");
		}else {
			for(int i = 0; i < funcionarios.size(); i++) {
				Funcionario d = funcionarios.get(i);
				if(d.getNome().equals(funcionario)) {
					coleta.setFuncionario(d);
				}			
			}
			if(coleta.getFuncionario() == null) {
				System.out.println("Funcionario não encontrador!");
				System.out.println("Não e possivel fazer a coleta sem um Funcionario!");
			}else {
				coleta.setID(GerarID.GerarColeta());
				coletas.add(coleta);
			}
		}
	}

public static List<ColetaDeSangue> Listar() {
	return coletas;
}

public static void Remover(String doador) {
	
	for (int i = 0; i < coletas.size(); i++) {
		ColetaDeSangue c = coletas.get(i);

		if (c.getDoador().getNome().equals(doador)) {
			coletas.remove(c);
			if (coletas.size() > 0) {
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
