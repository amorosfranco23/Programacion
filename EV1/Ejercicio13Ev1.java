/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasjulia;

/**
 *
 * @author amoro
 */
public class Ejercicio13Ev1 {
    public static void main (String[] args){
        int i = 320;
        
        //FOR
        for ( i = 320; i >= 160; i -= 20)
        System.out.println(i);
        
        //WHILE
        while(i > 160) {
            System.out.println(i);
            i -= 20;
        }

        //DO-WHILE
        do {
            System.out.println(i);
            i -= 20;
        } while (i >= 160);
    }
}
