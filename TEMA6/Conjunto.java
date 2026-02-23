package Programacion.TEMA6;

/**
 * Esta clase representa un conjunto de enteros .
 * Soporta operaciones para: vaciar, agregar, eliminar, copiar, verificar la
 * pertenencia de un elemento al conjunto, su posicion, comparar y visualizar
 * los componentes del conjunto.
 * @author: Julia Amorós
 * fecha: 20260216
 */

public class Conjunto {
    private final int TAMAÑO = 100;
    int[] tabla;
    int numEnteros;

    public Conjunto(){
        tabla = new int[TAMAÑO];
        numEnteros = 0;
    }

    public void vaciarConjunto(){
        numEnteros = 0;
    }

    public void agregarConjunto(int valor){
        if (numEnteros == TAMAÑO){
            System.out.println("El conjunto está lleno");
            return;
        }

        if (esMiembro(valor)){
                System.out.println("El elemento ya está en el conjunto");
                return;}

        tabla[numEnteros] = valor;
    }

    public void eliminarConjunto(int valor){
        int posicion = posicion(valor);
            if(posicion != -1)
                eliminar(posicion);
            else
                System.out.println("Ese elemento no está");
        
    }

    private void eliminar (int posicion){
        for (int i = numEnteros - 1; i > posicion; i--)
            tabla[i-1] = tabla[i];
        numEnteros--;
    }

    public void copiarConjunto(Conjunto otro){
        if (numEnteros + otro.numEnteros <= tabla.length){
        for(int i = 0; i < otro.numEnteros; i++)
            agregarConjunto(otro.tabla[i]);}
        else 
            System.out.println("El nuevo no cabe");
    }

    public boolean esMiembro(int valor){
        return posicion(valor) != -1;
    }

/**
 * determina la posicion de un elemento en el conjunto
 * @param valor Valor a localizar
 * @return su posicion si el elemento está en el conjunto; -1 si no está.
 */

    public int posicion(int valor){
        for (int i = 0; i < numEnteros; i++)
                if (tabla[i] == valor)
                    return i;
                return -1;
    }

    public boolean esIgual(Conjunto otro){
        if (this.numEnteros != otro.numEnteros){
            return false;
        }
        return true;
    }

    public void imprimirConjunto(){
        for (int i = 0; i < numEnteros; i++)
            System.out.println(tabla[i]);
    }
}
