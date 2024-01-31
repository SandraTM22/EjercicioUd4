package escuelaDeVuelo;

public class Combate extends Avion {

	private boolean esFurtivo;

	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;

	}

	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}

	// Mostrar toda la información
	public void mostrarAvion() {
		String cadena;
		if (esFurtivo) {
			cadena = " y tiene es furtivo, ¡Invisible a radares! o casi. ";
		} else {
			cadena = " y este modelo no es furtivo.";
		}
		System.out.println("El avión " + getIdAvion() + " " + getModAvion() + ", con capacidad de  " + getCapAvion()
				+ " ocupantes, es pilotado por el Sr./Sra. " + getPiloto().getNombre() + cadena);

	}

}
