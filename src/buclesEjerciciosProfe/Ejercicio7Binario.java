package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio7Binario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int nAux;
		int contadorExponente = 0;
		int cifra =0;
		double numDecimal = 0.0;
		System.out.println("Introduzca el número binario a pasar a decimal: ");
		n = sc.nextInt();
		
		nAux = n;
		
		while (nAux!=0) {
			cifra = nAux%10;
			
			
			if (cifra!=0)
			
			numDecimal = numDecimal + cifra*Math.pow(2.0, contadorExponente);
			nAux = nAux/10;
			contadorExponente++;
			
		}
		
		System.out.println("El número binario " + n + " en decimal es " + numDecimal);
		
	}

}
