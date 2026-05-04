package Programacion.REPASO.PROBLEMAS1EV;
import java.util.Scanner;

public class ejercicio4{
    /**
     * Metodo principal que lee un numero N e imprime todos los primos
     * hasta ese, todo esto utilizando el metodo "primo" del ejercicio1.
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N;

        do{
            System.out.println("Introduce un numero: ");
            N = sc.nextInt();
        } while (N <= 0);

        System.out.println("Lista de numeros primos: ");
        for(int i = 2; i <= N; i++){ // i actua como los numeros hasta N
            if (ejercicio1.primo(i)){          // primo devuelve true por defecto, si i da true, es primo y se guarda
                System.out.println(i);
            }
        }
    }
}
