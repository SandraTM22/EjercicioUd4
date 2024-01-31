package escuelaDeVuelo;

public class Piloto {

	// Atributos propios de Piloto
	private int idPiloto;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;

	// Constructor para Piloto, no es obligatorio que los parametros tenga el mismo
	// nombre que los atributos
	public Piloto(int id, String nombre, int horasVuelo, String rango) {
		this.idPiloto = id;
		this.nomPiloto = nombre;
		this.horasVueloPiloto = horasVuelo;
		this.rangoPiloto = rango;

	}

	// Obtención de datos del piloto

	// Obtención Id
	public int getId() {
		return idPiloto;
	}

	// Obtención nombre
	public String getNombre() {
		return nomPiloto;
	}

	// Obtención horas de vuelo
	public int getHorasVuelo() {
		return horasVueloPiloto;
	}

	// Obtención del rango del piloto
	public String getRango() {
		return rangoPiloto;
	}

	// Obtención de todos los datos
	public void mostrarPiloto() {

		System.out.println("El " + rangoPiloto + " " + nomPiloto + ", con código de identificación " + idPiloto
				+ ", tiene acumuladas " + horasVueloPiloto + " horas de vuelo. ");

	}

	// Modificacion de datos del objeto Piloto

	// Modificar Rango
	public void setRango(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

	// Modificar Horas de vuelo
	public void setHorasVuelo(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

}
