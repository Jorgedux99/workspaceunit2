package ejerciciosclase;

import java.util.Scanner;

public class DiaDeLaSemana {
	// Pedir al usuario un número del 1 al 7 y que se corresponda a un día
	// de la semana. Si pone un número de +7, que escriba que no hay más días.
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número del 1 al 7: ");
		num = sc.nextInt();
		
		switch (num) {
		
		case 1 -> 
		System.out.println("Lunes");
		
		case 2 -> 
		System.out.println("Martes");
		
		case 3 -> 
		System.out.println("Miércoles");
		
		case 4 ->
		System.out.println("Jueves");
		
		case 5 ->
		System.out.println("Viernes");
		
		case 6 ->
		System.out.println("Sábado");
		
		case 7 ->
		System.out.println("Domingo");
		
		
		}
		
		if (( num > 7) || (num <= 0)) {
			System.out.println("No hay 0 o más de 7 días en la semana, el número no es válido");	
		}
		
	
		
		
		
		
		
	}

}
