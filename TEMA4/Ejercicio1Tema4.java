
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio1Tema4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una frase (máx. 80 caracteres): ");
        String frase = teclado.nextLine();
      
        if (frase.length() > 80) {
            frase = frase.substring(0, 80);
        }

        String acumulador = "";
        for (int i = 0; i < frase.length(); i++) {
            acumulador += frase.charAt(i);
            System.out.println(acumulador);
        }
    }
}       
   
