package org.generation.letras;
import java.util.Scanner;
/*
 * Crear un programa que lesolicite un mensaje al usuario y cuente cuántas vocales, consonantes, número y  simbolos posee dicho mensaje.
 * 		Letras: Métodos para interactuar con elusuario
 * 		LetrasMain: vamos a instanciar los objetos.
 * 		Contador: métodos para contarvocales, consonantes, número y simbolos 
 */
public class Letras {
	//Para que nuestro usuario interactué, definimos un Scanner
	Scanner scanner = new Scanner(System.in);
	
	//Metemos el Scanner dentrode un método
	public String leerEntrada() {
		return scanner.nextLine();
	}
	
	//Método para proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	
	
}
