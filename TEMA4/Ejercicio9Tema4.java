
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio9Tema4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        int desplazamiento;
        do {
            System.out.print("Introduce el número de desplazamiento (1-10): ");
            desplazamiento = teclado.nextInt();
        } while (desplazamiento < 1 || desplazamiento > 10);

        frase = frase.toUpperCase();

        StringBuilder cifrada = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char nuevo = (char) (c + desplazamiento);
                if (nuevo > 'Z') {
                    nuevo = (char) (nuevo - 26); 
                }
                cifrada.append(nuevo);
            } else {

                cifrada.append(c);
            }
        }

        System.out.println("\nFrase original: " + frase);
        System.out.println("Desplazamiento: " + desplazamiento);
        System.out.println("Frase cifrada:  " + cifrada.toString());
    }
}
 
