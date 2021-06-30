package controllers;

import java.util.ArrayList;
import java.util.List;

import Utils.GerarID;
import models.ColetaDeSangue;
import models.Doador;
import models.Funcionario;

import java.time.LocalDateTime;

public class ColetaController {

	private static	ArrayList<ColetaDeSangue> coletas = new ArrayList<ColetaDeSangue>();

	
	
public static void Cadastro(String nomeDoador, String nomeFuncionario, String Tipo, int Quantidade) {
	ColetaDeSangue coleta = new ColetaDeSangue();
	
	LocalDateTime dataAtual = LocalDateTime.now();

	
	ArrayList<Doador> doadores = DoadorController.listarDoador();
	ArrayList<Funcionario> funcionarios = FuncionarioController.listarFuncionario();
			
	if (doadores.size() <= 0 || funcionarios.size() <= 0) {
		System.out.println("Não foi possivel cadastrar coleta por que nenhum doador e/ou funcionario está cadastrado!");
		return;
	}

	 boolean encontrouDoador = false;
	 boolean encontrouFuncionario = false;
	 
	 for(Doador doador: doadores) {
		 if(doador.getNome().equals(nomeDoador)) {
			 coleta.setDoador(doador);
			 encontrouDoador = true;
		}
	 }
	 
	 
	 for (Funcionario funcionario: funcionarios) {
		 if(funcionario.getNome().equals(nomeFuncionario)) {
			 coleta.setFuncionario(funcionario);
			 encontrouFuncionario = true;
		}
	 }
	 
	 if (!encontrouDoador || !encontrouFuncionario) {
		 System.out.println("Doador e/ou Funcionario não encontrados!");
		 return;
	 }
	 
	 for (ColetaDeSangue coletaExistente: listar()) {
		 if (coletaExistente.getDoador().getNome().equals(nomeDoador) && !(coletaExistente.getCriadoEm().plusMonths(3).getMonth() == dataAtual.getMonth())) {
			 System.out.println("Não e possivel fazer a coleta dentro do periodo de 3 meses!");
			 return; 
		 }
	 }
	 
	 coleta.setID(GerarID.GerarColeta());
	 coleta.setQuantidade(Quantidade);
	 coleta.setTipoSanguineo(Tipo);
	 coletas.add(coleta);
	 
	}

public static List<ColetaDeSangue> listar() {

	return coletas;
}

public static void remover(int idColeta) {
	for (int i = 0; i < coletas.size(); i++) {
		
		ColetaDeSangue coleta = coletas.get(i);
		
		if (coleta.getID() == idColeta) {
			coletas.remove(coleta);
			if (coletas.size() > 0) {
				listar();
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




