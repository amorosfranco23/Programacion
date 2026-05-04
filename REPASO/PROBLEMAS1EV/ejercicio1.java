package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;
/**
 * Esta clase muestra si un numero es primo o no, con el metodo y su main en la misma.
 * Fecha: 20260504
 * @author Julia Amoros
 */

public class ejercicio1 {

    /**
     * Este método verifica y devuelve si un numero es primo o no.
     * 
     * @param n El numero entero que se quiere comprobar
     * @return true si es primo, false si NO es primo
     */
    public static boolean primo(int n){
        if (n < 2) return false; // El 0 y el 1 no son primos

        for (int i = 2; i < n; i++){ // Bucle probando todos los divisores de n
            if (n % i == 0)
                return false;
        }
        return true; // Si no encuentra ninguno, es primo
    }

    /**
     * Método principal. Lee un numero primo por teclado e indica si
     * es primo o no.
     * @param args No se usa
     */
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.println("Introduce un numero por teclado:");
        N = sc.nextInt();

        if (primo(N)){
            System.out.println(N + " es primo");
        } else
            System.out.println(N + " no es primo");
    }
}
