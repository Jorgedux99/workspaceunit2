package Ejemplosclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevoAsignado2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; 
		int resultado;
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		resultado =switch (num) {
		
		case 1 -> num + 1;
		
		
		
		case 2 -> { System.out.println("Has introducido el 2");
		
			System.out.println("Aquí si hace falta las llaves");
			yield num + 2;
			
		}

			default -> 7;
		
		};
		
		
	}

}
