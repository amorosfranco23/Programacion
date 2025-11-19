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
public class TablaMultiplicar {
    public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		int N;
		
		System.out.print("introduce un numero entre el 1 y el 10: ");
		N = teclado.nextInt();

		if (N < 1 || N > 10){
			System.out.println("El numero introducido no cumple los requisitos");          
                }
                else{
		System.out.println("TABLA DE MULTIPLICAR DE " + N);
                for (int i = 1; i<= 10; i++)
                    System.out.println(N + "*" + i + "=" + (N*i));
                }
}}
