package org.generation.overloading;

public class SumaMain {
	public static void main(String[] args) {
		//Invocamos el método de tipo static mediante su clase y no mediante la instancia de un objeto
		int suma1 = Suma.sumar(8, 5);
		double suma2 = Suma.sumar(4.3, 6.26);
		
		System.out.println("La suma de enteros me da " + suma1);
		System.out.println("La suma de decimales me da " + suma2);

	}
}