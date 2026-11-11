/**
 * Este programa solicita un entero entre 1 y 10, si está fuera lo volverá a solicitar.
 * Mostrará la tabla de multiplicar desde 1 al 10, ejemplo de formato -> 8 * 2 = 16.
 * 
 * Fecha: 20261109
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class TablaMultiplicarValidada {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        int numero, producto = 0;

        do {
            System.out.print("Introduce un numero entero entre 1 y 10: ");
            numero = sc.nextInt();
        } while ( numero < 1 || numero > 10 );

        for ( int i = 1; i <= 10; i++ ) {
            producto = numero * i;
            System.out.println( numero + " * " + i + " = " + producto);
        }
    }
}