package Programacion.TEMA7;

import java.util.Scanner;

public class mainEmpleadoJefes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numeroEmpleados, numeroJefes;
        Empleado empleados[];
        Jefes jefes[];

        System.out.println("¿Cuántos empleados hay en la empresa?");
        numeroEmpleados = sc.nextInt();

        empleados = new Empleado[numeroEmpleados];

        for(int i = 0; i < numeroEmpleados; i++){
            System.out.println("Empleado: " + (i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Sueldo: ");
            double sueldo = sc.nextDouble();

            empleados[i] = new Empleado(nombre, sueldo);
        }

        System.out.println("¿Cuántos jefes hay en la empresa?");
        numeroJefes = sc.nextInt();

        jefes = new Jefes[numeroJefes];

        for(int i = 0; i < numeroJefes; i++){
            System.out.println("Jefe: " + (i+1));
            sc.nextLine();
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Sueldo: ");
            double sueldo = sc.nextDouble();
            sc.nextLine();

            System.out.print("Titulo: ");
            String titulo = sc.nextLine();

            System.out.print("Nombre del departamento: ");
            String nombreDepartamento = sc.nextLine();

            jefes[i] = new Jefes(nombre, sueldo, titulo, nombreDepartamento);
        }

        mostrarDatosEmpleados(empleados);
        mostrarDatosJefes(jefes);
    }

    static void mostrarDatosEmpleados(Empleado empleados[]){
        System.out.println("Los datos de los empleados de la empresa son: ");
        for (int i = 0; i < empleados.length; i++){
            empleados[i].mostrarDatos();
            System.out.println();
        }
    }

    static void mostrarDatosJefes(Jefes jefes[]){
        System.out.println("Los datos de los jefes de la empresa son: ");
        for (int i = 0; i < jefes.length; i++){
            jefes[i].mostrarDatos();
            System.out.println();
        }
    }
}
