package Programacion.TEMA8;
import java.util.Scanner;

public class ejercicio2 {
    private int numero;

    public ejercicio2(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void pedirCadena(String cadena){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();


    }

    public void pedirNumero(){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int suma = 0;

        while (contador <= 6){
            System.out.println("Introduce un numero entero: ");
            numero = sc.nextInt();
            contador++;
            suma += numero;
        }
    }
}
