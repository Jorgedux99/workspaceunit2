package bucles;

public class ForAnidado {

	public static void main(String[] args) {
		
		int result = 1;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("\n" + i + " " + " Por cada vez que se ejecuta el bucle");
			System.out.println("Se ejecuta cuatro el interior");
			System.out.println("numero de entrada para calcular la potencia a la cuarta");
			
			result = 1;
			
			for (int j = 1; j <= 4; j++) {
				
				result *= i;
				System.out.println(j + " " + "iteración del bucle interno");
				j++;
				
				
			}
			
		}
		
		
		

	}

}
