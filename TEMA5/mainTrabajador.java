public class mainTrabajador {
    public static void main (String[] args){
        try{
        Trabajador t1 = new Trabajador (10, "Ana", 'S', 'N' , 4, 3);

        System.out.println("DATOS DEL TRABAJADOR: ");
        System.out.println(t1.datosTrabajador());

        System.out.println("NÓMINA:");
        System.out.println("Salario neto: " + t1.nomina() + "$");
        } catch(IllegalArgumentException i){
            System.out.println("Error: " + i.getMessage());
        }
    }
}
