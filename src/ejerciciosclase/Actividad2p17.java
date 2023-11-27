package ejerciciosclase;

import java.util.Random;
import java.util.Scanner;

public class Actividad2p17 {

	public static void main(String[] args) {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(1,99);
		int n2 = numAleatorio.nextInt(1,99);
		
		System.out.println(n);
		System.out.println(n2);
		
		System.out.println("Cuánto es la suma de los dos números: ");
		Scanner sc = new Scanner(System.in);
		int respuesta = sc.nextInt();
		
		int sol = n + n2;
		if (respuesta == sol) {
			System.out.println("Has hecho bien la suma");
		} else {
			System.out.println("Vete para primaria que no sabes sumar");
		}
	}

}
