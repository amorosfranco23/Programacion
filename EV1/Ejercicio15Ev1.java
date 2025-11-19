/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio15Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un número: ");
        String numero = sc.nextLine();

        System.out.print("Introduce un dígito (0-9): ");
        char digito = sc.next().charAt(0);

        int posicion = 1;
        int contador = 0;  // contará cuántas veces aparece el dígito

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == digito) {
                System.out.println("Encontrado en la posición: " + posicion);
                contador++;
            }
            posicion++;
        }

        if (contador == 0) {
            System.out.println("El dígito no se encuentra en el número.");
        }
    }
}
