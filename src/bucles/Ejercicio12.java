package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int altura = 0;
		
		System.out.println("Introduzca un número para la altura del triángulo: ");
		altura = sc.nextInt();
		int numero = 1;
		
		
		for (int i = 1; i<=altura; i++) {
			
			
			for (int j = 1; j<=i; j++) {
				
				
				System.out.print(numero + "   ");
				numero++;
				
			}
			
			System.out.println();
			
		}

		
		
	}

}
