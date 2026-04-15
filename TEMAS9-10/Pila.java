public class Pila {
    private int[] vector;
    private int cima;

    public Pila(){
        vector = new int[100];
        cima = 0;
    }

    public void push(int elemento){
        if (cima < 100){
            vector[cima] = elemento;
            cima++;
        }
        else
            throw new IllegalStateException("La pila está llena.");

        assert cima <= 100 : "Bug detectado: La cima ha superado el límite del vector";
    }

    public int pop(){
        if (cima == 0)
            throw new IllegalStateException("La pila está vacía, no se puede desapilar.");
        
        cima--;
        int valor = vector[cima];

        return valor;
    }

    public int size(){
        return cima;
    }
}
