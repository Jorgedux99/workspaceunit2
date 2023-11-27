package buclesEjerciciosProfe;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int Resultado=0;
		System.out.println("Write a number: ");
		n = sc.nextInt();
		
		for (int i=0; i <= n; i++) {
			
			Resultado=i;
			
			System.out.println("The cube of the number " + i + " is = " + Math.pow(Resultado,3));
			
		}
		
		
		
		
	}

}
