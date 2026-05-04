package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

/**
 * Clase con un método para comparar divisores.
 * Fecha: 20260504
 * @author Julia Amoros
 */

public class ejercicio2 {
    /**
     * Este metodo calcula cuantos divisores tiene un numero.
     * @param n Numero para contar sus divisores
     * @return Devuelve el contador de divisores
     */
    public static int contarDivisores(int n){
        int contador = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0)
                contador++;
        }
        return contador;
    }

    /**
     * Metodo principal que lee dos numeros(P, Q) por teclado
     * y compara el numero de divisores.
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int P, Q;


        do{
            System.out.println("Introduce el numero P: ");
            P = sc.nextInt();
        } while (P <= 0);

        do{
            System.out.println("Introduce el numero Q: ");
            Q = sc.nextInt();
        } while (Q <= 0);

        int divisoresP = contarDivisores(P);
        int divisoresQ = contarDivisores(Q);

        System.out.println("P tiene " + divisoresP + " divisor(es).");
        System.out.println("Q tiene " + divisoresQ + " divisor(es).");

        if (divisoresP > divisoresQ)
            System.out.println("P tiene más divisores que Q.");
        else if (divisoresQ > divisoresP)
            System.out.println("Q tiene mas divisores que P.");
        else 
            System.out.println("P y Q tienen el mismo numero de divisores.");
    }
}
