package Programacion.TEMA8;

public class MainDivision {
    public static void main (String[]args){
        try{
            System.out.println("Introduce el dividendo: ");
            int dividendo = CocienteDivision.pedirNumeroEntero();

            System.out.println("Introduce el divisor: ");
            int divisor = CocienteDivision.pedirNumeroEntero();

            CocienteDivision.calcularCociente(dividendo, divisor);

        } catch(ArithmeticException i){
            System.out.println("Error: " + i.getMessage());
        }
    }
}
