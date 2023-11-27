package Ejemplosclase;

public class EjemploDivisionEntera {

	public static void main(String[] args) {
		
		int num1 = 3;
		
		int num2 = 9;
		
		//división entera, cuidado que si el dividendo es más
		//pequeño que el divisor nos da cero
		System.out.println(num1/num2);
		
		//división decimal con enteros
		
		System.out.println(num1/(num2*1.0));
		System.out.println(num1/(double) num2);
		System.out.println((double) num1 / num2);
		System.out.println((double) (num1/num2));
		
		
	}

}
