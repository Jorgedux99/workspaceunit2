package Ejemplosclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; 
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		switch (num) {
		
		case 1 -> 
		System.out.println("Has introducido el 1");
		
		case 2 -> { System.out.println("Has introducido el 2");
		
			System.out.println("Aquí si hace falta las llaves");
		}

		
		default -> System.out.println("Has introducido otro número distinto de 1 y 2");
		
		
		}
		
	}

}
