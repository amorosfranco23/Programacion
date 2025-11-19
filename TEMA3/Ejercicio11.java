
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio11 {
    public static void main (String[] args){
    
     Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int N = teclado.nextInt();

        System.out.println("Números primos hasta " + N + ":");

        for (int i = 2; i <= N; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}

