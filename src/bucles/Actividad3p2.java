package bucles;

import java.util.Scanner;

public class Actividad3p2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edades;
		int sumaEdades = 0;
		int numMayoresEdad = 0;
		int numAlumnos = 0;
		double media;
		
		System.out.println("Cuántos alumnos hay: ");
		numAlumnos = sc.nextInt();
		int i = 0;
		
		System.out.println("Introduzca la edad: ");
		edades = sc.nextInt();
		
		while (edades >= 0) {
			
			sumaEdades += edades;
			numAlumnos++;
			
			if (edades >= 18) {
				numMayoresEdad++;
				
			}
			System.out.println("Introduzca edad: ");
			edades = sc.nextInt();
			
		}
		
		media = (double) sumaEdades / numAlumnos;
		
		System.out.println("La suma de las edades de los alumnos es: " + sumaEdades );
		System.out.println("Hay " + numMayoresEdad + " alumnos mayores de edad");
		System.out.println("Media: " + media);
		System.out.println("Número total de alumnos: " + numAlumnos);
	}

}
