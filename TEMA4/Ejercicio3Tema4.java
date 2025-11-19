
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio3Tema4 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        int posicion = frase.toLowerCase().indexOf(palabra.toLowerCase());

        if (posicion == -1) {
            System.out.println("La palabra no se encuentra en la frase. Resultado: 0");
        } else {
            System.out.println("La palabra \"" + palabra + "\" se encuentra a partir del carácter: " + posicion);
        }
    }
}
