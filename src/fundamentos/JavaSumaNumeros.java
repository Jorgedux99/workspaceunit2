package fundamentos;
import java.util.Scanner;


public class JavaSumaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce CAN1: ");
		int CAN1 = sc.nextInt();
		System.out.println("Introduce CAN2: ");
		int CAN2 = sc.nextInt();
		int suma = CAN1 + CAN2;
		System.out.println("La suma de " + CAN1 + " + " + CAN2 + " es de: " + suma);
		

		
	}

}
