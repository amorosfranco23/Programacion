public class Partido {
    private String nombre;
    private int numeroEscanios;
    private int numeroVotos;

    public Partido(String nombre, int numeroVotos){
        this.nombre = nombre;
        this.numeroVotos = numeroVotos;
        numeroEscanios = 0;
    }
}
