public class Fecha {
// Atributos
int dia;
 int mes;
 int anio;

// Constructor
public Fecha (int dia, int mes, int anio) {
	if(anio<1) {
		System.out.print("“Anio invalido”");
	}
	if (mes<1 || mes >12 ) {
		System.out.println("“Mes invalido”");
	}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	// Getters (Métodos observadores)
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	// Setters (metodos transformadores)
	public Fecha incrementaDias(int dias) {
		int d = this.dia;
		int m = this.mes;
		int y = this.anio;
		int restante = dias;

		while (restante > 0) {
			int diasMes = diasEnMes(m, y);
			int hastaFinMes = diasMes - d;
			if (restante <= hastaFinMes) {
				d += restante;
				restante = 0;
			} else {
				// avanza al primer día del siguiente mes
				restante -= (hastaFinMes + 1);
				d = 1;
				m++;
				if (m > 12) {
					m = 1;
					y++;
				}
			}
		}

		return new Fecha(d, m, y);
	}

	private static int diasEnMes(int mes, int anio) {
		switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return esBisiesto(anio) ? 29 : 28;
			default:
				return 31; // valor por defecto, aunque mes inválido ya sería problema previo
		}
	}

	private static boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
}