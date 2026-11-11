/**
 * Este programa va a solicitar el número de veces que se leerán valores reales, los pedirá y después mostrará la suma, la media, 
 * el máximo, y el mínimo.
 * 
 * Fecha: 20261111
 * @author: Julia Amorós
 */

import java.util.Scanner;

public class EstadisticaNumeros {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in );
        int medicion; 
        double valor, suma = 0, media = 0, maximo = 0, minimo = 0;

        do {
            System.out.print("Introduce un valor positivo: ");
            medicion = sc.nextInt();
        } while ( medicion <= 0 );

        for ( int i = 1; i <= medicion; i++ ) {
            System.out.print("Introduce un valor real: ");
            valor = sc.nextDouble();
            suma += valor;

            if ( i == 1 ) {
                maximo = valor;
                minimo = valor;
            } else {
                if ( maximo < valor )
                    maximo = valor;
                if ( minimo > valor )
                    minimo = valor;
            }
        }
        
        media = suma/medicion;

        System.out.println("Suma: " + suma + "\nMedia: " + media + "\nMáximo: " + maximo + "\nMínimo: " + minimo);
    }
}
