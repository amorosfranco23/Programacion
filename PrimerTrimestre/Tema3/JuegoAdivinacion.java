/**
 * Este programa genera un entero entre 1 y 100, ambos incluidos. EL usuario tiene que intentar adivinarlo.
 * Después de cada intento, el programa indica si el númeroes mayor o igual que el valor introducido.
 * El proceso se repite hasta acertar. Al finalizar, el programa muestra el número de intentos realizados.
 * 
 * Fecha: 20261117
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class JuegoAdivinacion {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int numero, contadorIntentos = 0;
        int numeroSecreto = ( int )(Math.random() * ( 100 - 1 + 1 )) + 1;

        do {
            System.out.print("¡Intenta adivinar el número secreto!: ");
            numero = sc.nextInt();

            if ( numeroSecreto > numero ) 
                System.out.println("¡Has fallado! El número secreto es mayor.");
            else if ( numero > numeroSecreto )
                System.out.println("¡Has fallado! El número secreto es menor.");
            else 
                System.out.println("¡Has acertado! El número secreto era " + numeroSecreto);
                
            contadorIntentos++;
        } while ( numero != numeroSecreto );

        System.out.println("El número de intentos ha sido: " + contadorIntentos);
    }
}
