package bucles;

import java.util.Scanner;

public class Actividad3p1 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Si el número es 0, se acaba el programa");
		System.out.println("Introduzca un número: ");
		
		num = sc.nextInt();
		
		
		while (num != 0) {
			
			if (num % 2 == 0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
			
			if (num > 0) {
				System.out.println("El número es positivo");
			} else {
				System.out.println("El número es negativo");
			}
			
			int cuadrado = num *  num;
			
			System.out.println("El cuadrado de " + num + " es " + cuadrado);
			
			System.out.println("Introduzca otro número:");
			num = sc.nextInt();
			
		}
		
	}

}
