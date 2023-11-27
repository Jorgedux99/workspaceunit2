package buclesEjerciciosProfe;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int i = 0;
		
		while (i != num) {
			
			System.out.println("vuelta " + (i + 1));
			i = i + 1;
			
		}
		
	}

}
