package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

/**
 * Clase con métodos estaticos para definir y calcular factoriales.
 * fecha: 20260504
 * @author Julia Amoros
 */
public class ejercicio3 {

    /**
     * Metodo para calcular el factorial de un numero
     * @param n Numero del que queremos saber su factorial
     * @return Devuelve resultado, que es el calculo
     */
    public static int factorial(int n){
        int resultado = 1;

        for (int i = 1; i <= n; i++){
            if (n > 0)
                resultado = resultado * i;
        }
        return resultado;
    }

    /**
     * Metodo principal para leer un numero y devolver su factorial.
     * @param args Argumentos de cmd. No se usan.
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.println("Introduce un numero: ");
        N = sc.nextInt();

        System.out.println("El factorial de " + N + " es " + factorial(N));
    }
}
