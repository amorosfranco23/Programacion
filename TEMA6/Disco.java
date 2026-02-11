package Programacion.TEMA6;
import java.util.Date;

public class Disco {
    private String titulo;
    private int numeroCanciones;
    private float precio;
    private Date compra;

    static int numeroDisco = 0;

    public Disco (String titulo) {
        if (titulo == null || titulo.isEmpty() )
            System.out.println("Error: sin titulo");
        this.titulo = titulo;
    }

    public Disco (String titulo, float precio, Date compra){
        this(titulo); //This tiene que ser la primera sentencia del metodo
        if (precio < 0 || compra == null)
            System.out.println("Error: datos");
        this.precio = precio;
        this.compra = compra;
    }

    public Disco (String titulo, int numeroCanciones, float precio, Date compra){
        this(titulo, precio, compra);
        if (numeroCanciones <= 0)
            System.out.println("Error: sin canciones");
        this.numeroCanciones = numeroCanciones;
    }

    /*
        Observador del titulo del disco
        @return titulo del disco
     */
    public String getTitulo(){
        return titulo;
    }

    /*
        Observador del numero de cacionmes
        @return numero de canciones
     */
    public int getNumeroCanciones(){
        return numeroCanciones;
    }

    /*
        Observador del precio del disco
        @return precio de compra
     */
    public float getPrecio(){
        return precio;
    }

    /*
        Observador de la Date de compra
        @return Date de compra
     */
    public Date getDate(){
        return compra;
    }

    /*
        Transformador del numero de canciones
        @parametro numeroCanciones numero de canciones
    */
    public void setNumeroCanciones (int numeroCanciones){
        if (numeroCanciones <= 0)
            System.out.println("Error: sin canciones");
        this.numeroCanciones = numeroCanciones;
    }

    /*
        Transformador de la Date de compra
        @param compra fcha de compra
    */
    public void setDate (Date compra){
        if (compra == null)
            System.out.println("Error: datos");
        this.compra = compra;
    }
}
