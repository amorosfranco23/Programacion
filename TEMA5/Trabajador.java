/*
    Definir clase Trabajador, sus datos serian id del 1 al 100, nombre, estado civil (S/C), turno (D/N), 
    titulacion (0 a 4) y años enla empresa.
    Con metodos --> constructor con parametros fijos para un trabajdor nuevo
    modificar cualquier datps mnos el identificador, devolvr un string con los datos de un trbaajador,
    calcular la nomina:
        salario base de 425€, 100€ extra en turno N, 75€ por año, 250/500/1000/1250/1500 pot titulacion
        retencion d eimpuestos del 12% a todos excepto a los casados (10%)
*/


public class Trabajador {
    private int id;
    private String nombre;
    private char estadoCivil;
    private char turno;
    private int titulacion;
    private int antiguedad;

    public Trabajador (String nombre){
        if (nombre == null || nombre.isEmpty())
            System.out.println("Error: sin nombre");
        this.nombre = nombre;
    }

    public Trabajador (int id, String nombre){
        this(nombre);
        if (id < 1 || id > 100)
            System.out.println("Error: identificador no válido");
        this.id = id;
    }

    public Trabajador (int id, String nombre, int titulacion){
        this(id, nombre);
        if (titulacion < 0 || titulacion > 4)
            System.out.println("Error: titulación errónea");
        this.titulacion = titulacion;
    }

    public Trabajador (int id, String nombre, int titulacion, 
        char estadoCivil, char turno){
        this (id, nombre, titulacion);
        if (estadoCivil != 'S' || estadoCivil != 'C' || turno != 'D' || turno != 'N')
            System.out.println("Error: Datos");
        this.estadoCivil = estadoCivil;
        this.turno = turno;
    }

    public Trabajador (int id, String nombre, int titulacion, 
        char estadoCivil, char turno, int antiguedad) {
        this (id, nombre, titulacion, estadoCivil, turno);
        if (antiguedad < 0)
            System.out.println("Error: antigüedad inválida");
        this.antiguedad = antiguedad;
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

    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty())
            System.out.println("Error: sin nombre");
        this.nombre = nombre;
    }

    public void setTitulacion(int titulacion){
        if (titulacion < 0 || titulacion > 4)
            System.out.println("Error: titulación errónea");
        this.titulacion = titulacion;
    }

    public void setEstadoCivil(char estadoCivil){
        if (estadoCivil != 'S' || estadoCivil != 'C')
            System.out.println("Error: estado invalido");
        this.estadoCivil = estadoCivil;
    }

    public void setTurno(char turno){
        if (turno != 'D' || turno != 'N')
            System.out.println("Error: turno invalido");
        this.turno = turno;
    }

    public void setAntiguedad(int antiguedad){
        if (antiguedad < 0)
            System.out.println("Error: antigüedad inválida");
        this.antiguedad = antiguedad;
    }
}
