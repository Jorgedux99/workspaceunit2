package funciones.enclase;

import java.util.Scanner;

public class ProgramaMedia {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}

	static double constanteSiete () {
		
		
		return 7.0;
		
	}
		
	 static double funcionPow (int base, int exponente) {
		
		double resultado = 1;
		
		for (int i=1; i<= exponente ;i++) {
			
			resultado*=base;
		}
		
		return resultado;
	}
	
	
	static long factorial (int n) {
		
		return 1;
		
		
	}
	
	static int sumaNnumerosEnRango (int min, int max) {
		
		
		int resultado = 0;
		
		return resultado;
	}
	
	static int sumaNnumeroParesEnRango (int min, int max) {
		
		int resultado = 0;
	
		if (min%2==1)
			
		min++;
		
		for (int i=min; i<=max; i+=2) {
			
			resultado +=1;
		}
		
		return resultado;
	}
	
	static boolean esMayor (int a, int b) {
		
		return a>b?true:false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result=media(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		System.out.println( "La media es:" + result) ;

		sumaNnumerosEnRango(num1, num2);
	}

}

