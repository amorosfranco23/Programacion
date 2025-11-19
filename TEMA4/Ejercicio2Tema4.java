
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio2Tema4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase de max 80 caracteres: ");
        String frase = teclado.nextLine();

        if (frase.length() > 80) {
            frase = frase.substring(0, 80);
        }

        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }
        System.out.println("Cantidad de mayúsculas: " + mayusculas);
        System.out.println("Cantidad de minúsculas: " + minusculas);
    }
}
    

