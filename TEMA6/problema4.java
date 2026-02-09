package Programacion.TEMA6;

public class problema4 {
    public static void main (String[] args){
        int[] vectorUno = new int[10];
        int[] vectorDos = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++){
            vectorUno[i] = (int)(Math.random() * 5) +1;
            vectorDos[i] = (int)(Math.random() * 5) +1;
        }

        System.out.println("Primer vector: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vectorUno[i] + " ");
        }
        System.out.println();

        System.out.println("Segundo vector: ");
        for (int i = 0; i < 10; i++){
            System.out.print(vectorDos[i] + " ");
        }

        for (int i = 0; i < 10; i++){
            if (vectorUno[i] == vectorDos[i])
                contador++;
            System.out.println("Elemento " + i + " se repite " + contador + " veces");
        }
    }
}
