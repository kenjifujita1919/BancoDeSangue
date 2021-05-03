package models;

import java.util.Date;

public class ColetaDeSangue {

	int ID;
	private Doador doador;
	private Funcionario funcionario;
	private int Quantidade;
	private Date Data;
	
	public ColetaDeSangue() {
		setData(new Date());
	}

	
	
	public int getQuantidade() {
		return Quantidade;
	}



	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}



	public Date getData() {
		return Data;
	}



	public void setData(Date data) {
		Data = data;
	}



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}



	@Override
	public String toString() {
		return "ColetaDeSangue [ID=" + ID + ", doador=" + doador + ", \n funcionario=" + funcionario + " \n, Quantidade="
				+ Quantidade + ", Data=" + Data + "]";
	}
	
}
