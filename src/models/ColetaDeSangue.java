package models;


public class ColetaDeSangue {

	int ID;
	private Doador doador;
	private Funcionario funcionario;

	
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
		return "ID: " + getID();
	}
	
}
