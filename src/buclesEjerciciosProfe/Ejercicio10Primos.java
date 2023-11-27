package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio10Primos {

	public static void main(String[] args) {
		
		//suponemos que el número es primo
		boolean esPrimo = true;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para saber si es primo: ");
		
		
		num = sc.nextInt();
		
		// si el número no es primo no me hace seguir
		//en el bucle, me salgo
		
		for (int i=2; i<num; i++) {
			
			// si encontramos un número entre 2
			//y el (número - 1) que es divisor
			// ya no es primo
			
			if (num%i == 0)
				esPrimo = false;
			//el break es poco elegante
			//break;
		}
		if (esPrimo)
		System.out.println("El número " + num + " es primo: ");
		else
			System.out.println("El número " + num + " no es primo ");
	}

}
