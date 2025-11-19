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
public class Ejercicio4Tema4 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese una cadena (máx 80 caracteres): ");
        String cadena = teclado.nextLine();

        if (cadena.length() > 80) {
            cadena = cadena.substring(0, 80);
            System.out.println("La cadena fue truncada a 80 caracteres.");
        }

        System.out.println("Elija una opción:");
        System.out.println("1 - Convertir a MAYÚSCULAS");
        System.out.println("2 - Convertir a minúsculas");
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();

        String resultado;
        if (opcion == 1) {
            resultado = cadena.toUpperCase();
        } else if (opcion == 2) {
            resultado = cadena.toLowerCase();
        } else {
            System.out.println("Opción no válida.");
            
            return;
        }

        System.out.println("Cadena resultante: " + resultado);
    }
}
