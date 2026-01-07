package Programacion.TEMA5;
/**
 * Clase que representa un vehiculo
 */

public class Coche {
    private String marca;
    private int color;

    public void setMarca (String m){
        marca = m;
    }
    public void setColor (int c){
        color = c;
    }
    public void imprimeCoche (){
        System.out.println(
            "Marca: " + marca +
            "Color: " + color);
    }
}
