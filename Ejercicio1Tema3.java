/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasjulia;
import java.util.Scanner;
/**
 *
 * @author amoro
 */
public class Ejercicio1Tema3 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int A, B, suma = 0;
        
        System.out.print("Introduce el primer numero: ");
        A = teclado.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        B = teclado.nextInt();
        
        if (A <= B){
            for (int i = A+1; i < B; i++)
                suma = suma + i;
                System.out.println("La suma de los numeros es " + suma);
        }
        else
            System.out.println("El primer numero tiene que ser menor al segundo");
    }
}
