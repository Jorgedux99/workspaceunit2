package buclesEjerciciosProfe;

import java.util.Scanner;

public class ParesDesdeNhastaCero {

	public static void main(String[] args) {
		
		//vamos a mostrar los pares desde N hasta cero
		
	
		int num = 0;
		int numAux= 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para mostrar pares hasta el cero");
		
		num = sc.nextInt();
		
		numAux = num;
		if (numAux%2!=0)
			numAux--;
		
		
		System.out.println("Los número pares entre " + num + " y cero son: ");
		for (int i = numAux; i>=0; i=i-2) {
			if (i==0)
					System.out.println(i);
			else
				System.out.println(i+ ", ");
			
		}
		
		
	}

}
