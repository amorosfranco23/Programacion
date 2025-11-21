/*
    Programa que inserta un digito dentro de un numero indicando la posicion. 
    El digito se inserta en la posicion indicada y el resto se mueve a la derecha.
*/

import java.util.Scanner;

public class Ejercicio17Ev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Dígito a insertar: ");
        int digito = sc.nextInt();

        System.out.print("Posición (1 = izquierda): ");
        int posicion = sc.nextInt();

        int potencia = 1;

        int aux = numero;
        int cifras = 0;
        while (aux > 0) {
            aux /= 10;
            cifras++;
        }

        for (int i = 0; i < cifras - posicion + 1; i++) {
            potencia *= 10;
        }

        int izquierda = numero / potencia;
        int derecha   = numero % potencia;

        int resultado = izquierda * (potencia * 10) + digito * potencia + derecha;

        System.out.println("Resultado: " + resultado);
    }
}