package ejerciciosclase;

import java.util.Random;
import java.util.Scanner;

public class Actividad2p18 {

	public static void main(String[] args) {
		Random numAleatorio = new Random();
		int n = numAleatorio.nextInt(1,99);
		int n2 = numAleatorio.nextInt(1,99);
		
		System.out.println(n);
		System.out.println(n2);
		
		System.out.println("Cuánto es la suma de los dos números: ");
		Scanner sc = new Scanner(System.in);
		int respuestaSuma = sc.nextInt();
		
		int suma = n + n2;
		if (respuestaSuma == suma) {
			System.out.println("Has hecho bien la suma");
		} else {
			System.out.println("Vete para primaria que no sabes sumar");
		}
		
		System.out.println("Cuánto es la resta de los dos números: ");
		int respuestaResta = sc.nextInt();
		int resta = n - n2;
		if (respuestaResta == resta) {
			System.out.println("Has hecho bien la resta");
		} else {
			System.out.println("Vete para primaria que no sabes restar");
		}
		
		System.out.println("Cuánto es la multiplicación de los dos números: ");
		int respuestaMulti = sc.nextInt();
		int multi = n * n2;
		if (respuestaMulti == multi) {
			System.out.println("Has hecho bien la multiplicación");
		} else {
			System.out.println("Vete para primaria que no sabes multiplicar");
		}
	}

}