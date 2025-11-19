
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio8Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        double g, h, t;
        g = 9.81;
     
        System.out.print("Introduce la altura: ");
        h = teclado.nextDouble();
        
        t= Math.sqrt((2 * h) / g);
        
        System.out.println("El tiempo que tardará en caer un objeto desde una altura de " + h + " es " + t );
    }
}
