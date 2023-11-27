package ejerciciosclase;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que grados tienes?");
		System.out.println();
		System.out.println("1. Kelvin ");
		System.out.println("2. Fahrenheit ");
		System.out.println("3. Centígrados ");
		System.out.println("Elige entre 1, 2 o 3 ");
		int opcionNumero = sc.nextInt();
		
		switch (opcionNumero) {
		case 1:
			System.out.println("Introduce una temperatura en Grados Kelvin: ");
			double GradosKelvin = sc.nextInt();
			System.out.println("Prefieres transformar la temperatura en grados centígrados o en grados Fahrenheit?");
			System.out.println();
			System.out.println("1. Fahrenheit");
			System.out.println("2. Centígrados");
		int opcionNumero2 = sc.nextInt();
		switch (opcionNumero2) {
		case 1:
			double GradosFa = (((GradosKelvin - 273.15) *9) / 5) + 32;
			System.out.println("Los " + GradosKelvin + " grados Kelvin a grados Fahrenheit son: " + GradosFa + " Grados Fahrenheit");
			break;
		case 2:
			double Gradoscent = GradosKelvin - 273.15;
			System.out.println("Los " + GradosKelvin + " grados Kelvin a grados centígrados son: " + Gradoscent + " Grados centígrados");
			break;
		}
		break;
		case 2:
			System.out.println("Introduce una temperatura en Grados Fahrenheit: ");
			double GradosFa2= sc.nextInt();
			System.out.println("Prefieres transformar la temperatura en grados centígrados o en grados Kelvin?");
			System.out.println();
			System.out.println("1. Kelvin");
			System.out.println("2. Centígrados");
		int opcionNumero3 = sc.nextInt();
		switch (opcionNumero3) {
		case 1:
			double GradosKelvin2 = (((GradosFa2 - 32) * 5) / 9) + 273.15;
			System.out.println("Los " + GradosFa2 + " Fahrenheit a grados Kelvin son: " + GradosKelvin2 + " Grados Kelvin");
			break;
		case 2:
			double Gradoscent2 = (((GradosFa2 - 32) * 5) / 9);
			System.out.println("Los " + GradosFa2 + " grados Fahrenheit a grados centígrados son: " + Gradoscent2 + " Grados centígrados");
			break;
		default: 
			System.out.println("No ha introdución una opción contemplada en el menú");
			break;
		}
		break;
		
		case 3:
			System.out.println("Introduce una temperatura en Grados centígrados: ");
			double Gradoscent3= sc.nextInt();
			System.out.println("Prefieres transformar la temperatura en grados Fahrenheit o en grados Kelvin?");
			System.out.println();
			System.out.println("1. Kelvin");
			System.out.println("2. Fahrenheit");
		int opcionNumero4 = sc.nextInt();
		switch (opcionNumero4) {
		case 1:
			double GradosKelvin3 = (((Gradoscent3 - 32) * 5) / 9) + 273.15;
			System.out.println("Los " + Gradoscent3 + " centígrados a grados Kelvin son: " + GradosKelvin3 + " Grados Kelvin");
			break;
		case 2:
			double GradosFa3 = ((Gradoscent3 * 9) / 5) + 32;
			System.out.println("Los " + Gradoscent3 + " grados centígrados a grados Fahrenheit son: " + GradosFa3 + " Grados Fahrenheit");
			break;
		default: 
			System.out.println("No ha introdución una opción contemplada en el menú");
			break;
		}
		break;
		default: 
			System.out.println("No ha introdución una opción contemplada en el menú");
			break;
		}
	}
}