/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion;
import java.util.Scanner;
/**
 * Un estudiante debe haber asistido al menos al 85% de clases, 
 * debe calcular el numero de ausencias a clase y generar un documento
 * de notificacion de perdida del derecho a la evaluacion continua que
 * conste del numero de id, el numero de horas en que se ha ausentado,
 * junto con el porcentaje de horas que supone en caso de que sus 
 * ausencias superen el 15%.Analogamente, debe generar un documento
 * de aviso si ha superado el 5% o 10% de ausencias.
 * @author amorosfranco23
 */
public class Ausencias {
    public static void main (String[] args) {
    Scanner teclado= new Scanner (System.in);
    int horasTotales, numeroHoras, numeroId, porcentaje;
    
    porcentaje= 
    System.out.print("Introduce el numero de identificacion del alumno: ");
    numeroId= teclado.nextInt();
    
    System.out.print("Introduce las horas totales del modulo: ");
    horasTotales= teclado.nextInt();
    
    System.out.print("Introduce las horas de asusencia del alumno: ");
    numeroHoras= teclado.nextInt();
    
    
    }
}
