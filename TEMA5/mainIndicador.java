public class mainIndicador {
    public static void main (String[] args){
        Indicador i1 = new Indicador(40);

        System.out.println("Valor incrementado: " + i1.incrementarValor(40));
        System.out.println("Valor disminuido: " + i1.disminuirValor(20));
    }
}
