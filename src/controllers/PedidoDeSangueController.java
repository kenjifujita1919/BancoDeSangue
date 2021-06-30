package controllers;

import java.util.ArrayList;
import java.util.List;

import Utils.GerarID;
import models.ColetaDeSangue;
import models.Hospital;
import models.PedidoDeSangue;

public class PedidoDeSangueController {

	public static	ArrayList<PedidoDeSangue> pedidos = new ArrayList<PedidoDeSangue>();
	public static void Cadastro(PedidoDeSangue pedidoDeSangue) {
		
		ArrayList<ColetaDeSangue> coletas = ColetaController.coletas;
		ArrayList<Hospital> hospital = HospitalController.hospitais;
		
		boolean pedidoDeSangueEncontrado = false;
		for(PedidoDeSangue p : pedidos) {
			if(p.getTipo_sanguineo().equals(pedidoDeSangue.getID())) {
				pedidoDeSangueEncontrado = true;
			}
		}
			if(!pedidoDeSangueEncontrado) {
				if(hospital.size() == 0) {
					System.out.println("Lista de hospitais vazia");
				}else {
					for(ColetaDeSangue c : coletas) {
						if(c.getTipoSanguineo().equals(pedidoDeSangue.getTipo_sanguineo()) && c.getQuantidade() == pedidoDeSangue.getQuantidade()) {
							pedidoDeSangue.setID(GerarID.GerarPedidoDeSangue());
							pedidos.add(pedidoDeSangue);
							//int novaQuantidade = c.getQuantidade() - pedidoDeSangue.getQuantidade();
							coletas.remove(c);
						}
					}
					
				}
				
			}else {
				System.out.println("Esse Pedido De Sangue já existe!");
			}
			
		}
	
	public void AlteraEstoque(int indice, int valor) {
		
	}
		
		public static List<PedidoDeSangue> Listar(){
			return pedidos;
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
