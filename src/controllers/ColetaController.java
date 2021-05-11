package controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.ColetaDeSangue;
import models.Doador;
import models.Funcionario;
import models.GerarID;
import views.ColetaView;
import views.DoadorView;

public class ColetaController {

	private static	ArrayList<ColetaDeSangue> coletas = new ArrayList<ColetaDeSangue>();
	private static	ArrayList<Doador> doadores = new ArrayList<Doador>();
	private static	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
	
public static void Cadastro(String doador, String funcionario, String Tipo, int Quantidade) {
		
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
				coleta.setQuantidade(Quantidade);
				coleta.setTipoSanguineo(Tipo);
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
public static void EstoqueTotal() {
	int Amais = 0;
	int Amenos = 0;
	int Bmais = 0;
	int Bmenos = 0;
	int ABmais  = 0;
	int ABmenos  = 0;
	int Omais = 0;
	int Omenos = 0;
	
	
	for (int i = 0 ; i <coletas.size(); i++)
	{
		ColetaDeSangue y = coletas.get(i);
		if(y.getTipoSanguineo() == "A+")
		{
			Amais = 1 + Amais;
			
		}
		if(y.getTipoSanguineo() == "A-")
		{
			Amenos = 1 + Amenos;
			
		}
		if(y.getTipoSanguineo() == "B+")
		{
			Bmais = 1 + Bmais;
			
		}
		if(y.getTipoSanguineo() == "B-")
		{
			Bmenos = 1 + Bmenos;
			
		}	
		if(y.getTipoSanguineo() == "AB+")
		{
			ABmais = 1 + ABmais;
			
		}	
		if(y.getTipoSanguineo() == "AB-")
		{
			ABmenos = 1 + ABmenos;
			
		}	
		if(y.getTipoSanguineo() == "O+")
		{
			Omais = 1 + Omais;
			
		}
		if(y.getTipoSanguineo() == "O-")
		{
			Omenos = 1 + Omenos;
			
		}	
		}
		
	System.out.println ("Estoque de Sangue");
	System.out.println ("A+: " +Amais + "| A-: " + Amenos + "| AB+: "+ABmais+"| AB-: "+ABmenos+"| B+: "+Bmais+
			"| B-: "+ Bmenos+"| O+: "+Omais+"| O-: "+Omenos);
	}
public static void Estoque(int optipo) {
String tiposangue = "";
	
	if(optipo == 1)
	{
		tiposangue = "A+";
	}
	if(optipo == 2)
	{
		tiposangue = "A-";
	}
	if(optipo == 3)
	{
		tiposangue = "B+";
	}
	if(optipo == 4)
	{
		tiposangue = "B-";
	}
	if(optipo == 5)
	{
		tiposangue = "AB+";
	}
	if(optipo == 6)
	{
		tiposangue = "AB-";	
	}
	if(optipo == 7)
	{
		tiposangue = "O+";
	}
	if(optipo == 8)
	{
		tiposangue = "O-";
	}
	int estoque = 0;
for (int i = 0 ; i <coletas.size(); i++)
{
	
	ColetaDeSangue y = coletas.get(i);
	if(y.getTipoSanguineo() == tiposangue)
	{
		estoque = 1 + estoque;
		
	}
	
	
}
System.out.println ("Estoque de sangue do tipo " + tiposangue+" : " +estoque);
}
}





