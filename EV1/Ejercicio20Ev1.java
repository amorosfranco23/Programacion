/*
    Programa que simula un amaquina tragaperras.  En cada salida se mostraran 3 figuras 
    (corazon, diamante, herradura, campana o limon).
    Casos:
    1. 3 figuras diferentes: "Lo siento, ha perdido"
    2. 2 iguales: "Bien, ha recuperado su moneda"
    3. 3 iguales: "Enhorabuena, ha ganado 10 monedas"

    Fecha: 20251126
    Author: Julia Amoros Franco
*/

public class Ejercicio20Ev1 {
    public static void main (String[] args){
        /* 
        //CON ARRAY
        String[] figuras = {"corazon", "diamante", "herradura", "campana", "limon"}; //array

        //randomizamos las 3 salidas de la tirada 
        int salida1 = (int)(Math.random() * 5);
        String figura1 = figuras[salida1];

        int salida2 = (int)(Math.random() * 5);
        String figura2 = figuras[salida2];

        int salida3 = (int)(Math.random() * 5);
        String figura3 = figuras[salida3];

        System.out.println(figura1 + " | " + figura2 + " | " + figura3);
        if (figura1.equals(figura2) && figura1.equals(figura3))
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        else if (figura1.equals(figura2) && !figura1.equals(figura3) || 
                figura1.equals(figura3) && !figura1.equals(figura2) ||
                figura2.equals(figura3) && !figura2.equals(figura1))
                System.out.println("Bien, ha recuperado su moneda");
        else 
            System.out.println("Lo siento, ha perdido");
        */
            //SIN ARRAY
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";
        
        int salida1 = (int)(Math.random() * 5 + 1);
        int salida2 = (int)(Math.random() * 5 + 1);
        int salida3 = (int)(Math.random() * 5 + 1);

        switch (salida1) {
            case 1: figura1 = "corazon"; break;
            case 2: figura1 = "diamante"; break;
            case 3: figura1 = "herradura"; break;
            case 4: figura1 = "campana"; break;
            case 5: figura1 = "limon"; break;
        }

        switch (salida2) {
            case 1: figura2 = "corazon"; break;
            case 2: figura2 = "diamante"; break;
            case 3: figura2 = "herradura"; break;
            case 4: figura2 = "campana"; break;
            case 5: figura2 = "limon"; break;
        }

        switch (salida3) {
            case 1: figura3 = "corazon"; break;
            case 2: figura3 = "diamante"; break;
            case 3: figura3 = "herradura"; break;
            case 4: figura3 = "campana"; break;
            case 5: figura3 = "limon"; break;
        }

        System.out.println(figura1 + " | " + figura2 + " | " + figura3);
        if (figura1.equals(figura2) && figura1.equals(figura3))
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        else if (figura1.equals(figura2) && !figura1.equals(figura3) || 
                figura1.equals(figura3) && !figura1.equals(figura2) ||
                figura2.equals(figura3) && !figura2.equals(figura1))
                System.out.println("Bien, ha recuperado su moneda");
        else 
            System.out.println("Lo siento, ha perdido");

        //CON FOR
    }
}