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
public class Ejercicio3Tema3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N , divisor = 0;
        
        System.out.print("Introduce un numero: ");
        N = sc.nextInt();
        
       
        for (int i = 1; i < N; i++)
            if (N % i == 0)
            System.out.println (i);

}
}
