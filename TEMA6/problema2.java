package Programacion.TEMA6;
import java.util.Scanner;

public class problema2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int[] vectorUno = new int[10];
        int[] vectorDos = new int[10];
        int[] vectorTres = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Introduce los valores: ");

            vectorUno[i] = sc.nextInt();
            vectorDos[i] = sc.nextInt();
            vectorTres[i] = vectorUno[i] + vectorDos[i];
        }

        for (int i = 0; i < 10; i++)
            System.out.print(vectorTres[i] + " ");
    }
}
