package MyPackage;

import java.time.LocalDate;

public class Billete extends Vuelo implements ICalculoBillete {
	private String tipoPasaje;
	private int valorUnitario;

	public Billete(String nombreVuelo, int numPasajeros, String tipoPasaje, int valorUnitario, LocalDate fechaVuelo) {
		super(nombreVuelo, numPasajeros, fechaVuelo);
		this.tipoPasaje = tipoPasaje;
		this.valorUnitario = valorUnitario;
	}

	public String getTipoPasaje() {
		return tipoPasaje;
	}

	public void setTipoPasaje(String tipoPasaje) {
		this.tipoPasaje = tipoPasaje;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int valorFinalVuelo() {
		return this.valorUnitario * super.getNumPasajeros();
	}

	public boolean segmentacion() {
		boolean res=false;
		
		if(this.tipoPasaje.contains("ECONOMICO") ) {
			if(this.valorFinalVuelo()>=100) {
				res=true;
			}
		}
		if(this.tipoPasaje.contains("PREMIER")) {
			if(this.valorFinalVuelo()>=1500) {
			res=true;
		}
			
			
		}
		return res;
	}

}
