package funciones;

public class Ejercicio7y22Funciones {

	static double potencia(double base, double  exponente) {
		double resultado=1;
		
		for (long i=0 ; i<exponente ; i++) {
			
			resultado*=base;
			
		}		
		return resultado;
		
		
	}
	
	static double factorial(double numFact) {
		double resultado=1;
		
		for (long i=1 ; i<=numFact ; i++) {
			
			resultado*=i;
			
		}		
		return resultado;		
		
	}
	
	static double nTermino (long x, long n) {
			
		double res =potencia(x,n)/ factorial(n);
		
		return res;
		
	}
	
		
	
	
	static double funcionE (long x, long precision) {
		double sumaTerminos=0.0;
		
		for(long i=0; i<=precision ; i++ ) {
			
			//sumaTerminos+= potencia(x,i)/ (double) factorial(i);
			sumaTerminos+= nTermino(x,i);
						
		}
		
		
		return sumaTerminos;
	}

	static double terminoSen (long x, long n) {
		int signo=1;
		if (n%2==0)
			   signo=1;
		   else
			   signo=-1;
		
		return signo * potencia(x,2*n+1)/ factorial(2*n+1);
	}
	static double senX(long x, long precision) {
		
		
		double sumaTerminos=0.0;
		//int signo=1;
		for(long i=0; i<=precision ; i++ ) {
			
			/*
		   if (i%2==0)
			   signo=1;
		   else
			   signo=-1;
			   
			   */
			
			//sumaTerminos+= signo * potencia(x,2*i+1)/ factorial(2*i+1);
		   
			sumaTerminos+= terminoSen(x,i);
			
						
		}
		
		return sumaTerminos;
	}
	
	static double terminoCon (double x, double n) {
		
		double signo=1;
		if (n%2==0)
			signo = 1;
		else 
			signo =-1;
		
		return signo * potencia(x, 2*n)/factorial(2*n);
		
	}
	
	static double conX (double x, double precision) {
		
		double sumaTerminos = 0.0;
		
		for (double i = 0; i<=precision; i++) {
			
			sumaTerminos+= terminoCon(x,i);
			
		}
		return sumaTerminos;
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(" potencia " + potencia(2,5));
		System.out.println(" potencia " + factorial(5));
		
		System.out.println(" E elevado 5 precision 20: " + funcionE(5,20));
		System.out.println(" E elevado 5 precision 30: " + funcionE(5,100));

	}

}
