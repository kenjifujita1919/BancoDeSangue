package models;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Date;

public class ColetaDeSangue {

	int ID;
	private Pessoa doador;
	private Pessoa funcionario;
	private String tipoSanguineo;
	private LocalDateTime criadoEm;

	public ColetaDeSangue() {
		setCriadoEm(LocalDateTime.now());
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Pessoa getDoador() {
		return doador;
	}

	public void setDoador(Doador doadores) {
		this.doador = doadores;
	}

	public Pessoa getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public LocalDateTime getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(LocalDateTime criadoEm) {
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
		return "ColetaDeSangue [ID=" + ID + ", doadores=" + doador + ", funcionarios=" + funcionario
				+ ", tipoSanguineo=" + tipoSanguineo + ", criadoEm=" + criadoEm + "]";
	}

}
