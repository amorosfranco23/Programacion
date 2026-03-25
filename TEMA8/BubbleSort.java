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

    public static void main(String[] args) {
        int[] v = {25, 9, 3, 6, 2, 15, 4, 27, 42};

        boolean cambio = true;
        int pasadas = 0;

        while (cambio && pasadas < v.length) {
            cambio = false;
                for (int j = 0; j < v.length - 1-pasadas; j++) {
                    if (v[j] > v[j + 1]) {
                        int aux = v[j];
                        v[j] = v[j + 1];
                        v[j + 1] = aux;
                        cambio = true;
                    }
                }
                pasadas++;
            

        }
        for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
    }  
            }
    }

//EMPEZANDO POR LOS MENORES
