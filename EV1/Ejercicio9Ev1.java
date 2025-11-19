
import java.util.Scanner;
/**
 *
 * @author amorosfranco23
 */
public class Ejercicio9Ev1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int dia, mes;
        String signo;
        
        System.out.print("Introduce tu dia de nacimiento: ");
        dia = teclado.nextInt();
        
        System.out.print("Introduce tu mes de nacimiento: ");
        mes = teclado.nextInt();
        
        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            signo = "Aries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            signo = "Tauro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            signo = "Géminis";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            signo = "Cáncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            signo = "Leo";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            signo = "Virgo";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            signo = "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            signo = "Escorpio";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            signo = "Sagitario";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            signo = "Capricornio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            signo = "Acuario";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            signo = "Piscis";
        } else {
            signo = "Fecha no válida";
        }
        
        System.out.println("El horoscopo de la fecha introducida es " + signo);
    }
}
