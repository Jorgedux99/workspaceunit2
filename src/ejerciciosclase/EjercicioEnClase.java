package ejerciciosclase;

import java.util.Scanner;

public class EjercicioEnClase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad de la persona: ");
		int edad = sc.nextInt();
		
		if (edad>= 18) {
			System.out.println("La persona es un adulto");
			
			if (edad>66)
				
				System.out.println("Ademas la persona es un jubilado");
	}
		else {
			System.out.println("La persona es menor de edad");
			if (edad>13) {
				
				System.out.println("Ademas la persona es un adolescente");
			} else if (edad>3) {
				
				System.out.println("Ademas la persona es un niño");
			}
			else {
				
				System.out.println("Además la persona es un bebe");
			}
		}
	}		
}
