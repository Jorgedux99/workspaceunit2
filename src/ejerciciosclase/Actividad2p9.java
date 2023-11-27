package ejerciciosclase;

import java.util.Scanner;

public class Actividad2p9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 0 y 99.999: ");
		int num = sc.nextInt();
		
		if (num/10 < 1) {
			System.out.println("El número solo tiene una cifra");
			
		} else if (num/10 < 10) {
			System.out.println("El número tiene dos cifras");
			
		} else if (num/100 < 10) {
			System.out.println("El número tiene tres cifras");
			
		} else if (num/1000 < 10) {
			System.out.println("El número tiene cuatro cifras");
			
		} else if (num/10000 < 10) {
			System.out.println("El número tiene cinco cifras");
			
		} else if (num/100000 < 10) {
			System.out.println("El número tiene más de 5 cifras");
			
		}
	}
}
