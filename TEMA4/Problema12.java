/* Hacer un programa para que pida una palabra de no más de 20 caracteres
    y efectúe todas las rotaciones posibles de dicha palabra de forma que el
    último carácter pase al primero y los demás corran un especio, es decir,
    si la palabra fuera "HOLA", el resultado debería ser:
    HOLA
    AHOL
    LAHO
    OLAH
    Observad que una palabra de n caracteres tiene n rotaciones.

    Autor: Jaime Sancho Muñoz.
    Fecha: 20251110.
*/

import java.util.Scanner;

public class Problema12{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String texto;
        int longitud;

        System.out.print("Introduzca su palabra: ");
        texto = teclado.nextLine();
        longitud = texto.length();

        if(texto.length() > 20){
            texto = texto.substring(0,20);
            System.out.println("LA PALABRA TIENE MÁS DE 20 CARACTERES");
        }else{
            String rotada = texto;

            for(int i = 1; i < longitud; i++){ //no repetir la palabra original
                rotada = rotada.charAt(longitud -1) + rotada.substring(0,  longitud -1);
                System.out.println(rotada);
            }
        }
    }
}

/* String rot;
    for (int i = 0; i < frase.length(); i++){
        rot = frase.substring(frase.length() -i -1, frase.length) + frase.substring(0, frase.length() -i -1);

        frase = frase.charAt(frase.length() - 1) + frase.substring(0, frase.length() -1)
    }
        */