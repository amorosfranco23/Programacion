package Programacion.TEMA8;
import java.util.Scanner;

public class CocienteDivision {
    static Scanner sc = new Scanner(System.in);    

    static int dividendo;
    static int divisor;

    public String pedirCadena(){
        return sc.nextLine();
    }

    public static int pedirNumeroEntero(){
        return sc.nextInt();
    }

    public static void calcularCociente(int dividendo, int divisor){
        double cociente = dividendo / divisor;

        System.out.println("El cociente de la division entre " + dividendo + " y " + 
        divisor + " es: " + cociente);
    }
}
