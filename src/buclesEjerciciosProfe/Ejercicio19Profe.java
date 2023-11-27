package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio19Profe {

	//1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/n terms
	//A1 = 1/1
	//A2 = 1/2
	//A3 = 1/3
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double sum = 0;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			
			if (i==num)
				
				System.out.println(1.0/i);
			else 
				
			System.out.print(1.0/i + ", ");
			sum = sum + 1.0/i;
			
			
		}
		
		System.out.print(" the sum of the first n harmonic terms is: " + sum);
		
		
		
		

	}

}
