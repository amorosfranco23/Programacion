/**
 * Este programa lee dos numeros enteros, comprueba que el primero es menor o igual al segundo, y si no lo es repite el proceso para que se cumpla. 
 * Calcula la suma de los numeros multiplos de 3 entre A y B, si no hay la suma da 0.
 * 
 * Fecha: 20261109
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class SumaMultiplosIntervalo {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        int A, B, suma = 0;

        do {
            System.out.print("Introduce el primer numero entero: ");
            A = sc.nextInt();

            System.out.print("Introduce el segundo numero entero: ");
            B = sc.nextInt();
        } while ( A > B );

        for ( int i = A + 1 ; i <= B - 1; i++) {
            if ( i % 3 == 0 ) 
                suma += i;
        }

        System.out.println("Suma = " + suma);
    }
}