
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio7Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int horas, extras;
        
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        horas = teclado.nextInt();
        extras = horas - 40;
        
        if (horas <= 40)
            System.out.println("El sueldo semanal que le corresponde es de " + (horas*12) + " euros");
        else if (horas > 40)
            System.out.println("El sueldo semanal que le corresponde es de " + ((horas - extras)*12 + (extras*16)) + " euros");
    }
}
