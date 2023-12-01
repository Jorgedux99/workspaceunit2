package bucles;

import java.util.Scanner;

public class Ejercicio10BuclesAnidados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int filas = 0;
		int columnas = 0;
		
		System.out.println("Cuantas filas tiene la tabla: ");
		filas = sc.nextInt();
		System.out.println("Cuantas columnas tiene la tabla: ");
		columnas = sc.nextInt();
		
		for (int i = 1; i<=filas; i++) {
			
		
			for ( int j = 1; j<=columnas; j++) {
				
				System.out.print("# \t");
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
