import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    public Empleado (String nombre, int numeroEmpleado) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del empleado: ");
        nombre = sc.nextLine();

        System.out.println("Introduzca el numero del empleado: ");
        numeroEmpleado = sc.nextInt();
    }

    public void verDatos() {
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El numero del empleado es: " + numeroEmpleado);
    }
}
