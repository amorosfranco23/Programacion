public class mainCuentaCorriente {
    public static void main (String [] args){
        CuentaCorriente c1 = new CuentaCorriente("Ana", 300, "00000000");

        System.out.println("Saldo de la cuenta");
        System.out.println(c1.ingresarDinero(200));
        System.out.println(c1.retirarDinero(100));
    }
}
