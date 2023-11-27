package bucles.ejemploclase;

import java.util.Scanner;

public class EjemploDoWhileSumas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE ;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Introduce un número distinto de cero para sumar: ");
		System.out.println("Si el número es cero acaba el programa");
		
		do {
			
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			sum+=num;
			
			if (num>max && num!= 0) 
				max = num;
				
			if (num<min && num!= 0) 
				min = num;
			
			sum = sum + num; // sum+=num
			
			
		} while (num != 0);
		
		System.out.println("El resultado de la suma es: " + sum);
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);
		
		
	} 
	
	

}
