package ejerciciosclase;

import java.util.Scanner;

public class Actividad2p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los dos números son iguales");
		} else {
			System.out.println("Los dos números no son iguales");
		}
		
		
	}

}
