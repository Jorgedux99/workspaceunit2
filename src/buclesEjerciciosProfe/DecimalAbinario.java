package buclesEjerciciosProfe;

import java.util.Scanner;

public class DecimalAbinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int nAux;
		int contadorExponente = 0;
		int cifra =0;
		double numDecimal = 0.0;
		int cadenaBinaria = 0;
		
		System.out.println("Introduzca el número decimal para pasar a binario: ");
		n = sc.nextInt();
		
		nAux = n;
		
		while (nAux!=0) {
			
			cifra = nAux%2;
			nAux=nAux/2;
			cadenaBinaria = cifra + cadenaBinaria;
			
		}
		
		System.out.println("El número " + n + " en binario es " + cadenaBinaria);
	}

}
