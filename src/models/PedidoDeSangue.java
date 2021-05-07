package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoDeSangue {

	// Características, atributos ou propriedades
		int ID;
		private String nome_do_hospital;
		private int quantidade_doada;
		private String tipo_sanguineo;
		private String fator_rh;
		private Date criadoEm;
		
		public PedidoDeSangue(String nome_do_hospital, int quantidade_doada, String tipo_sanguineo, String fator_rh ) {
			setCriadoEm(new Date());
		}
		
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getNome_de_hospital() {
			return nome_do_hospital;
		}
		public void setNome_de_hospital(String nome_do_hospital) {
			this.nome_do_hospital = nome_do_hospital;
		}
		public int getQuantidade_doada() {
			return quantidade_doada;
		}
		public void setQuantidade_doada(int quantidade_doada) {
			this.quantidade_doada = quantidade_doada;
		}
		public String getTipo_sanguineo() {
			return tipo_sanguineo;
		}
		public void setTipo_sanguineo(String tipo_sanguineo) {
			this.tipo_sanguineo = tipo_sanguineo;
		}
		public Date getCriadoEm() {
			return criadoEm;
		}
		public void setCriadoEm(Date criadoEm) {
			this.criadoEm = criadoEm;
		}

		public String getFator_rh() {
			return fator_rh;
		}

		public void setFator_rh(String fator_rh) {
			this.fator_rh = fator_rh;
		}
				
		
}
