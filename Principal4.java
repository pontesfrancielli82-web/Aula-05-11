package aula_05_11;

public class Principal4 {

	public static void main(String[] args) {
		
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa ("Sinhá Moça", departamento);
		
		System.out.println(" Empresa é: " + empresa.getNome()+ "\nDepartamento: "+ departamento.getNome());

	}

}
