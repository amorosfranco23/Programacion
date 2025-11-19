/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida, de
manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa
debe imprimirnos la media de todos ellos, el mayor y el menor.
 * @author amorosfranco23
 */


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0, contador = 0, mayor, menor;

        System.out.println("Introduce números (0 para terminar):");
        numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("No se han introducido números.");
        } else {
            mayor = numero;
            menor = numero;

            while (numero != 0) {
                suma = suma + numero;
                contador = contador + 1;

                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                numero = teclado.nextInt();
            }

            double media = (double) suma / contador;
            System.out.println("Media: " + media);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        }
    }
}

