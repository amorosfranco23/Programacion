/**
    Esta clase representa a un trabajador de un empresa. Sus datos son id del 1 al 100, 
    nombre, estado civil (S/C), turno (D/N), titulacion (0 a 4) y años de antigüedad.
    Con nomina especial dependiendo de las caracteristicas del trabajadaor:
        salario base de 425€, 100€ turno N, 75€ por año, 250/500/1000/1250/1500 pot titulacion
        retencion d eimpuestos del 12% a todos excepto a los casados (10%)

    @author: Julia Amoros
    fecha: 20260123
*/


public class Trabajador {
    private int id; // 1 al 100
    private String nombre;
    private char estadoCivil; // S o C
    private char turno; // D o N
    private int titulacion; // 0 a 4
    private int antiguedad;

    public Trabajador(int id, String nombre, char estadoCivil, char turno,
                        int titulacion, int antiguedad) {
        setId(id);
        setNombre(nombre);
        setTitulacion(titulacion);
        setEstadoCivil(estadoCivil);
        setTurno(turno);
        setAntiguedad(antiguedad);
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getTitulacion(){
        return titulacion;
    }

    public char getEstadoCivil(){
        return estadoCivil;
    }

    public char getTurno(){
        return turno;
    }

    public int getAntiguedad(){
        return antiguedad;
    }

    public void setId(int id){
        if (id < 1 || id > 100)
            throw new IllegalArgumentException("El identificador no está dentro del rango correcto.");
        this.id = id;
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        this.nombre = nombre;
    }

    public void setTitulacion(int titulacion){
        if (titulacion < 0 || titulacion > 4)
            throw new IllegalArgumentException("La titulación no corresponde con ninguna válida.");
        this.titulacion = titulacion;
    }

    public void setEstadoCivil(char estadoCivil){
        this.estadoCivil = estadoCivil;
        if (estadoCivil != 'S' || estadoCivil != 'C')
            throw new IllegalArgumentException("El estado no corresponde con ninguno válido.");
    }

    public void setTurno(char turno){
        if (turno != 'D' || turno != 'N')
            throw new IllegalArgumentException("El turno no corresponde con ninguno válido.");
        this.turno = turno;
    }

    public void setAntiguedad(int antiguedad){
        if (antiguedad < 0)
            throw new IllegalArgumentException("La antigüedad no puede ser un valor negativo.");
        this.antiguedad = antiguedad;
    }

    public String datosTrabajador(){
        return "El numero de identificación de este trabajador es: " + id + ". Su nombre es "
        + nombre + ", con estado civil: " + estadoCivil + ". Trabaja el turno " + turno + 
        " , con titulación " + titulacion + ", y sus años en la empresa son " + antiguedad;
    }

    public double nomina(){
        double salario = 425;

        if (turno == 'N')
            salario += 100;

        salario += 75 * antiguedad;

        switch(titulacion){
            case 0: salario += 250; break;
            case 1: salario += 500; break;
            case 2: salario += 1000; break;
            case 3: salario += 1250; break;
            case 4: salario += 1500; break;
        }
        

        if (estadoCivil == 'S')
            salario = salario - (salario * 0.12);
        else if (estadoCivil == 'C')
            salario = salario - (salario * 0.1);

        return salario;
    }
}
