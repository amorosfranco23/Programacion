
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio8Tema4 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String cadena, cifrada = "";
                boolean valida = false;		

		do {
			System.out.print("Introduce la frase a cifrar: ");
			cadena = sc.nextLine();
			valida = cadena.equals(cadena.toUpperCase());
		} while (! valida);

		for ( int i = 0; i < cadena.length(); i++) {
			char aux = (char) (cadena.charAt(i) + 3);
			if ( aux > 'Z' )
				aux -= 'Z';
			cifrada += aux;

			/* cifrada += (aux = cadena.charAt(i)) <= 'Z' 
                        ? aux
                        : aux - ‘Z’;
                        */
		} 
                System.out.println(cadena + " = " + cifrada);
}
}

