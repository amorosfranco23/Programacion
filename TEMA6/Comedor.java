package Programacion.TEMA6;

import java.util.Scanner;

public class Comedor {
    private final int MAX_MENUS = 100;

    Scanner sc = new Scanner(System.in);
    Plato[] platos;
    Pedido[] pedidos;
    int menusServidos;

    private static void crearPlatos(Plato[] platos){
        for(int i = 0; i < platos.length; i++)
            platos[i] = new Plato("Plato" + i, "cosasP" + i, (int)(Math.random()*100+100));
    }

    private static void crearComandas(){
        int numeroDePedidos;
        int numeroDeMenus;

        System.out.print("Introduce número de menús: ");

        numeroDeMenus = sc.nextInt();
        sc.nextLine();
        while (numeroDeMenus > 0 && menusServidos < MAX_MENUS)
            if(MAX_MENUS - menusServidos > numeroDeMenus){
                    pedidos[numeroDePedidos] = new Pedido(numeroDeMenus);
                    for (int i = 0; i < numeroDeMenus(); i++){
                        plato1 = platos[(int(Math.random()*6))];
                        plato2 = platos[(int(Math.random()*6))];
                        Pedido[numeroDePedidos].annadeMenu(plato1, plato2);}
                    System.out.println("Coste: ", Pedido[numeroDePedidos].precio());
                    System.out.print("Introduce pago: ");
                    numeroDeMenus = sc.nextInt();
                    sc.nextLine();
                    //numeroDePedidos++; o --v
                    Pedido[numeroDePedidos++].pagar();
                }
    }

    private static void mostrarMenus(){
        //Resguardo
        System.out.println("Muestra menus");
    }
    public static void main (String[]args){

        crearPlatos(platos = new Plato[6]);
        pedidos = new Pedido[MAX_MENUS];
        
        crearComandas();
        mostrarMenus();
    }
}
