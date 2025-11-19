
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio6Tema4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese una frase (máx 80 caracteres): ");
        String frase = teclado.nextLine();

        if (frase.length() > 80) {
            frase = frase.substring(0, 80);
            System.out.println("⚠️ La frase fue truncada a 80 caracteres.");
        }

        int vocales = 0;
        int consonantes = 0;
        int numeros = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c >= '0' && c <= '9') {
                numeros++;
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
        System.out.println("Cantidad de caracteres numéricos: " + numeros);
    }
}
   
