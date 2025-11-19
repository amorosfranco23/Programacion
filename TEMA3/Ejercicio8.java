/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un programa que
lea un número N filtrando que debe ser mayor que cero y calcule su factorial.
 * @author amorosfranco23
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, factorial = 1;

        do {
            System.out.print("Introduce un número mayor que 0: ");
            N = teclado.nextInt();
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + N + " es: " + factorial);
    }
}

