package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;


public class HashSetCollections {

	public static void main(String[] args) {
		// HashSet es una clasede Collections donde cada elemento es único, es decir, no se repiten los elementos.
		HashSet<String> animals = new HashSet<String>();
		
		animals.add("Buho");
		animals.add("Capibara");
		animals.add("Caballo");
		animals.add("Ornitorrinco");
		animals.add("Cebra");
		animals.add("Tigre");
		animals.add("Tigre");
		animals.add("Tigre");
		animals.add("Tigre");
		
		//Imprimir el HashSet
		System.out.println(animals);
		
		//Conocer si un elemento se encuentra dentro del Set: contains();
		System.out.println(animals.contains("Capibara"));
		
		//Eliminar un elemento: remove();
		animals.remove("Cebra"); //Elimino
		System.out.println(animals); //Imprimo el Set sin el elemento eliminado
		
		//Agregando elementos en una sola línea
		animals.addAll(Arrays.asList("Pangolín", "Tepezcuintle"));
		System.out.println(animals);
		
		/*
		 * La clase HashSet no va a garantizarque los elementos semuestren según el orden establecido ya que busca eficientar la busqueda y recuperación de los elementos.
		 * Utiliza tablas Hash para almacenar los elementos y mostrarlos al usuario
		 */
		
		//Limpiar el HashSet
		animals.clear();
		System.out.println(animals);
		
		
		
	}

}
