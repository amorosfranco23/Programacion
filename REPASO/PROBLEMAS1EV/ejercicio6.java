package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

/**
 * Clase con metodos estaticos para calcular y devolver el MCM de dos parametros numericos.
 * Fecha: 20260506
 * @author Julia Amoros
 */
public class ejercicio6 {
    /**
     * Metodo para calcular el minimo comun multiplo de dos numeros
     * @param p Primer numero entero
     * @param q Segundo numero entero
     * @return Devuelve el MCM 
     */
    public static int mcm(int p, int q){
        int resultado = p*q / ejercicio5.mcd(p, q); // Seguimos la formula:
                                                    // MCM(a, b) = a*b / MCD(a, b) --> usando el metodo mcd de la clase ejercicio5

        return resultado;
    }

    /**
     * Metodo principal. Lee dos numeros por teclado y muestra su MCM.
     * @param args Parametro de linea de comandos, no se usa
     */
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int p, q;

        do {
            System.out.println("Introduce el primer numero: ");
            p = sc.nextInt();
        } while (p <= 0);

        do {
            System.out.println("Introduce el segundo numero: ");
            q = sc.nextInt();
        } while (q <= 0);

        System.out.println("El Minimo Comun Multiplo de " + p + " y " + q + " es " + mcm(p, q));
    }
}
