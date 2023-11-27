package ejerciciosclase;

import java.util.Scanner;

public class EcuacionSegundoGrado2p8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor para la letra a: ");
		int a = sc.nextInt();
		System.out.println("Introduzca el valor para la letra b: ");
		int b = sc.nextInt();
		System.out.println("Introduzca el valor para la letra c: ");
		int c = sc.nextInt();
		int d = (b * b) + (-4 * a * c) ;
		
		if (d > 0) {
			double x1 = (-b + Math.sqrt(d)) / (2 * a);
			double x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Las soluciones a la ecuación de segundo grado son: " + x1 + " y " + x2);
		
		} else if (d==0) {
			
			double x1 = -b/2 * a;
			System.out.println("La ecuación solo tiene una solución. x1 es: " + x1);
			
		} else {
			
			System.out.println("La ecuacion de segundo grado no tiene solución");	
		}
	}
}
