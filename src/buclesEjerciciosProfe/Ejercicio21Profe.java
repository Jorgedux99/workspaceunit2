package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio21Profe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int serie = 0;
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		for (int i = 0; i<=num; i++) {
			
			serie = (5 * i) - 3;
			System.out.println("a" + i + " = " + serie);
			
			
			
			
		}
	}

}
