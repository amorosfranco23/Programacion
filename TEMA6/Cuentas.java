package Programacion.TEMA6;

/**
 * Programa que representa una cuenta que permite obtener el titular 
 * y codigo de la cuneta con mayor saldo.
 * 
 * @author: Julia Amorós
 * fecha: 20260218
 */

public class Cuentas {
    private final int TAMAÑO = 100;
    CuentaCorriente[] cuenta;
    double[] saldos;
    int numeroDeCuentas;

    public Cuentas(){
        cuenta = new CuentaCorriente[TAMAÑO];
        saldos = new double[TAMAÑO];
        numeroDeCuentas = 0;
    }

    public boolean codigoExiste(String codigo){
        for (int i = 0; i < numeroDeCuentas; i++){
            if (cuenta[i].getCodigo().equals(codigo))
                return true;
        }
            return false;
    }

    public void agregarCuentas(String titular, float saldo, String codigo){
        if (numeroDeCuentas >= 100){
            System.out.println("Error: no se pueden añadir más cuentas.");
            return;}

        if (codigoExiste(codigo)){
            System.out.println("Error: el código ya existe.");
            return;}

        cuenta[numeroDeCuentas] = new CuentaCorriente(titular, saldo, codigo);
        numeroDeCuentas++;
    }

    public void cargarSaldos(){
        for(int i=0;i<numeroDeCuentas;i++){
            saldos[i] = cuenta[i].getSaldo();
        }
    }

    public double obtenerSaldoMaximo(){
        double maximo = saldos[0];

        for (int i = 0; i < numeroDeCuentas; i++){
            if (saldos[i] > maximo)
                maximo = saldos[i];
        }
        return maximo;
    }

    public void mostrarCuentas(String titular[], float saldo[], String codigo[], double maximo){

        System.out.println("Las cuentas con mayor saldo son: ");

        for (int i = 0; i < numeroDeCuentas; i++){
            if (saldos[i] == maximo){
                System.out.println("Titular:" + titular[i]);
                System.out.println("Titular:" + saldo[i]);
                System.out.println("Titular:" + codigo[i]);
            }

        }

    }
}
