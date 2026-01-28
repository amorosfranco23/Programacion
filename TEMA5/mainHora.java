public class mainHora {
    public static void main (String[] args){
        Hora h1 = new Hora(20, 10, 35);

        System.out.println(h1.formatoHora());
        System.out.println(h1.sumarHoras());
        System.out.println(h1.restarHoras());
    }
}
