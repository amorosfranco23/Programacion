
import java.util.Scanner;
/**
 *Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso
(o que es mayor).
 * @author amorosfranco23
 */
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        int siguiente=num+1;
        boolean primo =false;
        while(!primo){
            primo=true;
            
        for (int i = 2; i < siguiente; i++) {
            if (siguiente % i == 0) {
                primo = false;
            }
        
        }
        if(!primo){
            siguiente++;
        }
        } System.out.println("El siguiente numero primo es el " + siguiente);
    
        } 
        
    }