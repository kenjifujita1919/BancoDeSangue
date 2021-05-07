package controllers;

import java.util.ArrayList;

import models.Funcionario;
import models.GerarID;
import models.PedidoDeSangue;

public class PedidoDeSangueController {

	public static	ArrayList<PedidoDeSangue> pedidos = new ArrayList<PedidoDeSangue>();
	public static void Cadastro(PedidoDeSangue pedidoDeSangue) {
		
		boolean pedidoDeSangueEncontrado = false;
		for(PedidoDeSangue p : pedidos) {
			if(p.getTipo_sanguineo().equals(pedidoDeSangue.getID())) {
				pedidoDeSangueEncontrado = true;
			}
		}
			if(!pedidoDeSangueEncontrado) {
				pedidoDeSangue.setID(GerarID.GerarPedidoDeSangue());
				pedidos.add(pedidoDeSangue);
			}else {
				System.out.println("Esse Pedido De Sangue já existe!");
			}
			
		}
		
		public static String Listar(){
			String lista = "";
			
			for(PedidoDeSangue p : pedidos) {
				lista += p.toString() + "\n";
			}
			return lista;
		}
		
public static void Remover(String PedidoDeSangue) {
			
			for(int i=0; i < pedidos.size(); i++) {
				PedidoDeSangue p = pedidos.get(i);
			    
			    if(p.getTipo_sanguineo().equals(PedidoDeSangue)) {
			    	pedidos.remove(p);
			    	if(pedidos.size() > 0) {
			    		Listar();
			    	}else {
			    		System.out.println("Lista de Pedido De Sangue vazia!");
			    	}
			    }else {
			    	System.out.println("Pedido De Sangue não encontrado!");
			    }
			}
			
		}
}
