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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        System.out.println("Introduce un número: ");
        N = teclado.nextInt();
        for (int i = 1; i < N; i++)
        if (N % i == 0)
        System.out.println(i);
    }
}

