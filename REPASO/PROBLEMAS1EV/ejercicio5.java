package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

public class ejercicio5 {
    /**
     * Metodo con dos parametros enteros para calcular su maximo comun divisor
     * @param p
     * @param q
     * @return Devuelve el mcd de ambos parametros
     */
    public static int mcd (int p, int q){ // Seguimos el algoritmo de Euclides
        while (q != 0){         // Mientras el resto no sea 0
            int resto = p % q;      // Calculamos el resto
            p = q;              // El divisor pasa a ser el nuevo dividendo
            q = resto;          // El resto pasa a ser el nuevo divisor
        }
        return p;               // Cuando q es 0, p contiene el MCD
    }

    /**
     * Metodo principal que devuelve el mcd de dos numeros
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p, q;

        System.out.println("Introduce el primer numero:");
        p = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        q = sc.nextInt();

        System.out.println("El Maximo Comun Divisor de " + p + " y " + q + " es " + mcd(p, q));
    }
}
