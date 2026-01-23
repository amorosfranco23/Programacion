public class mainTrabajador {
    public static void main (String[] args){
        Trabajador t1 = new Trabajador (1, "Ana", 'S', 'N' , 4, 3);

        System.out.println("DATOS DEL TRABAJADOR: ");
        System.out.println(t1.datosTrabajador());

        System.out.println("NÓMINA:");
        System.out.println("Salario neto: " + t1.nomina() + "$");
    }
}
