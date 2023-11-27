package ejerciciosclase;

import java.util.Scanner;

public class CompañiaTelefónica {

    private static final double PRECIO_CINCO_MIN=1;
    private static final double PRECIO_CINCO_OCHO_MIN=0.8;
    private static final double PRECIO_OCHO_DIEZ_MIN=0.7;
    private static final double PRECIO_DIEZ_MIN=0.6;
   
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       
       

       
        int min,minaux; //número introducido por el usuario
        double precio=0.0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca los minutos de llamada: ");
    min = sc.nextInt();
   
   
    if (min<=5) {
       
        precio = min *PRECIO_CINCO_MIN;
    }
    else if ( min <= 8) {
       
        precio = 5 * PRECIO_CINCO_MIN + (min - 5) * PRECIO_CINCO_OCHO_MIN;
       
       
    } else if (min <= 10) {
       
        precio = 5 * PRECIO_CINCO_MIN + 3 * PRECIO_CINCO_OCHO_MIN
                + (min - 8) * PRECIO_OCHO_DIEZ_MIN;
    } else {
       
        precio = 5 * PRECIO_CINCO_MIN +
                3 * PRECIO_CINCO_OCHO_MIN
                + 2 * PRECIO_OCHO_DIEZ_MIN
                + (min -10)*PRECIO_DIEZ_MIN;
    }
   
   
    System.out.println("El precio para " + min + " minutos es :" + precio);

   }

}
