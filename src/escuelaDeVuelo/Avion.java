package escuelaDeVuelo;

public class Avion {
	// Atributos propios de la clase avión
	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;

	//Constructor
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;

	}

	// Mostar IdAvion
	public int getIdAvion() {
		return idAvion;
	}

	// Mostrar modAvion
	public String getModAvion() {
		return modAvion;
	}

	// Mostrar capacidad avion
	public int getCapAvion() {
		return capAvion;
	}

	// Asignar piloto
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	// Mostar que piloto esta asignado
	public Piloto getPiloto() {
		return piloto;
	}

	// Mostrar toda la información
	public void mostrarAvion() {

		System.out.println("El avión " + idAvion + " " + modAvion + ",  con capacidad de  " + capAvion
				+ " ocupantes, es pilotado por el piloto " + piloto.getNombre());

	}

}
