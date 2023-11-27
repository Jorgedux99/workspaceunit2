package ejerciciosclase;

import java.util.Scanner;

public class Actividad2p3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un número: ");
			int num1 = sc.nextInt();
			System.out.println("Introduzca otro número: ");
			int num2 = sc.nextInt();
			
			if (num1 > num2) {
				System.out.println(num1 + " es mayor que " + num2);
			} else {
				System.out.println(num2 + " es mayor que " + num1);
			}
			
			
		}

	}
