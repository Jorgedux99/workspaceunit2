package buclesEjerciciosProfe;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para factorizar: ");
		int num = sc.nextInt();
		int i = 1;
		int fact;
		
		while (i <= num) {
			
			fact = i * i;
			i = i + 1;
			System.out.println("El factorial de " + num + " es: " + fact);
		}
		
		

	}

}
