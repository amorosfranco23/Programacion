/**
 * Este programa leerá un entero y determinará si es primo. Los numeros menores a dos no son primos, para los demás se comprobará si existe algún divisor distinto de uno y
 * del propio número. Cuando encuentre un divisor, evitará relizar comprobaciones innecesarias.
 * 
 * Fecha: 20261116
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class DeterminacionNumeroPrimo {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int numero, candidatoDivisor = 2; // candidatoDivisor inicializado a 2 para ahorrarnos comprobaciones innecesarias como el 1.
        boolean divisorEncontrado = false; // Inicializado a false porque no ha encontrado un divisor aun, cuando lo haga se volverá true. 

        System.out.print("Introduce un número para saber si es primo: ");
        numero = sc.nextInt();

        while ( candidatoDivisor < numero && divisorEncontrado == false ) {
            if ( numero % candidatoDivisor == 0 )
                divisorEncontrado = true;
            else 
                candidatoDivisor++;
        }

        if ( divisorEncontrado == true || numero < 2)
            System.out.println("El número " + numero + " no es primo.");
        else 
            System.out.println("El número " + numero + " es primo.");
    }
}