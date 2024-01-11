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
