package Programacion.TEMA6;

/**
 * Vector con 20 numeros aleatorios, ademas se calcula la media y mostrar
 * los numeros superiores/inferiores/iguales a la media
 */

public class problema1 {
    public static void main (String[] args){
        int[] vector = new int [20];
        int suma = 0;
        int contadorSuperior = 0;
        int contadorInferior = 0;
        int contadorIgual = 0;

        for (int i = 0; i < 20; i++){
            vector[i] = (int)(Math.random() * 100);    
            suma += vector[i];
        }

        
        double media = suma / 20.0;

        for (int i = 0; i < 20; i++){
            if (vector[i] < media)
                contadorInferior++;
            else if (vector[i] > media)
                contadorSuperior++;
            else
                contadorIgual++;
        }
        

        System.out.println("La media es " + media);
        System.out.println("Hay " + contadorSuperior + " números superiores, "
            + contadorInferior + " números inferiores y " + contadorIgual + 
            " números iguales"
            );
        
    }
}
