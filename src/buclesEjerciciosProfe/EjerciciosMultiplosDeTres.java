package buclesEjerciciosProfe;

import java.util.Scanner;

public class EjerciciosMultiplosDeTres {
	// El programa va a coger un número n por pantalla
	// y va a mostrar desde n hasta 3 todos los múltiplos de tres
	//Primera Versión
	//normal con decremento 1
	//Segunda Versión
	//Pensando como mejorar el algoritmo con programación dinámica
	// para hacer decremento 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int nAux=0;
		int multTresCercano;
		
		System.out.println("Introduce un número: ");
		
		System.out.println("Version fuerza bruta");
		n = sc.nextInt();
		
		for (int i = n; i>=3; i--) {
			
			if (i%3 == 0) {
				System.out.print(i + ", ");
				
			}
				
			}
			
		// version eficiente
					System.out.print("Versión eficiente :");
					
					multTresCercano = n-(n%3);
					
					for (int i = multTresCercano; i>=3; i=i-3) {
						System.out.print(i + ", ");
						
			
		}
		
		

	}

}
