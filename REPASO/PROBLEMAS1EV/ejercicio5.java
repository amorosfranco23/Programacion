package Programacion.REPASO.PROBLEMAS1EV;

public class ejercicio5 {
    /**
     * Metodo con dos parametros enteros para calcular su maximo comun divisor
     * @param p
     * @param q
     * @return Devuelve el mcd de ambos parametros
     */
    public static int mcd (int p, int q){
        while (q != 0){         // Mientras el resto no sea 0
            int resto = p % q;  // Calculamos el resto
            p = q;              // El divisor pasa a ser el nuevo dividendo
            q = resto;          // El resto pasa a ser el nuevo divisor
        }
        return p;               // Cuando q es 0, p contiene el MCD
    }
}
