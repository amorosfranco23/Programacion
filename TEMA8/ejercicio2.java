package Programacion.TEMA8;
import java.util.Scanner;

public class Ejercicio2 {
    private static int numero;

    public Ejercicio2(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public static String pedirCadena(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        return cadena;
    }

    public static int pedirNumero(){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        while (contador < 6){
            System.out.println("Introduce un numero entero: ");
            numero = sc.nextInt();
            contador++;
            suma += numero;
        }

        System.out.println("La suma da: " + suma);
        return suma;
    }
}
