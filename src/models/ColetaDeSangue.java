package models;

import java.util.ArrayList;

public class ColetaDeSangue {

	int ID;
	private ArrayList<Doador> doador;
	private ArrayList<Funcionario> funcionario;
	
		public ColetaDeSangue(int iD, ArrayList<Doador> doador, ArrayList<Funcionario> funcionario) {
		super();
		ID = iD;
		this.doador = doador;
		this.funcionario = funcionario;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public ArrayList<Doador> getDoador() {
		return doador;
	}
	public void setDoador(ArrayList<Doador> doador) {
		this.doador = doador;
	}
	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	@Override
	public String toString() {
		return "ColetaDeSangue [ID=" + ID + ", doador=" + doador + ", funcionario=" + funcionario + "]";
	}
	
	
	
	
}
