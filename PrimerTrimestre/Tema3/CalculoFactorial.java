/**
 * Este programa solicitará un número entre 1 y 20, ambos incluidos, y calculará sy factorial.
 * Si el dato está fuera del intervalo, volverá a solicitarse.
 * 
 * Fecha: 20261116
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class CalculoFactorial {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int numero;
        long resultado = 1; // inicializado a 1 ya que es el numero minimo del calculo del factorial.

        do {
            System.out.print("Introduce un número entre el 1 y el 20: ");
            numero = sc.nextInt();
        } while ( numero < 1 || numero > 20 );

        for ( int i = 2; i <= numero; i++ ) // i inicializado a 2 ya que resultado ya guarda el primer numero.
            resultado *= i;

        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}

