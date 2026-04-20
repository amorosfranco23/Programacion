public class Partido {
    private String nombre;
    private int numeroEscanios;
    private int numeroVotos;

    public Partido(String nombre, int numeroVotos){
        this.nombre = nombre;
        this.numeroVotos = numeroVotos;
        numeroEscanios = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumeroEscanios(){
        return numeroEscanios;
    }

    public int getVotos(){
        return numeroVotos;
    }
    
    public void anadirEscanio(){
        return this.numeroEscanios++;
    }
}

