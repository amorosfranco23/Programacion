
import java.util.Scanner;
/**
 *Realizar un programa que elija mediante un menú un tipo de figura:

 Triángulo
 Cuadrado
 Rectángulo
Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos
la muestre.
 * @author amorosfranco23
 */
public class Ejercicio12 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double base, altura, lado, area = 0;

        System.out.println("Elige una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.print("Opción: ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.print("Base: ");
            base = teclado.nextDouble();
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            area = (base * altura) / 2;
        } else if (opcion == 2) {
            System.out.print("Lado: ");
            lado = teclado.nextDouble();
            area = lado * lado;
        } else if (opcion == 3) {
            System.out.print("Base: ");
            base = teclado.nextDouble();
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            area = base * altura;
        } else {
            System.out.println("Opción no válida.");
        }

        if (opcion >= 1 && opcion <= 3) {
            System.out.println("El área es: " + area);
        }
    }
}
