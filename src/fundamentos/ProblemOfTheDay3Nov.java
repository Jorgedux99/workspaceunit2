package fundamentos;
import java.util.Scanner;

public class ProblemOfTheDay3Nov {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your first trimester grade: ");
		double nota1 = sc.nextDouble();
		System.out.println("Write your second trimester grade: ");
		double nota2 = sc.nextDouble();
		System.out.println("Write your third trimester grade: ");
		double nota3 = sc.nextDouble();
		
		int mediaE = (int) ((nota1 + nota2 + nota3) / 3);
		Double mediaD = (double) ((nota1 + nota2 + nota3) / 3);
		
		System.out.println("The result without decimals is: " + mediaE);
		System.out.println("The result with decimals is: " + mediaD);
		
	}

}
