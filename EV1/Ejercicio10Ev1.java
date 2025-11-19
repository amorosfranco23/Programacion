
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio10Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int hora, minutos;
        
        System.out.print("Introduce la hora: ");
        hora = teclado.nextInt();
        
        System.out.print("Introduce los minutos: ");
        minutos = teclado.nextInt();
        
        System.out.print("Para medianoche quedan " + ((((23 - hora)* 3600) + ((60 - minutos)*60)) + " segundos"));
        
    }
}
