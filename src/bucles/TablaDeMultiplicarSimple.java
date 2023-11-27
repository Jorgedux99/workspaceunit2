package bucles;

import java.util.Scanner;

public class TablaDeMultiplicarSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coger número por pantalla
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escribe un numero entre 1 y 10:");
		num = sc.nextInt();
		
		// nos quedamos en el bucle hasta que el número
		// sea un número entre 1 y 10
		
		while (num<1 || num>10) {
			System.out.println("Error, debes escribir un número entre 1 y 10:");
			num = sc.nextInt();
			
		}
		
		// calcular su tabla de multiplicar con el for
		
		//Por ejemplo para el 3
		// 3x1=3
		// 3x2=6
		//....
		// 3x10=30
		
		for ( int i=1; i<=10; i++) {
			
			System.out.println("x"+i+"="+ (num*i));
			
		}

	}

}
