package fundamentos;
import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un número entero: ");
		int num = sc.nextInt();
		int resto = num % 7;
		int sum = 7 - resto;
		int sol = num + sum;
		System.out.println(num + " + " + sum + "= " + sol);
		
	}

}

