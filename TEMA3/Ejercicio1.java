
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio1 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int A, B, suma = 0;

	System.out.println("Escribe un numero: ");
	A = teclado.nextInt();
	System.out.println("Escribe otro numero: ");
	B = teclado.nextInt();

	if ( A <= B ) {
		for ( int i = A+1; i < B; i ++)
			suma += i;
	System.out.println("La suma desde " + (A+1) + " hasta " + (B-1) + " es: " + suma);
	}
	else
	System.out.println("El primer número debe de ser menor al segundo introducido.");
	}
}

   
