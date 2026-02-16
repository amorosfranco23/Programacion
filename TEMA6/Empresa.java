package Programacion.TEMA6;

/**
 * Programa que gestiona los empleados de una empresa
 * 
 * @Author Julia Amorós
 * Fecha: 13/02/2026
 */

public class Empresa {
    Empleado[] empleados;

    public Empresa(){
        empleados = new Empleado[50];
        rellenarEmpleados();
    }

    public void rellenarEmpleados(){
        String[] nombres = {"Pepe", "Juan", "Miguel"};
        String[] apellidos = {"Gutierrez", "Lopez", "Torres"};

        int indice;
        String nombreEmpleado;

        for (int i = 0; i < empleados.length; i++){
            indice = (int)(Math.random() * nombres.length);
            nombreEmpleado = nombres[indice];

            indice = (int)(Math.random() * apellidos.length);
            nombreEmpleado += " "+ apellidos[indice];

            int numeroEmpleado = i + 1;
            int numeroMatricula = i + 1;

            empleados[i] = new Empleado(nombreEmpleado, numeroEmpleado, numeroMatricula);
        }
        
    }

    public void mostrarEmpleados(){
        for(int i = 0; i < empleados.length; i++)
            empleados[i].verDatos();
    }
    
}


/*
    String nombre = {"pp", "Juan", "Miguel"...}
    String apellido = {"gutierrez", "tonton"...}

    int indice;
    String nombreEmpleado;

    indice = (int)(Math.random() * nombre.length);
    nombreEmpleado = nombre[indice];
    indice = (int)(Math.random() * apellido.length);
    nombreEmpleado += " " + apellido[indice];
 */

