package bucles.ejemploclase;

import java.util.Scanner;
/** hacemos un bucle que piede números por pantalla al
 * usuario y los suma. El bucle acabará cuando introduzcamos
 * el número cero.
 * 
 */
public class EjemploBucleSumas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int max;
		int min;
		
		System.out.println("Introduce un número distinto de cero para sumar: ");
		System.out.println("Si el número es cero acaba el programa");
		
		num = sc.nextInt();
		max = num;
		min = num;
		
		while (num != 0) {
			
			if (num>max) 
				max = num;
				
			 if (num<min) 
				min = num;
			
			sum = sum + num; // sum+=num
			
			System.out.println("Introduce otro número: ");
			num = sc.nextInt();
			
			
		}
		
		System.out.println("El resultado de la suma es: " + sum);
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);
	}

}
