package models;

import java.util.Date;

public class PedidoDeSangue {

	// Características, atributos ou propriedades
		int ID;
		private String nome_do_hospital;
		private int quantidade_doada;
		private String tipo_sanguineo;
		private Date criadoEm;
		
		public PedidoDeSangue(String nome_do_hospital, int quantidade_doada, String tipo_sanguineo ) {
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

				
		@Override
		public String toString() {
			return "PedidoDeSangue | ID =" + ID + "| Nome do Hospital" + nome_do_hospital + "| Quantiidade doada: "
					+ quantidade_doada + "| tipo_sanguineo=" + tipo_sanguineo +  "| criadoEm="
					+ criadoEm + "|";
}
		}
