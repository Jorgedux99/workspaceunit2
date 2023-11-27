package bucles.ejemploclase;

import java.util.Scanner;

public class Ejercicio3refuerzo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String modeloCoche;
		int precio = 0;
		int numCoches = 0;
		int precioMax;
		int precioMin;
		double media = 0.0;
		int sumPrecios = 0;
		
		precioMax = precio;
		precioMin = precio;
		
		System.out.println("Cual es el modelo del coche: ");
		modeloCoche = sc.next();
		
		System.out.println("Introduzca el precio del coche: ");
		precio = sc.nextInt();
		
		while(precio > 0) {
			
			numCoches++;
			sumPrecios += precio;
			
			if (precioMax<=precio) {
				precioMax = precio;
			}
			
			if (precioMin>=precio) {
				precioMin = precio;
			}
			
			System.out.println("Cual es el modelo del coche: ");
			modeloCoche = sc.next();
			
			System.out.println("Introduzca el precio del coche: ");
			precio = sc.nextInt();
			
		}
		
		if (precio == 0) {
			System.out.println("Hay " + numCoches + " coches");
			System.out.println("El coche más caro cuesta: " + precioMax + " euros");
			System.out.println("El coche más barato cuesta: " + precioMin + " euros");
			System.out.println("La media de los precios de los coches es de: " + sumPrecios / numCoches  + " euros");
		}
		
		
	}

}
