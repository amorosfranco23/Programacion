public class mainCuentaCorriente {
    public static void main (String [] args){
        try{
            CuentaCorriente c1 = new CuentaCorriente("Ana", 300, "0000000");
            System.out.println("Saldo de la cuenta");
            System.out.println(c1.ingresarDinero(200));
            System.out.println(c1.retirarDinero(100));
        } catch(IllegalArgumentException i){
            System.out.println("Error: " + i.getMessage());
        }
    }
}
