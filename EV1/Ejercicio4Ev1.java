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
public class Ejercicio4Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int horas;
        
        System.out.print("Introduce las horas trabajadas: ");
        horas = teclado.nextInt();
        
        System.out.println("El salario semanal es de " + (horas*12));
    }
}
