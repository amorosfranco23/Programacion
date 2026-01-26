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
        if (valorInicio < 0)
            System.out.println("Error: valor erróneo");
        this.valorInicio = valorInicio;
    }

    public String ImprimirValor(){
        return "valor: " + valorInicio;
    }

    
}


