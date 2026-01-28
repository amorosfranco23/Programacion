/**
 * Esta clase representa un indicador de la vida real, en este caso un horno.
 * 
 */

public class Indicador {
    private int valorInicio;

    public Indicador(int valorInicio){
        this.valorInicio = valorInicio;
    }

    public int getValorInicio() {
        return valorInicio;
    }

    public void setValorInicio(int valorInicio){
        if (valorInicio < 0){
            System.out.println("Error: valor erróneo");
            this.valorInicio = 0;
        }
        else
            this.valorInicio = valorInicio;
    }

    public String imprimirValor(){
        return "Valor: " + valorInicio;
    }

    public int incrementarValor(int cantidad){
        if (cantidad > 0)
            valorInicio += cantidad;

        return valorInicio;
    }

    public int disminuirValor(int cantidad){
        if ( cantidad > 0)
            valorInicio -= cantidad;

        return valorInicio;
    }
}


