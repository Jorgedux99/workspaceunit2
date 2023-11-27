package bucles.ejemploclase;

import java.util.Scanner;

public class MaximoMinNotas {

	/**
	 *  sum -> acumulador
	 * 
	 * media = sum/numAlumnos
	 * int maxNota | String nombreAlumnoMax
	 * int minNota | String nombreAlumnoMin
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numAlumnos = 0; 
		int maxNota = 0;
		int minNota = 10;
		int notaAlumno;
		int sumNotas = 0;
		
		double media = 0.0;
		
		String nombreAlumno;
		String nombreAlumnoMax;
		String nombreAlumnoMin;
		String curso;
		
		System.out.println("Introduce el curso");
		curso = sc.nextLine();
		
		
		System.out.println("Introduzca el nombre del alumno: ");
		nombreAlumno = sc.next();
		
		nombreAlumnoMin= nombreAlumno;
		nombreAlumnoMax= nombreAlumno;
		
		
		System.out.println("Introduzca la nota del alumno: ");
		notaAlumno = sc.nextInt();

		numAlumnos++;
		sumNotas += notaAlumno;
		
		while (!nombreAlumno.equals("fin")) {
			
			if (notaAlumno>=maxNota) {
				maxNota=notaAlumno;
				nombreAlumnoMax= nombreAlumno;
				
			}

			if (notaAlumno<=minNota) {
				minNota=notaAlumno;
				nombreAlumnoMin= nombreAlumno;
				
			}
			System.out.println("Introduzca el nombre del alumno: ");
			nombreAlumno = sc.next();
			
			System.out.println("Introduzca la nota del alumno: ");
			notaAlumno = sc.nextInt();
			
			
			
		}
		
		if (numAlumnos>0) {
			
			System.out.println("Curso " + curso ); 
			System.out.println("Alumno con máxima nota: " + nombreAlumnoMax + " Nota " + maxNota);
			System.out.println("Alumno con mínima nota: " + nombreAlumnoMin + " Nota " + minNota);
			System.out.println("Media de notas: " + sumNotas / numAlumnos);
			
			
		}
		
	}

}
