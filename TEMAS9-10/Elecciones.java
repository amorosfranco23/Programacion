import java.util.Scanner;

public class Elecciones {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de partidos: ");
        int N = sc.nextInt();

        System.out.print("Introduce el numero de escaños: ");
        int M = sc.nextInt();

        List<Partido> partidos = new ArrayList<>();
        
        for (int i = 1; i <= N*M; i++){
                System.out.print("Introduce el nombre del partido: ");
                int nombre = sc.nextLine();
                System.out.print("Introduce el numero de votos: ");
                int votos = sc.nextInt();
        }
    }
}
