package Programacion.TEMA8;

public class Tiempo {
    public static void main(String[]args){
        int [] vector = {25, 9, 3, 6, 2, 15, 4, 27, 42};

        long tiempo = 0;

        for(int i = 0; i < 5; i++){
            int [] v = vector.clone();
            long t = System.currentTimeMillis();
            BubbleSort.ordenar(v);
            tiempo += System.currentTimeMillis() - t;
        }
    }
}
