
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio3Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int base, altura;
        
        System.out.print("Introduce la base: ");
        base = teclado.nextInt();
        
        System.out.print("Introduce la altura: ");
        altura = teclado.nextInt();
        
        System.out.println("El area del rectangulo es " + (base*altura));
    }
}
