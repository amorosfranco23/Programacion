package Programacion.TEMA6;

public class Coleccion {
    public static int MAX_DISCOS = 100;
    private Disco[] discos;
    private int indice;

public Coleccion(){
    indice = 0;
    discos = new Disco[MAX_DISCOS];
}

public int discosAlmacenados(){
    return indice;
}

public void insertarDisco(Disco d){
    if (indice < discos.length)
    discos[indice++] = d;
}

public void eliminarDisco (Disco d){
    int posicion = posicionDisco(d);
    if (posicion != -1)
            discos[posicion] = null;
    }

public int posicionDisco (Disco d){
    for (int i = 0; i < indice; i++){
        if (discos[i].equals(d))
            return i;
    }
    return -1;
}
}