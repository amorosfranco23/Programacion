

/**
 *  Programa que pide dos numeros y luego los mezcle de esta manera:
 *  primer digito del primer numero, primer digito del segundo numero, segundo digito del primer numero, segundo digito del segundo numero, etc.
 *  Se supone que el usuario va a introducir dos numeros de la misma longitud y siempre habrá al menos un digito par y uno impar.
 * @author amorosfranco23
 */
import java.util.Scanner;
public class Ejercicio16Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        long numero1, numero2;
        
        System.out.print("introduce el primer numero: ");
        numero1 = sc.nextLong();
        
        System.out.print("introduce el segundo numero: ");
        numero2 = sc.nextLong();

        long pares = 0, impares = 0;
        long revPares = 0, revImpares = 0;

        while (numero1 > 0) {
            long d1 = numero1 % 10;
            long d2 = numero2 % 10;

            // d1
            if (d1 % 2 == 0) pares = pares * 10 + d1;
            else impares = impares * 10 + d1;

            // d2
            if (d2 % 2 == 0) pares = pares * 10 + d2;
            else impares = impares * 10 + d2;

            numero1 /= 10;
            numero2 /= 10;
        }

        // Invertir pares
        while (pares > 0) {
            revPares = revPares * 10 + pares % 10;
            pares /= 10;
        }

        // Invertir impares
        while (impares > 0) {
            revImpares = revImpares * 10 + impares % 10;
            impares /= 10;
        }

        System.out.println("Número de pares:   " + revPares);
        System.out.println("Número de impares: " + revImpares);
    }
}
