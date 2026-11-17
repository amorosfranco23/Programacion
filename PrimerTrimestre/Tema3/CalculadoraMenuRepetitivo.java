/**
 * Este programa muestra el menú de una calculadora. Mientras no se elija la opción 5, el programa solicitará la opción y realizará la operación 
 * elegida. Se leerán dos operandos y en la division, que es real, se comprueba que el divisor no es cero.
 * Una opción no válida muestra un mensaje informativo y el menú otra vez.
 * 
 * Fecha: 20261117
 * @author: Julia Amoros
 */

import java.util.Scanner;

public class CalculadoraMenuRepetitivo {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int opcion;
        double operandoA, operandoB;

        do {
        System.out.println("1. Sumar dos números.");
        System.out.println("2. Restar dos números.");
        System.out.println("3. Multiplicar dos números.");
        System.out.println("4. Dividir dos números.");
        System.out.println("5. Terminar.");

        System.out.print("Introduce la opción que desees: ");
        opcion = sc.nextInt();

        switch ( opcion ) {
            case 1: 
                System.out.print("Introduce el primer operando de la suma: ");
                operandoA = sc.nextDouble();
                System.out.print("Introduce el segundo operando: ");
                operandoB = sc.nextDouble();

                double suma = operandoA + operandoB;
                System.out.println("La suma de " + operandoA + " + " + operandoB + " da " + suma);
                break;
            case 2:
                System.out.print("Introduce el primer operando de la resta: ");
                operandoA = sc.nextDouble();
                System.out.print("Introduce el segundo operando: ");
                operandoB = sc.nextDouble();

                double resta = operandoA - operandoB;
                System.out.println("La resta de " + operandoA + " - " + operandoB + " da " + resta);
                break;
            case 3:
                System.out.print("Introduce el primer operando de la multiplicación: ");
                operandoA = sc.nextDouble();
                System.out.print("Introduce el segundo operando: ");
                operandoB = sc.nextDouble();

                double multiplicacion = operandoA * operandoB;
                System.out.println("La multiplicación de " + operandoA + " * " + operandoB + " da " + multiplicacion);
                break;
            case 4:
                System.out.print("Introduce el primer operando de la division: ");
                operandoA = sc.nextDouble();
                System.out.print("Introduce el segundo operando: ");
                operandoB = sc.nextDouble();

                if ( operandoB == 0 ) {
                    System.out.print("Vuelve a introducir el segundo operando, este no puede ser igual a cero: ");
                    operandoB = sc.nextDouble();
                }
                double division = operandoA / operandoB;
                System.out.println("La division de " + operandoA + " / " + operandoB + " da " + division);
                break;
            case 5: 
                System.out.println("Cerrando la calculadora...");
                break;
            default:
                System.out.println("El valor introducido no está en el menú, vuelve a introducirlo.");
                System.out.println("1. Sumar dos números.");
                System.out.println("2. Restar dos números.");
                System.out.println("3. Multiplicar dos números.");
                System.out.println("4. Dividir dos números.");
                System.out.println("5. Terminar.");

                System.out.print("Introduce la opción que desees: ");
                opcion = sc.nextInt();
                break;
        }
    } while ( opcion != 5 );
    }
}
