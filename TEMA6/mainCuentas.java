package Programacion.TEMA6;

public class mainCuentas {

    public static void main(String[] args) {

        Cuentas banco = new Cuentas();

        banco.agregarCuentas("Ana", 1200, "11111111");
        banco.agregarCuentas("Luis", 15000, "22222222");
        banco.agregarCuentas("Carlos", 5000, "33333333");
        banco.agregarCuentas("Marta", 300, "44444444");

        banco.cargarSaldos();

        double maximo = banco.obtenerSaldoMaximo();

        banco.mostrarCuentas(maximo);
    }
}
