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

        for(int i = 0; i < numEnteros; i++){
            if (tabla[i] == valor){
                System.out.println("El elemento ya está en el conjunto");
                return;}
        }

        tabla[numEnteros];
    }

    public void eliminarConjunto(int valor){
        for (int i = 0; i < numEnteros; i++){
            if (tabla[i] == valor){
                tabla[i] = tabla[numEnteros - 1];
                numEnteros--;
            }
        }
    }

    public void copiarConjunto(Conjunto otro){
        this.numEnteros = otro.numEnteros;

        for(int i = 0; i < otro.numEnteros; i++)
            this.tabla[i] = otro.tabla[i];
    }

    public boolean esMiembro(int valor){
        for (int i = 0; i < numEnteros; i++){
            if (tabla[i] == valor)
                return true;
        }
        return false;

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
