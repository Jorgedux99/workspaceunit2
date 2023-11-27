package ejerciciosclase;

import java.util.Scanner;

public class Ejercicio2p14 {
	
	

	public static void main(String[] args) {
		
		String unidades ="";
		String decenas ="";
		String resultado ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para convertir a texto: ");
		int num = sc.nextInt();
		
		int u = num % 10;
		int d = num / 10;
	
		unidades = switch (u) {
		case 0 -> "cero";
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		default ->"";
		
		};
		
		if (d!= 0) {
			
			decenas= switch (d) {
			case 1 -> "diez";
			case 2 -> "veinte";
			case 3 -> "treinta";
			case 4 -> "cuarenta";
			case 5 -> "cincuenta";
			case 6 -> "sesenta";
			case 7 -> "setenta";
			case 8 -> "ochenta";
			case 9 -> "noventa";
			default ->"";
			};
			
		}
		
		if (d!=0) {
			
			resultado = decenas + " y " + unidades;
			
		} else {
			
			resultado = unidades;
		}
		
		System.out.println("El número " + num + " se escribe: " + resultado);
	
	}

}
		
		