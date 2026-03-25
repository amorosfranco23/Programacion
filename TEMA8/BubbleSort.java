package Programacion.TEMA8;

/**
 * ordenar burbuja mumeros vector
 * desde i = n-1 hasta 0
 *  desde 0 hasta i
 * 
 * desde i= 0 hasta n-1
 *  desde j=0 hasta n-i-j
 *   swap if(v[j] > v[j+1])
 */

//EMPEZANDO POR LOS MAYORES
public class BubbleSort {
    public static void main(String[]args){
        int[] v = {25, 9, 3, 6, 2, 15, 4, 27, 42, 800};
        int[] distancia = {5, 3, 1};

        for (int w = 0; w < distancia.length; w++){
            int dst = distancia[w];
        for (int i = 0; i < v.length - 1; i++){
            for (int j = 0; j < v.length - w - i; j+=w){
                if (v[j] > v[j+1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }

        for(int k = 0; k < v.length; k++)
            System.out.print(v[k] + " ");
        System.out.println();
    }}
}

//EMPEZANDO POR LOS MENORES
