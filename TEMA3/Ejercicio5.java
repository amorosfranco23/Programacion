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
public class Ejercicio5 {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        int N, suma = 0, contador = 0; 
            
        System.out.print("Introduce un número: ");
        N = teclado.nextInt();
        
        while (N != 0){
            suma = suma + N;
            contador = contador + 1;
            N = teclado.nextInt();
        }
            System.out.println("Has introducido " + contador + " números.");
        System.out.println("La suma total es: " + suma);

            
}}
    
