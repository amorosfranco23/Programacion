package Programacion.TEMA6;

import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in); 
        int[] a = new int[100]; 
        int[] b = new int[100]; 
        int j, m; 
        int sumaA = 0; 
        int sumaB = 0; 
        int sumaDiff = 0; 
        m = teclado.nextInt();

        for ( j = 0; j < m; j++ ) { 
        a[j] = teclado.nextInt(); 
        b[j] = teclado.nextInt(); 
        } 

        for ( j = 0; j < m; j++ ) { 
        sumaA = sumaA + a[j]; 
        sumaB = sumaB + b[j]; 
        sumaDiff = sumaDiff + (a[j] - b[j]); 
        } 

        for ( j = m - 1; j >= 0; j-- ) 
        System.out.println(a[j] + " " + b[j] + " " + (a[j] - b[j])); 
        System.out.println(sumaA + " " + sumaB + " " + sumaDiff); 
        System.out.println(); 

    }
}
