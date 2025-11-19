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
public class Ejercicio12Ev1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1, elige piedra, papel o tijera: ");
        String jugador1 = sc.nextLine().toLowerCase();

        if (!jugador1.equals("piedra") && !jugador1.equals("papel") && !jugador1.equals("tijera")) {
            System.out.println("Error: opción inválida para el Jugador 1.");
        
        }

        System.out.print("Jugador 2, elige piedra, papel o tijera: ");
        String jugador2 = sc.nextLine().toLowerCase();

        if (!jugador2.equals("piedra") && !jugador2.equals("papel") && !jugador2.equals("tijera")) {
            System.out.println("Error: opción inválida para el Jugador 2.");
        
        }

        if (jugador1.equals(jugador2)) {
            System.out.println("¡Empate!");
        } else if ((jugador1.equals("piedra") && jugador2.equals("tijera")) ||
                   (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                   (jugador1.equals("tijera") && jugador2.equals("papel"))) {
            System.out.println("¡Gana el Jugador 1!");
        } else {
            System.out.println("¡Gana el Jugador 2!");
        }
    }
}