package buclesEjerciciosProfe;

import java.util.Scanner;

public class MostrarNimpares {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número n de impares que vamos a mostrar: ");
		n = sc.nextInt();
		
		// vamos a mostrar los n primermos numeros impares
		// n lo recogemos por patnalla hacerlo con un while
		// para n= 5 --- 1,3,5,7,9
		// la condicion de acabado es i=9 i<=2*5-1
		//para n = 6 --- 1,3,5,7,9,11
		//la condicion de acabado es i=11  i<=2*-1
		// para cualquier n i<= 2*n-1
		
		for (int i=1; i<=(2*n-1); i=i+2) {
			// averiguamos de antemano la condicion de terminacion
			// para qeu en la última vuleta del bucle
			// tras el ultimo impar no escribamos coma
			
				if (i+2> (2*n-1))
					System.out.print(i);
				else
					System.out.print(i+",");
			}


	}

}
