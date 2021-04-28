package models;

public class GerarID {
	private static int DoadorID = 1;
	private static int FuncionarioID = 1;
	private static int HospitalID = 1;

    public static int GerarDoador() {
        return DoadorID++;
    }
    public static int GerarFuncionario() {
        return FuncionarioID++;
    }
    public static int GerarHospital() {
        return HospitalID++;
    }
    
}
