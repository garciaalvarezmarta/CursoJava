package MyPackage;

public class ClimaPais {

	String pais;
	double grados;
	
	public ClimaPais(String pais, double grados) {
		this.pais = pais;
		this.grados = grados;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}
}
