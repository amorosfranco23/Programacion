/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;
/**
 * Conversor euros a pesetas
 * @author amorosfranco23
 */
public class Ejercicio1Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int euro;
        
        System.out.print("Introduce la cantidad en euros: ");
        euro=teclado.nextInt();
        
        System.out.println("La cantidad de " + euro + " en pesetas es: " + (euro * 166.386));
    }
}
