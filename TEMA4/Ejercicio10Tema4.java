
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio10Tema4 {
   public static void main (String[] args){
       Scanner sc = new Scanner (System.in);
       String codigo;
       boolean fin, valido, hombre, cursoPrimero;
       char aux;
       int anio, correctos = 0, hombresPrimero, mujeresPrimero, hombresSegundo, mujeresSegundo;
       hombresPrimero = mujeresPrimero = hombresSegundo = mujeresSegundo = 0;
       
       do {
            System.out.print("Introduce código: ");
            codigo = sc.nextLine();
       
            valido = codigo.length() == 8;
            anio = Integer.parseInt(
                    codigo.substring(0,4));
            valido = valido && anio >= 1990 && anio <= 1995;
            aux = codigo.charAt(4);
            valido = valido && (aux == 'H' || aux == 'M');
            hombre = valido && aux == 'H';
            aux = codigo.charAt(5);
            valido = valido && (aux == '1' || aux == '2');
            cursoPrimero = valido && aux == '1';
            
            if (valido){
                correctos++;
                if (hombre)
                    if (cursoPrimero)
                        hombresPrimero++;
                    else
                        hombresSegundo++;
                else
                    if (cursoPrimero)
                        mujeresPrimero++;
                    else
                        mujeresSegundo++;
            }
                
            
            
            fin = codigo.equals("00000000");
        } while (!fin);
       //imprimir
   } 
}
