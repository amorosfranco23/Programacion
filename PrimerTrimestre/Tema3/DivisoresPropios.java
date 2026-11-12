/**
 * Este programa leerá un número entero positivo N y mostrará sus divisores propios, excluyendo a N. 
 * Si no hay divisores propios ditintos de 1, el programa lo indicará claramente. También calculará la suma de los divisores.
 * 
 * Fecha: 20261112
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class DivisoresPropios {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        int N, suma = 0;
        boolean flagDivisor = false; // booleano que indica si hemos encontrado un divisor propio

        do {
            System.out.print("Introduce un número entero positivo: ");
            N  =  sc.nextInt();
        } while ( N <= 0 );

        for ( int i = 2; i < N; i++ ) {
            if ( N % i == 0 )  {
                if ( flagDivisor == false ) {
                    System.out.println("Divisores propios de " + N + ": ");
                    System.out.println("1");
                    suma = 1;
                    flagDivisor = true;
                }
                suma += i;
                System.out.println(i);
            }
        }

        if ( flagDivisor == true ) {
            System.out.println("La suma de todos los divisores propios da: " + suma);
        } else {
            if ( N > 1 ) {
                suma++;
                System.out.println("El número introducido no tiene un divisor propio mayor a 1.");
                System.out.println("La suma de su unico divisor propio da: " + suma);
            } else
                System.out.println("El número introducido no tiene ningun divisor propio.");
        }
    }
}