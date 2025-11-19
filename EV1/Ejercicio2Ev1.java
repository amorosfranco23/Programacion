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
public class Ejercicio2Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma, resta, producto, division;
        
        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;
        
        System.out.println("La suma de los numeros da: " + suma);
        System.out.println("La resta de los numeros da: " + resta);
        System.out.println("La multiplicacion de los numeros da: " + producto);
        System.out.println("La division de los numeros da: " + division);
    }
}
