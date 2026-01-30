public class mainHora {
    public static void main (String[] args){
        Hora h1 = new Hora(23, 59, 40);

        h1.sumarSegundos(4);
        System.out.println(h1.formatoHora());
    }
}
