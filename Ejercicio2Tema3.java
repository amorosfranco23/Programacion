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
public class Ejercicio2Tema3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N, resultado;
        
        System.out.print("Introduce un numero del 1 al 10: ");
        N = sc.nextInt();
        
       if (N >= 1 && N <= 10) {
           System.out.println("TABLA DE MULTIPLICAR DE " + N);
           for (int i = 1; i <= 10; i++) {
               resultado = N * i;   
               System.out.println(N + " * " + i + " = " + resultado);
           }
    }else
           System.out.println("Numero invalido, debe de estra entre el 1 y el 10");
    }
}
