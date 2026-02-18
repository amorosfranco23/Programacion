package Programacion.TEMA6;

public class mainCuentas {

    public static void main(String[] args) {

        // Crear el "banco" que guarda las cuentas
        Cuentas banco = new Cuentas();

        // Agregar cuentas
        banco.agregarCuentas("Ana", 1200, "11111111");
        banco.agregarCuentas("Luis", 5000, "22222222");
        banco.agregarCuentas("Carlos", 5000, "33333333");
        banco.agregarCuentas("Marta", 300, "44444444");

        // Intento de agregar código repetido
        banco.agregarCuentas("Pedro", 900, "22222222"); // Debería mostrar error

        // Cargar los saldos en el array paralelo
        banco.cargarSaldos();

        // Obtener el saldo máximo
        double maximo = banco.obtenerSaldoMaximo();

        // Mostrar las cuentas que tengan ese saldo máximo
        banco.mostrarCuentas(maximo);
    }
}
