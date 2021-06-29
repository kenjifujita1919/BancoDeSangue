package models;

import java.util.ArrayList;
import java.util.Date;

public class ColetaDeSangue {

	int ID;
	private Pessoa doadores;
	private Pessoa funcionarios;
	private int Quantidade;
	private String tipoSanguineo;
	private Date criadoEm;

	public ColetaDeSangue() {
		setCriadoEm(new Date());
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Pessoa getDoadores() {
		return doadores;
	}

	public void setDoadores(Pessoa doadores) {
		this.doadores = doadores;
	}

	public Pessoa getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Pessoa funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	@Override
	public String toString() {
		return "ColetaDeSangue [ID=" + ID + ", doadores=" + doadores + ", funcionarios=" + funcionarios
				+ ", Quantidade=" + Quantidade + ", tipoSanguineo=" + tipoSanguineo + ", criadoEm=" + criadoEm + "]";
	}

}
