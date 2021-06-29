package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Utils.GerarID;
import models.ColetaDeSangue;
import models.Doador;
import models.Funcionario;
import models.Pessoa;

public class ColetaController {

	private static	ArrayList<ColetaDeSangue> coletas = new ArrayList<ColetaDeSangue>();
	private static	ArrayList<Pessoa> doadores = new ArrayList<Pessoa>();
	private static	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
	
public static void Cadastro(String doador, String funcionario, String Tipo, int Quantidade) {
		
	ColetaDeSangue coleta = new ColetaDeSangue();
	
	doadores = PessoaController.doador;
		
		for(int i = 0; i < doadores.size(); i++) {
			Pessoa p = doadores.get(i);
			if(p.getNome().equals(doador)) {
				coleta.setDoadores(p);
			}
			System.out.println(p);
			
		}
		
//		if(coleta.getDoadores() == null) {
//			System.out.println("Doador não encontrador!");
//			System.out.println("Não e possivel fazer a coleta sem um doador!");
//		}else {
//			for(int i = 0; i < funcionarios.size(); i++) {
//				Funcionario d = funcionarios.get(i);
//				if(d.getNome().equals(funcionario)) {
//					coleta.setFuncionarios(d);;
//				}			
//			}
//			if(coleta.getFuncionarios() == null) {
//				System.out.println("Funcionario não encontrador!");
//				System.out.println("Não e possivel fazer a coleta sem um Funcionario!");
//			}else {
//				if(coleta.getCriadoEm().equals(new Date())) {
//					System.out.println("Não e possivel fazer a coleta no mesmo dia!");
//				}
//				coleta.setID(GerarID.GerarColeta());
//				coleta.setQuantidade(Quantidade);
//				coleta.setTipoSanguineo(Tipo);
//				coletas.add(coleta);
//			}
//		}
	}

public static List<ColetaDeSangue> Listar() {

	return coletas;
}

//public static void Remover(String doador) {
//	
//	for (int i = 0; i < coletas.size(); i++) {
//		ColetaDeSangue c = coletas.get(i);
//		if (c.getDoadores().get(i).equals(doador)) {
//			coletas.remove(c);
//			if (coletas.size() > 0) {
//				Listar();
//			} else {
//				System.out.println("Lista de doadores vazia!");
//			}
//		} else {
//			System.out.println("Doador não encontrado!");
//		}
//	}
//}
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

public static void BuscarID(int id) {
	for (int i = 0 ; i <coletas.size(); i++)
	{
		ColetaDeSangue y = coletas.get(i);
		if(y.getID() == id)
		{
			System.out.println (coletas.get(i));			
		}
		
}

}
public static void BuscarData(int id) {
	for (int i = 0 ; i <coletas.size(); i++)
	{
		ColetaDeSangue y = coletas.get(i);
		if(y.getID() == id)
		{
			System.out.println (coletas.get(i));			
		}
		
}

}
public static void BuscarTipo(int tipo2) {
String tiposangue2 = "";
	
	if(tipo2 == 1)
	{
		tiposangue2 = "A+";
	}
	if(tipo2 == 2)
	{
		tiposangue2 = "A-";
	}
	if(tipo2 == 3)
	{
		tiposangue2 = "B+";
	}
	if(tipo2 == 4)
	{
		tiposangue2 = "B-";
	}
	if(tipo2 == 5)
	{
		tiposangue2 = "AB+";
	}
	if(tipo2 == 6)
	{
		tiposangue2 = "AB-";	
	}
	if(tipo2 == 7)
	{
		tiposangue2 = "O+";
	}
	if(tipo2 == 8)
	{
		tiposangue2 = "O-";
	}
	
for (int i = 0 ; i <coletas.size(); i++)
{
	
	ColetaDeSangue y = coletas.get(i);
	if(y.getTipoSanguineo() == tiposangue2)
	{
		System.out.println (coletas.get(i));
		
	}

}
}
}




