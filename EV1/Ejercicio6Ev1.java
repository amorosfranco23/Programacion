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
public class Ejercicio6Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int hora;
        
        System.out.print("Introduce la hora: ");
        hora = teclado.nextInt();
        
        if (hora >= 6 && hora <= 12)
            System.out.println("Buenos dias");
        else if (hora >= 13 && hora <= 20)
            System.out.println("Buenas tardes");
        else
            System.out.println("Buenas noches");
    }
}
