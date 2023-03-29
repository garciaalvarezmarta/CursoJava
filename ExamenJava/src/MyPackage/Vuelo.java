
package MyPackage;

import java.time.LocalDate;

public class Vuelo implements ICalculoVuelo{
	private String nombreVuelo;
	private int numPasajeros;
	LocalDate fechaVuelo;
	
	public Vuelo(String nombreVuelo, int numPasajeros, LocalDate fechaVuelo) {
		super();
		this.nombreVuelo = nombreVuelo;
		this.numPasajeros = numPasajeros;
		this.fechaVuelo = fechaVuelo;
	}

	public String getNombreVuelo() {
		return nombreVuelo;
	}

	public void setNombreVuelo(String nombreVuelo) {
		this.nombreVuelo = nombreVuelo;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	
	public int diasDiferencia() {
		LocalDate fechaActual=LocalDate.now();
		return fechaActual.getDayOfMonth()-this.fechaVuelo.getDayOfMonth();
	}
	
	
	
	
	
	
	

}
