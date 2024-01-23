package org.generation.employee;

public class EmployeeMain {
	public static void main(String[] args) {
		//Instanciar los objetos
		Employee Daniel = new Employee("Daniel", "Maldonado", 7836, 8596.33d, "Instructor");
		Employee Abigail = new Employee("Abigail", "Martinez", 5274, 19754.20d, "Desarrolladora Frontend");
		Employee Arturo = new Employee("Arturo", "Avila", 4422, 17999d, "Desarrollador Backend");
		
		System.out.println(Daniel);
		System.out.println(Arturo);
		System.out.println(Abigail);
		
		//Invocando métodos definidos previamente (trabajar, calcularSalario, capacitarse, infoGeneral)
		
		Daniel.infoGeneral();
		Arturo.calcularSalario();
		Abigail.capacitarse();
		
		//Utilizar información específicade cada objeto mediante sus propiedades
		//Usando getter
		System.out.println(Daniel.getNombre() + " " + Daniel.getApellido() + " Ocupa el puesto de " + Daniel.getPuesto());
		
	//Accediendo a la propiedad del objeto
		System.out.println(Abigail.puesto + " gana $" + Abigail.salario);
		
		//Actualizando información mediante Setter
		Arturo.setSalario(24598.11);
		Arturo.calcularSalario();
	}
}
