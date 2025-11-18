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
public class Ejercicio11Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int personas, parejas, solos, dia;
        double precio, precioTotal = 0;
        boolean tarjeta;
        
        System.out.print("Introduce el numero de personas: ");
        personas = teclado.nextInt();
        
        System.out.print("Introduce el día con numero: ");
        dia = teclado.nextInt();
          
        System.out.print("¿Tiene la tarjeta CinePas? ");
        tarjeta = teclado.nextBoolean();
        
        if (dia == 3)
            precio = 5 * personas;
        else if (dia == 4){
            parejas = personas / 2;
            solos = personas % 2;
            precio = (parejas * 11) + (solos * 8);
        }
        else 
            precio = 8 * personas;
        
        if (tarjeta)
            precioTotal = precio - (precio * 0.1);
        else 
            precioTotal = precio;
        
        System.out.println("El precio para la sesión del día es de " + precioTotal);
        
    }
}

