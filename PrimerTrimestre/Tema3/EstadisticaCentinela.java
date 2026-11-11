/**
 * Este programa leerá numeros enteros hasta que se introduzca el cero. El cero indica el final de la secuencia y no debe formar parte de los datos procesados.
 * El programa mostrará la cantidad de datos introducidos, su suma, cuantos son positivos y cuantos negativos y, si se introduce al menos un dato se calculará también la media.
 * 
 * Fecha: 20261111
 * @author: Julia Amoros 
 */

import java.util.Scanner;

public class EstadisticaCentinela {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner( System.in );
        final int CENTINELA = 0;
        int numero, cantidad = 0, suma = 0, positivos = 0, negativos = 0; 
        double media = 0;
        
        System.out.print("Introduce un número entero (o " + CENTINELA + " para finalizar): ");
        numero = sc.nextInt();

        while ( numero != CENTINELA ) {
            cantidad++;
            suma +=  numero;

            if ( numero > 0 )
                positivos++;
            else
                negativos++;

            System.out.print("Introduce el siguiente número (o " + CENTINELA + " para finalizar): ");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de datos: " + cantidad + "\nSuma: " + suma + "\nCantidad de positivos: " + positivos + "\nCantidad de negativos: " + negativos);

        if ( cantidad > 0 ) {
            media = (double)suma / cantidad;
            System.out.println("Media: " + media);
        }
    }
}

