package ejerciciosclase;

import java.util.Scanner;

public class SistemaDeCoordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para la x: ");
		int x = sc.nextInt();
		System.out.println("Introduce un número para la y: ");
		int y = sc.nextInt();
		
		
		if ((x > 0) && (y > 0)) {
			System.out.println("La coordenada: " + "(" + x + "," + y + ") está en el primer cuadrante");
			
		} else if ((x > 0) && (y < 0)) {
			System.out.println("La coordenada: " + "(" + x + "," + y + ") está en el cuarto cuadrante");
			
			
		} else if ((x < 0) && (y < 0)) {
			System.out.println("La coordenada: " + "(" + x + "," + y + ") está en el tercer cuadrante");
			
		} else if ((x < 0) && (y > 0)) {
			System.out.println("La coordenada: " + "(" + x + "," + y + ") está en el segundo cuadrante");
		
		} else if ((x == 0) && (y == 0)) {
			System.out.println("La coordenada: " + "(" + x + "," + y + ") está en el centro del cuadrante");
	}
	}
}