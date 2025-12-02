/*
    Programa que imprime en binario un numero introducido por teclado.
    a. Si es par --> 0, si es impar --> 1
    b. Dividimos entre 2
    c. Aplicar estos pasos en orden hasta llegar a 1
    Ej: introducimos el 13 = impar --> 1, dividimos entre 2, da 6 = par --> 01,
    6/2 = 3 = impar --> 101, 3/2 = 1 = impar --> 1101

    fecha: 20251126
    Author: Julia Amoros Franco
*/

import java.util.Scanner;
public class Ejercicio21Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numero = 0;
        
        String binario = "";

        System.out.print("Introduce el numero que quieras convertir a binario: ");
        numero = sc.nextInt();
        int original = numero;

        while (numero > 0){
            int digito = numero % 2;
            binario = digito + binario;
            numero = numero / 2;
        }

        System.out.println(original + "=" + binario);
    }
}
