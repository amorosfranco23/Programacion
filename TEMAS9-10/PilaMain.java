import java.util.Random;

public class PilaMain {
    public static void main(String[]args){
        Pila miPila = new Pila();
        Random generarRandom = new Random();
        int capacidad = 100; //Si queremos forzar un fallo cambiamos esta variable a un numero mayor a 100

        try {
            for(int i = 0; i < capacidad; i++){
                int numeroRandom = generarRandom.nextInt(100);
                miPila.push(numeroRandom);
                System.out.println("He apilado el número aleatorio " + numeroRandom);
            }

            while (miPila.size() > 0) {
                System.out.println("El número extraido ha sido " + miPila.pop());
            }

            //Si queremos forzar al metodo pop() a fallar, ponemos aquí otra vez miPila.pop()
        } catch(IllegalStateException i){
            System.out.println("Error: " +  i.getMessage());
        }
    }
}
