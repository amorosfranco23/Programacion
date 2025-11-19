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
public class Ejercicio5Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2;
        
        System.out.print("Introduce la nota del primer examen: ");
        nota1 = teclado.nextDouble();
        
        System.out.print("¿Qué nota quieres sacar en la segunda evaluación? ");
        nota2 = teclado.nextDouble();
        
        double nota3 = (nota2 - nota1 * 0.3)/0.7;
                
        System.out.println("Para tener un " + nota2 + "en la segunda evaluación neceitas sacar un " + nota3 + " en el segundo examen");
    }
}
