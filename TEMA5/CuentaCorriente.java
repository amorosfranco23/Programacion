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
        setTitular(titular);
        setSaldo(saldo);
        setCodigo(codigo);
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
            throw new IllegalArgumentException("Sin titular");
        this.titular = titular;
    }

    public void setSaldo(float saldo){
        if (saldo < 0){
            throw new IllegalArgumentException("Saldo erróneo");
        }
        else 
            this.saldo = saldo;
    }

    public void setCodigo(String codigo){
        if (codigo.length() != 8){
            throw new IllegalArgumentException("Código erróneo");
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
            throw new IllegalArgumentException("Saldo insuficiente.");
    }

    public double retirarDinero(double cantidad){
        if (puedoSacar(cantidad) == true)
            saldo -= cantidad;
        else
            throw new IllegalArgumentException("Saldo insuficiente.");
            return saldo;
        }
    }
