
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio9Tema3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, suma = 0;
        
        System.out.print("Introduce un número entero positivo: ");
        n = teclado.nextInt();
        
        if (n <= 0) {
            System.out.println("El número debe ser mayor que cero.");
        }
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        
        if (suma == n) {
            System.out.println(n + " es un número perfecto.");
        } else {
            System.out.println(n + " no es un número perfecto.");
        }
    }
}

