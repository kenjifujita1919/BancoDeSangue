package models;

import java.util.Date;

public class TipoSanguineo {

	// Características, atributos ou propriedades
	int ID;
	private String tipo_sanguineo;
	private String fator_rh;

	public TipoSanguineo(int iD, String tipo_sanguineo, String fator_rh) {
		super();
		ID = iD;
		this.tipo_sanguineo = tipo_sanguineo;
		this.fator_rh = fator_rh;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}

	public String getFator_rh() {
		return fator_rh;
	}

	public void setFator_rh(String fator_rh) {
		this.fator_rh = fator_rh;
	}

}
