import java.util.Scanner;

public class Ejercicio18Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numero, copia = 0;
        boolean encontrado = false;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        int ultimo = copia % 10;

        for (int digitoBuscado = 0; digitoBuscado < 9; digitoBuscado++){
            while (copia > 0)
                if (ultimo == digitoBuscado ){

                    encontrado = true;
                }copia = numero; 
        } 

        System.out.println("Los numeros que aparecen en el numero introducido son: ");
        System.out.println("Los numeros que no aparecen en el numero introducido son: ");
    }
}