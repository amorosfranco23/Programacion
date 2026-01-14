package Programacion.EXAMEN;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N;

        System.out.println("Introduce un numero: ");
        N = sc.nextInt();

        for (int filas = 1; filas <= N; filas++){
            for (int espacios = 1; espacios <= N; espacios++){
                espacios = (N - filas)/2;
                System.out.print(" ");
            }
            for (int c = 1; c <= N; c++){
                c = 0;
                System.out.print(N);
            }
            System.out.println();
        }

    }
}
