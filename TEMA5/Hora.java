/**
 * Esta clase representa una hora. Tiene la hora 0 inicializada, puede sumar y restar horas,
 * y sale formateada como hh:mm:ss, en modo 24 horas.
 * @author: Julia Amoros
 * fecha: 20260128
 */

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(){
        this(0,0,0);
    }

    public Hora (int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int hora(){
        return hora;
    }

    public int minutos(){
        return minutos;
    }

    public int segundos(){
        return segundos;
    }

    public void setHora(int hora){
        if (hora > 23 || hora < 0){
            System.out.println("Error: hora errónea.");
            this.hora = 0;
        }
        else
            this.hora = hora;
    }

    public void setMinutos(int minutos){
        if (minutos < 0 || minutos > 59){
            System.out.println("Error: minutos erróneos.");
            this.minutos = 0;
        }
        else 
            this.minutos = minutos;
    }

    public void setSegundos(int segundos){
        if (segundos < 0 || segundos > 59){
            System.out.println("Error: segundos erróneos.");
            this.segundos = 0;
        }
        else 
            this.segundos = segundos;
    }

    public void sumarSegundos(){
        int totalSegundos = hora * 3600 + minutos * 60 + segundos;

        int totalHoras = 86400;
    }

    public void sumarHoras(){
        if (hora > 24)
            hora = hora - 24;
        else if (hora < 0)
            hora = hora + 24;
    }

    public void restarHoras(){
        
    }

    public String formatoHora(){
        return hora + ":" + minutos + ":" + segundos;
    }
}
