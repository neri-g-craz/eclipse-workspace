package ecommerce;


import java.util.ArrayList;
import java.util.List;



public class Ecommerce {
	static class Producto { //Esta es una clae para represeentar un producto
		String nombre;
		double precio;
		
		Producto (String nombre, double precio){
			
			this.nombre=nombre;
			this.precio=precio;
		}
		
	}
		static class CarritoCompra {
			List<Producto> productos = new ArrayList<>();
			
			
			void agregarProducto (Producto terranator) {
				productos.add(terranator);
			}
			double calcularTotal() {
				double total = 0;
				for(Producto terranator : productos) {
					total += terranator.precio;
				}
				return total;
		}
		
		
	}
	
	public static void main(String[] args) {
		Producto carrito = new Producto ("Turbomotores", 98.70);
		Producto carrito2 = new Producto ("Traccion 4x4", 85.40);
		
		CarritoCompra carritoC = new CarritoCompra();
		
		carritoC.agregarProducto(carrito);
		carritoC.agregarProducto(carrito2);
		
		double totalCarrito = carritoC.calcularTotal ();
		System.out.println("Total del carrito: $" + totalCarrito);

		
	}

}

