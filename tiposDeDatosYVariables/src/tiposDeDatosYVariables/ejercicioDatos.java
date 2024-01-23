package tiposDeDatosYVariables;

public class ejercicioDatos {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");



		/*Comentarios
		 * multilinea*/
		
		//comentarios de una sola linea 
		
		byte edad = 15;//Sirve para representar un numero entero 8bits (-128 al 127)
		
		System.out.println("Edad del participante"+edad);
		
		short usuariosNuevos = 200;//Sirve para representar un numero entero 16 bits (-23768 al 32767)
		
		System.out.println("Usuarixs nuevos: " +usuariosNuevos);
		
		int usuariosTotales = 8752;// sirve para representar un numero entero 32 bits (-2147483648 al 2147483647)
		
		System.out.println("Usuarios totales: " +usuariosTotales);
		
		long usuariosPremium = 9512l;// sirve para representar un numero entero con valores mucho mayores
		
		System.out.println("Usuarios premium: " +usuariosPremium);
		
		//Tipos de datos con numero decimales 
		
				float altura = 1.61f;//Sirve para representar un valor numerico con numeros decimales, cuyo valor es de 23 bits, puede tener 8 caracteres despues del punto decimal y que tiene que llevar una f al final
				
				System.out.println("Altura del usuarix: "+altura);
				
				double peso = 68.2d;//Sirve para representar valores numericos con decimales, cuyo valor es de 64 bits y puede tener hasta quince caracteres despues del punto decimal.
				
				System.out.println("Peso del usuarix: "+peso);
				
				String costoBoleto = "500";//Es una clase para tener cadenas de texto
				String zonaBoleto = "52";
				System.out.println("Usuarix "+costoBoleto);
				System.out.println("Zona a la que pertenece "+zonaBoleto);
				
				char seccion = 'f'; //Sirve para representar valores con un solo caracter
				
				System.out.println("Sección: "+seccion);
				
				boolean clienteFrecuente = true; //Sirve para obtener true o false utilizando condicionales
				
				System.out.println("Es un cliente frecuente: "+clienteFrecuente);

				
				//Conversion de tipos
				//Casteo a entero
				
				int pesoCambio = (int) peso;
				
				//casteo entero
				long pesoCambio1 = (long) peso;
				
				System.out.println("double: "+peso);
				System.out.println("int: "+pesoCambio);
				System.out.println("long: "+pesoCambio1);
				
				int nombreCambnio = Integer.parseInt(costoBoleto); 
				double zonaCambio = Double.parseDouble(zonaBoleto);
				
				System.out.println("Zona del usuarix segun su boleto: "+usuariosPremium);
				
				//Operadores aritmmeticos
				/*Operadores de comparación
				 == compara si un operando es igual a otro				 
				 != compara si es diferente
		 		<  mayor que 
		 		>  menor que 
		 		<= mayor o igual que 
		 		>= menor o igual que */
				
				
				
				
				/*
	   		 	10 Salas
				50 asientos / sala
				Precio Boleto = $75.50
				Precio Palomitas = $89.70
				Bebidas = $35.50
				 */
				
				byte cantidadSalas = 10;
						
				System.out.println("Hay: "+cantidadSalas+" Salas");
				
				byte cantidadAsientos = 50;
				
				System.out.println("Hay: "+cantidadAsientos+" asientos en cada sala");
				
				float precioBoleto = 75.50f;
				
				System.out.println("Cada boleto cuesta: $"+precioBoleto);
				
				float precioPalomitas = 89.70f;
				
				System.out.println("Las palomitas cuestan: $"+precioPalomitas);
				
				float precioChesco = 35.50f;
				
				System.out.println("El refresco grande cuesta: $"+precioChesco);
				
				int capacidadTotal = cantidadSalas * cantidadAsientos;
				
				int personasDentro = 342;
				
				if (personasDentro > capacidadTotal) {
					System.out.println("Aforo lleno");
				}
					
				
				double totalEntrada = personasDentro * precioBoleto;
				double totalPalomitas = personasDentro * precioPalomitas;
				double totalBebidas = personasDentro * precioChesco;
				
				
				System.out.println("Total de personas: "+ personasDentro);
				System.out.println("Total de entradas: $"+ totalEntrada);
				System.out.println("Total de palomitas: $"+ totalPalomitas);
				System.out.println("Total de bebidas: $"+ totalBebidas);


				
				
				
				
				
				
				
		
		
	}
}