public class Cociente{
    private double valorDivision;
    private Partido partido;

    public Cociente(Partido partido, double valorDivision){
        this.partido = partido;
        this.valorDivision = valorDivision,
    }

    public double getValorDivision(){
        return valorDivision;
    }

    public Partido getPartido(){
        return partido;
    }
}