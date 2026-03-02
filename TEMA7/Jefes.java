package Programacion.TEMA7;

public class Jefes extends Empleado {
    String nombre;
    double sueldo;
    String titulo;
    String nombreDepartamento;

    public Jefes(String nombre, double sueldo, String titulo, String nombreDepartamento){
        super(nombre, sueldo);
        this.titulo = titulo;
        this.nombreDepartamento = nombreDepartamento;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Titulo: " + titulo);
        System.out.println("Nombre del departamento: " + nombreDepartamento);
    }
}