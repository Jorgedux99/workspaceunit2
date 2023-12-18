package funciones.enclase;

import java.util.Scanner;

public class FuncionesVariados {

	
	static void nombreEnPantalla(String nombre) {
		
		
		System.out.println("Hola " + nombre + " ¿Cómo estás?");
		
		
	}
	
	static boolean esMultiplo(int num1, int num2) {
		
		
		return num1%num2 == 0;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.println("Cual es tu nombre:");
		nombre = sc.next();
		
		nombreEnPantalla(nombre);	

		int num1, num2;
		System.out.println("Pon un número: ");
		num1 = sc.nextInt();
		System.out.println("Pon otro número: ");
		num2 = sc.nextInt();
		
		boolean esMult = esMultiplo(num1, num2);
		System.out.println(num1 + " y " + num2 + " son multiplos: " + esMult);
	}

}
