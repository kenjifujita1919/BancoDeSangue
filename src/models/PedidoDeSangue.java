package models;

import java.util.Date;

public class PedidoDeSangue {

	// Características, atributos ou propriedades
		int ID;
		private String nome_do_hospital;
		private int quantidade;
		private String tipo_sanguineo;
		private Date criadoEm;
		
		public PedidoDeSangue(String nome_do_hospital, int quantidade, String tipo_sanguineo) {
			this.nome_do_hospital = nome_do_hospital;
			this.quantidade = quantidade;
			this.tipo_sanguineo = tipo_sanguineo;
			criadoEm = new Date();
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getNome_do_hospital() {
			return nome_do_hospital;
		}

		public void setNome_do_hospital(String nome_do_hospital) {
			this.nome_do_hospital = nome_do_hospital;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
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
			return "PedidoDeSangue [ID=" + ID + ", nome_do_hospital=" + nome_do_hospital + ", quantidade=" + quantidade
					+ ", tipo_sanguineo=" + tipo_sanguineo + ", criadoEm=" + criadoEm + "]";
		}
		
		
		
		
		
		
}