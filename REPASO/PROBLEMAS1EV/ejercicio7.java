package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

/**
 * Clase que trabaja con el radio de un circulo y devuelve diversos calculos.
 */
public class ejercicio7 {
    /**
     * Metodo que calcula:
     * 1. La longitud del circulo
     * 2. La superficie del circulo
     * 3. El volumen de una esfera
     * 
     * @param r Valor double del radio del circulo
     * @param opcion valor int para elegir una opcion (1, 2 o 3)
     * @return Devuelve un valor double dependiendo de la opcion que elijas, o -1 si no es valida
     */
    public static double radio(double r, int opcion){
        final double PI = 3.14159;
        double resultado;

        switch (opcion) {
            case 1:
                resultado = 2 * PI * r;
                return resultado;
            case 2:
                resultado = PI * Math.pow(r, 2);
                return resultado;
            case 3:
                resultado = (4.0/3) * PI * Math.pow(r, 3);
                return resultado;
            default:
                return -1;
        }
    }

    /**
     * Metodo principal que muestra un menu de opciones para calcular 
     * con el radio introducido por teclado
     * @param args Argumentos de linea de comandos. No se usa.
     */
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int opcion;
        double radio;

        System.out.println("Primero, introduce el valor del radio: ");
        radio = sc.nextDouble();

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Calcular la longitud del circulo de radio r.");
            System.out.println("2. Calcular la superficie del circulo.");
            System.out.println("3. Calcular el volumen de una esfera.");
            System.out.println("4. Salir del programa.");

            System.out.println("Introduce tu opcion: ");
            opcion = sc.nextInt();

            if (opcion != 4)
                System.out.println("Saliendo del programa...");
            else if (opcion >= 1 && opcion <= 3)
                System.out.println("El resultado da: " + radio(radio, opcion));
            else 
                System.out.println("Opcion no valida, intentalo de nuevo.");
        } while (opcion != 4);
    }
}
