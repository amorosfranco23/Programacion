/*
    Programa que convierte un numero introducido por teclado a octal. Metodo:
    a. Digito = numero % 8
    b. numero / 8
    c. Se repite hasta que el numero es menor a la base (8)
    ej: numero = 159 --> 159 % 8 = 7, 159 / 8  = 19 --> 19 % 9 = 37, 19 / 8 = 237
*/

import java.util.Scanner;
public class Ejercicio22Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numero;
        String octal = "";

        System.out.print("Intorduce el numero que quieras comvertir a octal: ");
        numero = sc.nextInt();
        int original = numero;

        while (numero >= 8){
            int digito = numero % 8;
            octal = digito + octal; //Nos aseguramos de introducir los digitos en el orden correcto, como funcionan en los binarios y octales como en el ejemplo del inicio
            numero = numero / 8;
        }
        octal = numero + octal;
        System.out.println(original + "=" + octal);
    }
}