/**
 * Este programa leerá dos enteros positivos y calculará su m.c.m a partir del  M.C.D, calculado mediante el algoritmo de  Euclides.
 * 
 * Fecha: 20261126
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class MinimoComunMultiplo {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int dividendo, divisor, auxDividendo = 0, auxDivisor = 0;

        do {
            System.out.print("Introduce el valor del dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Introduce el valor del divisor: ");
            divisor = sc.nextInt();
        } while ( dividendo <= 0 || divisor <= 0 );

        auxDividendo = dividendo;
        auxDivisor = divisor;

        while ( auxDivisor != 0 ) {
            int resto = auxDividendo % auxDivisor;
            auxDividendo = auxDivisor;
            auxDivisor = resto;
        }

        int resultado = ( dividendo * divisor ) / auxDividendo;
        System.out.println("El minimo común múltiplo de " + dividendo + " y " + divisor + " es " + resultado);
    }
}
