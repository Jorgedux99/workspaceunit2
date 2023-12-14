package buclesEjerciciosProfe;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {
		

		int n = 0;
		String tree ="";
		int altura = 0;
		int anchura = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del árbol de navidad:");
		
		altura = sc.nextInt();
		anchura = 2*altura -1;
		for (int i = 1; i<=altura; i++) {
			
			for (int j =1; j<=altura -1 + i; j++) {
				
				if (j<=altura-i) {
					
					tree = tree + " ";
				} else {
					
					tree = tree + "*";
				}
				
			}
			
			tree = tree + "\n";
		}
		
		System.out.println(tree);
		
	}

}

		
		
		
