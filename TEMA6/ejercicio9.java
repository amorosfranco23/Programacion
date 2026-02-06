package Programacion.TEMA6;

public class ejercicio9 {
    public static void main (String[] args){
        int[] muestra = new int[8]; 
        int i; 
        int k; 

        /*for ( k = 0; k < 8; k++ ) {
            muestra[k] = 10 - k; 
            System.out.println(muestra[k]);
        }
        */

        /*for ( i = 0; i < 8; i++ ) {
            if ( i <= 3 ) 
                muestra[i] = 1; 
            else 
                muestra[i] = -1; 
        System.out.println(muestra[i]); }  
        */
       
        for ( k = 0; k < 8; k++ ) 
        {if ( k % 2 == 0 ) 
            muestra[k] = k; 
        else 
            muestra[k] = k + 100; 
        System.out.println(muestra[k]);
    }

    }
}
