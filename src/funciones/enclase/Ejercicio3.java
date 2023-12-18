package funciones.enclase;

import java.util.Scanner;

public class Ejercicio3 {

	static double TemperaturaMedia(double min, double max) {
		
		return (max+min)/2;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double minimo = 0.0;
		double maximo = 0.0;
		System.out.println("Introduzca el número de días para hacer la media de temperatura: ");
		
		int dias = sc.nextInt();
		
		for (int i = 0; i<=dias; i++) {
			
			System.out.println("Introduce la temperatura mínima: ");
			minimo = sc.nextDouble();
			System.out.println("Introduce la temperatura máxima: ");
			maximo = sc.nextDouble();
			
			System.out.println("La temperatura media es de: " + TemperaturaMedia(minimo, maximo) + " grados "); 
			
		}
	}

}
