package org.generation.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Programa que permite que un usuario agregue nombre y apellido de estudiantes matriculados en una universidad. Posteriormente, muestra la lista de los estudiantes agregados.
 *  -- Requerimentos:
 *  	> Utilizar ArrayList
 *  	> Scanner para interactuar con el usuario
 *  	> Loop para permitir que se agreguen varios estudiantes (do-while)
 *  	> Opción para salir del loop con la palabra 'Salir' (if-else, try-catch, ≠, switch son posibles opciones) 
 *  	> Mostrar lista de estudiantes (for-each)  
 */
public class SistemaEscolar {
	public static void main(String[] args) {
		//Inicializar un ArrayList para guardar a los estudiantes
		ArrayList<String> estudiantes = new ArrayList<String>();
		
		//2. Inicializar el Scanner para que el usuario comience a agregar a los estudiantes
				Scanner scanner = new Scanner(System.in);
				
				//3 y 4.Loop para agregar los nombres completos
				String nombreEstudiante;
				do {
					System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' para finalizar.");
					nombreEstudiante = scanner.nextLine(); //Invocado de manera local
					estudiantes.add(nombreEstudiante);
				} while(!nombreEstudiante.equals("Salir") && !nombreEstudiante.equals("SALIR") && !nombreEstudiante.equals("salir") ) ; //Siempre que NO se escriba "Salir", el loop se sigue ejecutando
				
				// 5 Mostrar lista de estudiantes (for-each)
				System.out.println("** Lista de estudiantes: ");
				for (String estudiante : estudiantes) {
					//Si no quiero que se muestre la palabra 'Salir' voy a agregar una condicional
					if (!estudiante.equals("Salir") && !estudiante.equals("salir") && !estudiante.equals("SALIR") ) {
					System.out.println(estudiante);
				}
		
				}
		scanner.close();
		/*
		 * Modificar nuestro programa para permitir salir con las palabras 'Salir' o 'salir'.
		 * Agregar la opción que permite que el usuario elimine un estudiante después de haberlo agregado y muestre la lista actualizada después de la eliminación (.remove();).
		 */
	

}
}
