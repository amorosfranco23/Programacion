package Programacion.TEMA6;

/**
 * Vector con 20 numeros aleatorios, ademas se calcula la media y mostrar
 * los numeros superiores/inferiores/iguales a la media
 */

public class problema1 {
    public static void main (String[] args){
        int[] vector = new int [20];
        int suma = 0;

        for (int i = 0; i < 20; i++){
            vector[i] = (int)(Math.random() * 100);
            suma += vector[i];
            }

            double media = suma / 20;

            if (vector > media)
                Syste
    }
}
