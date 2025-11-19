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
public class Ejercicio5Tema4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leer la frase
        System.out.print("Ingrese una frase (máx 80 caracteres): ");
        String frase = teclado.nextLine();

        if (frase.length() > 80) {
            frase = frase.substring(0, 80);
            System.out.println("⚠️⚠️⚠️⚠️ La frase fue truncada a 80 caracteres.");
        }

        StringBuilder pares = new StringBuilder();
        StringBuilder impares = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            if (i % 2 == 0) {
                pares.append(frase.charAt(i));
            } else {
                impares.append(frase.charAt(i));
            }
        }

        System.out.println("Caracteres en posiciones pares:   " + pares);
        System.out.println("Caracteres en posiciones impares: " + impares);
    }
}
