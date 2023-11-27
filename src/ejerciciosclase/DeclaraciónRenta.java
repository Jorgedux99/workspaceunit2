package ejerciciosclase;

import java.util.Scanner;

public class DeclaraciónRenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es el valor de tu renta anual: ");
		int rentaAnual = sc.nextInt();
		
		if (rentaAnual <= 10000) {
			System.out.println("El tipo de impositivo que le corresponde es de un 5% ");
		} else if ((rentaAnual > 10000) && (rentaAnual <= 20000)) {
			System.out.println("El tipo de impositivo que le corresponde es de un 15% ");	
		} else if ((rentaAnual > 20000) && (rentaAnual <= 35000)) {
			System.out.println("El tipo de impositivo que le corresponde es de un 20% ");
		} else if ((rentaAnual > 35000) && (rentaAnual <= 60000)) {
			System.out.println("El tipo de impositivo que le corresponde es de un 30% ");
		} else if (rentaAnual > 60000) {
			System.out.println("El tipo de impositivo que le corresponde es de un 45% ");
		}
		 
		
		

	}

}
