package EjerciciosRecursion;

public class EjerciciosRecursion {
	
	public static int sumaNPrimerosNumeros(int n) {
		
		
		
        if (n == 0) 
            return 0;
    
            return n + sumaNPrimerosNumeros(n - 1);
	        
	    }
		
	public static void numerosNhastaUno(int n) {
		
		if (n==0)
			return;
		
		else {
			numerosNhastaUno(n - 1);
			
			System.out.println(n);
		}
		
		
		
		return;
		
	}
	
	public static int contDigitos(int n) {
		
		if (n == 0) {
			
			return 0;
		}
		else {
			return 1+ contDigitos(n/10);
			
		}
		
		private static int reverseNumberAux(int n, int result) {
			
			int digit = 0;
			
			if (n==0) {
				return result;
			} else {

				digit = n % 10;
				
				result = digit + result * 10;
				
				n = n/10;
				return reverseNumberAux(n,result);				
			}
		}
	
		public static int sumaNPrimerosNumerosAux (int n, int acumulador) {
			
			if (n==0)
				return acumulador;
			else 
				return sumaNPrimerosNumerosAux(n-1, acumulador+n);
			
		}
		
		public static int sumaNPrimerosNumerosMejorado (int n) {
			
			
			return sumaNPrimerosNumerosAux(n,0);
			
			
			
		}
		
		public static int terminoFibonacci (int n) {
			
			if (n==0 || n==1) {
				
				return 1;
			} else {
				
				return terminoFibonacci(n-1) + terminoFibonacci (n-2);
			}
			
		}
	
	public static void main(String[] args) {
		
		
	     System.out.println(sumaNPrimerosNumeros(7));
	       
	     numerosNhastaUno(5);  
	     
	     System.out.println();
	     
	     numerosNhastaUno(5);
	     
	     System.out.println();
	
	     System.out.println(contDigitos(1234));
	}

}
