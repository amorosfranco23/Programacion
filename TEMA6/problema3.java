package Programacion.TEMA6;
import java.util.Scanner;

public class problema3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int[] vector = new int[10];

        System.out.println("Introduce los valores");
        for (int i = 0; i < 10; i++)
            vector[i] = sc.nextInt();
        
        int numMayor = vector[0];
        int numMenor = vector[0];

        for (int i = 1; i < 10; i++){
            if (vector[i] > numMayor){
                numMayor = vector[i];
            }
            if (vector[i] < numMenor){
                numMenor = vector[i];
            }
        }

        for (int i = 0; i < 10; i++){
            if (numMayor == vector[i])
                System.out.println("La posición del mayor número es " + i);
            if (numMenor == vector[i])
                System.out.println("La posición del menor número es " + i);
        }
        
        System.out.println("El mayor número es: " + numMayor);
        System.out.println("El menor número es: " + numMenor);
    }
}
