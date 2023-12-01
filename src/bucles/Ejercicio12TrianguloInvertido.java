package bucles;

import java.util.Scanner;

public class Ejercicio12TrianguloInvertido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int altura = 0;
		int i = 0;
		int j = 0;
		
		System.out.println("Introduzca un número para la altura del triángulo: ");
		altura = sc.nextInt();
		
		for (i = 1; i<=altura; i++) {
			
			for (j = 1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		