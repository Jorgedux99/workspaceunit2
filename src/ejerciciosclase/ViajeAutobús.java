package ejerciciosclase;

import java.util.Scanner;

public class ViajeAutobús {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos alumnos van al viaje: ");
		int alumnos = sc.nextInt();
		
		if (alumnos <= 30) {
			System.out.println("El coste del autobús es de 4000 euros. ");
		} else if ((alumnos > 30) && (alumnos <= 49)) {
			int coste1 = 95 * alumnos;
			System.out.println("El coste del autobús es de: " + coste1  + " euros y cada persona tiene que pagar 95 euros."  );	
		} else if ((alumnos > 50) && (alumnos <= 99)) {
			int coste2 = 70 * alumnos;
			System.out.println("El coste del autobús es de: " + coste2  + " euros y cada persona tiene que pagar 70 euros."  );	
		} else if (alumnos >= 100) {
			int coste3 = 65 * alumnos;
			System.out.println("El coste del autobús es de: " + coste3  + " euros y cada persona tiene que pagar 65 euros"  );
		}
	}
	
	}