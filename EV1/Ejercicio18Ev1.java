import java.util.Scanner;

public class Ejercicio18Ev1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numero, copia = 0;
        boolean encontrado = false;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        for (int digitoBuscado = 0; digitoBuscado <= 9; digitoBuscado++){
            copia = numero;
            encontrado = false;

            while (copia > 0){
                int ultimo = copia % 10;
                if (ultimo == digitoBuscado) {
                    encontrado = true;
                }
                copia = copia / 10;    
        }
    
        if (encontrado) {
            System.out.println(digitoBuscado + " aparece");
        } else {
            System.out.println(digitoBuscado + " no aparece");
        }
            encontrado = false; 
    }
}
}