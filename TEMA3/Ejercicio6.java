/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, posicion = 1, sumaImpares = 0, sumaPares = 0;

        System.out.println("Introduce números (0 para terminar):");
        N = teclado.nextInt();

        while (N != 0) {
            if (posicion % 2 == 0) {
                sumaPares = sumaPares + N;
            } else {
                sumaImpares = sumaImpares + N;
            }
            posicion = posicion + 1;
            N = teclado.nextInt();
        }

        System.out.println("Suma en posiciones impares: " + sumaImpares);
        System.out.println("Suma en posiciones pares: " + sumaPares);
    }
}

