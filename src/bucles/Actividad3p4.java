package bucles;

import java.util.Scanner;

public class Actividad3p4 {
	// El programa termina cuando se introduce -1
	// El programa nos pide el árbol más alto = un máximo -> maxAltura
	// Hay que quedarse también con la etiqueta del árbol, que será 0,1,2,3,4..., n ->
	// -> es decir una variable contador -> etiqueta y maxAlturaEtiqueta -> la etiqueta del árbol más alto
	
	/*
	 * alturas introducidas 12, 15, 8, 10
	 * etiqueta              0   1  2   3
	 * 
	 * la etiqueta la tenog que poner yo
	 * lo hago con una variable contador llamda etiqueta
	 * que empieza en el cero
	 * 
	 * me voy a quedar con el arbol de mayor altura
	 * voy a guardar la altura en maxAltura y la etiqueta del
	 * arbol en maxEtiqueta
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int altura = 0;
		int maxAltura = 0;
		int etiqueta = 0;
		// el primer máximo es la primera etiqueta, el primer arbol, 0
		int maxEtiqueta = etiqueta;
		
		System.out.println("Introduce una altura para el árbol: ");
		altura = sc.nextInt();
		
		while (altura != -1) {
			// árbol más alto
			if ( altura > maxAltura) {
				
				maxAltura = altura;
				maxEtiqueta = etiqueta;
			
			}
			etiqueta++;
			System.out.println("Introduce una altura para el árbol: ");
			altura = sc.nextInt();
		}
		
		System.out.println("El arbo con etiqueta " + maxEtiqueta + " tiene de altura " + maxAltura);
		
		
	}

}
