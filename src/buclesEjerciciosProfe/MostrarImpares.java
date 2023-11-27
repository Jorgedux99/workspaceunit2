package buclesEjerciciosProfe;

import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		
		
		//vamos a mostrar los número impartes hasta n
		//n lo recogemos por pantalla
		
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número hasta que hay que mostrar impares");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i=i+2) {
		// averiguamos de antemano la condicion de terminacion
		// para qeu en la última vuleta del bucle
		// tras el ultimo impar no escribamos coma
		
			if (i+2>n)
				System.out.print(i);
			else
				System.out.print(i+",");
		}
		
				
		
	}

}


