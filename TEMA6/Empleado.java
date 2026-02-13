package Programacion.TEMA6;
import java.util.Scanner;

/*
    Crear una clase Empleado con los datos: Nombre y Numero de empleado.
    Ademas de añadir lso getters y setters necesarios -->
    Tendrá como metodos leerDatos() para leer por teclado y verDatos()
    para mostrar en pantalla.

    Author: Julia Amoros
    fecha: 19012026
*/

public class Empleado{
    private String nombre;
    private int numeroEmpleado;
    private int numeroMatricula;

    // Constructor con parámetros
    public Empleado (String nombre, int numeroEmpleado, int numeroMatricula){
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.numeroMatricula = numeroMatricula;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Numero empleado modificado para que sea unico
    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado = numeroEmpleado;
    }

    // Métodos leer y ver datos
    public void leerdatos(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.println("Introduce el numero del empleado: ");
        numeroEmpleado = sc.nextInt();
    }

    public void verDatos(){
        System.out.println("El nombre del empleado es " + nombre);
        System.out.println("El numero del empleado es " + numeroEmpleado);
    }
}
