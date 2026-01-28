/**
 * Esta clase representa una cuenta corriente que está formda por un titular, el saldo
 * y el codigo unico por persona. Con esta clase podemos ingresar dinero y retirarlo.
 * @author: Julia Amoros
 * fecha: 20260126
*/

public class CuentaCorriente {
    private String titular;
    private float saldo;
    private String codigo;
    /*  private static CuentaCorriente ultimaCuentaCreada;
        private Cuentacorriente cuentaAnterior;
        private boolean validarCodigoUnico = true;

        // en el constructor
        if ! validar(ultimaCuentaCreada, codigo)
            //error
        // asiganmos estado inicial
        this.codigo = codigo;
        cuentaAnterior = ultimaCuentaCreada;
        ultimaCuentaCreada = this;

        private boolean validarCodigoUnico (CuentaCorriente instancia, String codigo){
        if (instancia == null)
            return true;
        else if (codigo.equals(instancia.codigo))
            return false;
        else
            return validarCodigoUnico(instancia.anterior, codigo);
        }
    */    

    public CuentaCorriente(String titular, float saldo, String codigo){
        this.titular = titular;
        this.saldo = saldo;
        this.codigo = codigo;
    }

    public String getTitular(){
        return titular;
    }

    public float getSaldo(){
        return saldo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setTitular(String titular){
        if (titular == null || titular.isEmpty())
            System.out.println("Error: sin titular");
        this.titular = titular;
    }

    public void setSaldo(float saldo){
        if (saldo < 0){
            System.out.println("Error: saldo erróneo");
            this.saldo = 0;
        }
        else 
            this.saldo = saldo;
    }

    public void setCodigo(String codigo){
        if (codigo.length() != 8){
            System.out.println("Error: código erróneo");
            this.codigo = "";
        }
        else 
            this.codigo = codigo;
    }

    public double ingresarDinero(double cantidad){
        if (cantidad > 0)
            saldo += cantidad;
        return saldo;
    }

    public boolean puedoSacar(double cantidad){
        if (cantidad < saldo)
            return true;
        else
            return false;
    }

    public double retirarDinero(double cantidad){
        if (puedoSacar(cantidad) == true)
            saldo -= cantidad;
        else
            System.out.println("Error: saldo insuficiente.");
            return saldo;
        }
    }
