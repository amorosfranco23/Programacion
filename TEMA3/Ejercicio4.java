
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int dividendo, divisor;
        boolean esPrimo = true;
        
        System.out.println("Introduce un número");
        dividendo = teclado.nextInt();
        divisor = 2;
        
        while (esPrimo && divisor < dividendo)
            esPrimo = dividendo % divisor++ != 0;
       
            System.out.println();
    }
    }
