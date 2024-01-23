package ecommerce;

import java.util.Scanner;
public class FunciónDescuento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el costo del producto");//Obtener el precio del producto
		double precioProducto = scanner.nextDouble();
		
		double porcentajeDescuento = 70; //Obtener el porcentaje de descuento
		double descuento = calcularDescuento(precioProducto, porcentajeDescuento);
		
		double porcentajeImpuesto= 16;//Obtener elimpuesto
		double impuesto = calcularImpuesto (precioProducto, porcentajeImpuesto);
		
		double total = calcularTotal(precioProducto, descuento, impuesto);//Calcular el total
		total= redondear(total,2);
		
		System.out.println("Precio del producto: $" + precioProducto);
		System.out.println("Descuento aplicado al producto: $" + descuento);
		System.out.println("Impuesto aplicado: $" + impuesto);
		System.out.println("Total a pagar: $" + total);
		
		scanner.close();
	
	}
		static double calcularDescuento (double precioProducto, double porcentajeDescuento){//Función para calcular el descuento
		return (precioProducto * porcentajeDescuento)/100;}

		static double calcularImpuesto (double precioProducto, double porcentajeImpuesto){//Función para calcular el impuesto
		return (precioProducto * porcentajeImpuesto)/100;}
		
		static double calcularTotal (double precioProducto, double descuento, double impuesto){//Función para calcular el descuento
		return (precioProducto - descuento) + impuesto;}
		
		static double redondear (double valor, int decimales ) {
			
			double factor = Math.pow(10, decimales);
			return Math.round(valor*factor)/factor;
		}
		
	}
/*La refactorización es reestructurar código que ya xiste sin alterar su 
 comportamiento. Tiene como objetivo mejorar la legibilidad, mantenibilidad y optimizacion de nuestro codigo
 */

