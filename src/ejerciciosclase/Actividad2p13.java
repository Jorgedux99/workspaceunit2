package ejerciciosclase;

import java.util.Scanner;

public class Actividad2p13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuantos kilos de comida diaria se compra en la granja: ");
	int comidaDiaria = sc.nextInt();
	System.out.println("Cuantos animales tienen que alimentar la granja: ");
	int numAnimales = sc.nextInt();
	System.out.println("Cuantos kilos de comida (de media) comen por animal: ");
	int kilosPorAnimal = sc.nextInt();
	
	int kilosTotalesComida = numAnimales * kilosPorAnimal;
	int restoComida = comidaDiaria / numAnimales;
	
		if (kilosTotalesComida == comidaDiaria) {
			System.out.println("Todos los animales tienen comida suficiente");
			
		} else if (kilosTotalesComida > comidaDiaria) {
			System.out.println("Como no hay suficiente comida para todos los animales, la ración nueva para cada uno será de: " + restoComida + " Kilos");
		} else {
			System.out.println("Todos los animales tienen comida suficiente");
		}
	}

}
