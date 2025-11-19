
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio14Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String caracter;
        int vertice, altura;
        
        System.out.print("Introduce un caracter como una letra, un numero, o un simbolo: ");
        caracter = sc.nextLine();
        
        System.out.println("Elige la orientacion del vertice de la piramide: ");
        System.out.println("1. Arriba");
        System.out.println("2. Derecha");
        System.out.println("3. Abajo");
        System.out.println("4. Izquierda");
        vertice = sc.nextInt();
        
        System.out.println("Elige la altura de la piramide: ");
        altura = sc.nextInt();
        
        if (vertice == 1){
            for (int fila = 1; fila <= altura; fila++){
                for (int espacios = 1; espacios <= altura - fila; espacios++){
                    System.out.print(" ");
                }
                for (int c = 1; c <= (fila * 2) - 1; c++){
                    System.out.print (caracter);
                }
                System.out.println();
            }     
        } else if (vertice == 3){
            for (int fila = 1; fila <= altura; fila++){
                for (int espacios = 1; espacios <= fila - 1; espacios++)
                    System.out.print(" ");
                for (int c = 1; c <= (altura - fila + 1) * 2 - 1; c++)
                    System.out.print(caracter);
                System.out.println();
            }
        } else if (vertice == 2){
            for (int fila = 1; fila <= altura; fila++){
                for (int c = 1; c <= fila; c++)
                    System.out.print(caracter);
                System.out.println(); 
            } for (int fila = altura - 1; fila >= 1; fila--){
                for (int c = 1; c <= fila; c++)
                    System.out.print(caracter);
                System.out.println();
            }
        } else if (vertice == 4){
            for (int fila = 1; fila <= altura; fila++){
                for (int espacios = 1; espacios <= altura - fila; espacios++)
                    System.out.print(" ");
                for (int c = 1; c <= fila; c++)
                    System.out.print(caracter);
                System.out.println();
            } for (int fila = altura - 1; fila >= 1; fila--){
                for (int espacios = 1; espacios <= altura - fila; espacios++)
                    System.out.print(" ");
                for (int c = 1; c <= fila; c++)
                    System.out.print(caracter);
                System.out.println();
            }
        } else 
            System.out.println("El numero introducido no corresponde aninguna opcion del menu, vuelvalo a intentar");
}
}

