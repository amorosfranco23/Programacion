package Programacion.TEMA5;

public class PrimerObjeto {
    static private int CampoUno;
    private int CampoDos;

    public PrimerObjeto () {
        CampoDos = 2;
    }

    public static void main (String [] args){
        PrimerObjeto objeto;
        PrimerObjeto obj2;
        objeto = new PrimerObjeto();
        
        CampoUno = 1;
        System.out.println("CampoUno de objeto " + objeto.CampoUno);
        System.out.println("CampoDos de objeto " + objeto.CampoDos);

        obj2 = new PrimerObjeto();
        obj2.CampoDos = 4;
        System.out.println("CampoUno de objeto " + obj2.CampoUno);
        System.out.println("CampoDos de objeto " + obj2.CampoDos);

        obj2.CampoUno = 5;
        System.out.println("CampoUno de objeto " + obj2.CampoUno);
        System.out.println("CampoDos de objeto " + obj2.CampoDos);

    }
}
