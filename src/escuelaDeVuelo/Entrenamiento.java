package escuelaDeVuelo;

public class Entrenamiento extends Avion {

	// Atributos propios de la clase entrenamiento
	private boolean tieneDobleMando;

	//Constructor
	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}

	// Mostrar toda la información
	public void mostrarAvion() {
		String cadena;
		if (tieneDobleMando) {
			cadena = " y tiene doble mando para permitir al instructor tomar el control. ";
		} else {
			cadena = " y este modelo no tiene doble mando para permitir al instructor tomar el control.";
		}

		System.out.println("El avión " + getIdAvion() + " " + getModAvion() + ",  con capacidad de  " + getCapAvion()
				+ " ocupantes, es pilotado por el Sr./Sra. " + getPiloto().getNombre() + cadena);

	}

}
