/**
 * Este programa solicita una nota entre cero y diez, ambos incluidos, y repetirá esta acción mientras el dato esté fuera del rango. 
 * Una vez validada mostrará su calificación según estos criterios:
 * - Desde cero a menos de 5 = INSUFICIENTE.
 * - Desde 5 a menos de 6 = SUFICIENTE.
 * - Desde 6 a menos de 7 = BIEN.
 * - Desde 7 a menos de 9 = NOTABLE.
 * - Desde 9 a 10 = SOBRESALIENTE.
 * 
 * Fecha: 20261111
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class ClasificacionNotas {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        double nota;

        do {
            System.out.print("Introduce una nota entre cero y diez, ambos incluidos: ");
            nota = sc.nextDouble();
        } while ( nota < 0 || nota > 10 );
        
        if ( nota >= 0 && nota < 5 )
            System.out.println("La calificación es: insuficiente");
        else if ( nota < 6 )
            System.out.println("La calificación es: suficiente");
        else if (  nota < 7 )
            System.out.println("La calificación es: bien");
        else if (  nota < 9 )
            System.out.println("La calificación es: notable");
        else 
            System.out.println("La calificación es: sobresaliente");
    }
}