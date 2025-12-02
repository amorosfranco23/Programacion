public class Ejercicio19Ev1 {
    public static void main (String[] args){
        String[] notas ={"do", "re", "mi", "fa", "sol", "la", "si"};
        
        int bloques = (int)(Math.random() * 7 + 1);
        int totalNotas = bloques * 4;

        String primeraNota = notas[(int)(Math.random() * 7)];
        System.out.print(primeraNota + " ");

        for (int i = 2; i <= totalNotas; i++) {

            String nota;

            if (i == totalNotas) {
                nota = primeraNota;
            } else {
                int randomIndex = (int)(Math.random() * 7);
                nota = notas[randomIndex];
            }

            System.out.print(nota + " ");

            if (i % 4 == 0) {
                System.out.print("| ");
            }
        }

        System.out.print("||");
    }
}