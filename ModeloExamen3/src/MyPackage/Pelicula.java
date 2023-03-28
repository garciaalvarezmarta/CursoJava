package MyPackage;

public class Pelicula extends Recaudacion {
	private String titulo;
	
	
	public Pelicula(String titulo, long ganancia, int year) {
		super(ganancia,year);
		this.titulo = titulo;
	}
	
	

	public Pelicula(int ganancia, int year) {
		super(ganancia, year);
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	
	
	
	

}
