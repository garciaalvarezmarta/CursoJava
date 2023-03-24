package MyPackage;

import java.time.LocalDate;

public class Usuario extends Persona implements IUsuario,IAntiguedad,ISegmento,IStatus {
	private LocalDate fechaRegistro;
	private LocalDate ultimoLogin;
	private int numCompras;
	private int antiguedad;
	private String segmento;
	private String status;

	public Usuario() {

	}

	public Usuario(String nombre, LocalDate fechaNac, LocalDate fechaRegistro, LocalDate ultimoLogin, int numCompras,
			String pais) {
		super(nombre, fechaNac, pais);
		this.fechaRegistro = fechaRegistro;
		this.ultimoLogin = ultimoLogin;
		this.numCompras = numCompras;
		this.antiguedad=antiguedad();
		this.segmento=segmento();
		this.status=status();
	}

	public LocalDate fechaRegistro() {
		return this.fechaRegistro;
	}

	public LocalDate ultimoLogin() {
		return this.ultimoLogin;
	}

	public int numCompras() {
		return this.numCompras;
	}

	public void setFecharegistro(LocalDate f) {
		this.fechaRegistro = f;
	}

	public void setUltimoLogin(LocalDate u) {
		this.ultimoLogin = u;
	}

	public void setNumCompras(int n) {
		this.numCompras = n;
	}
	
	public int antiguedad () {
		LocalDate fRegistro=this.fechaRegistro;
		LocalDate fechaActual= LocalDate.now();
		int antiguedad = fechaActual.getYear()-fRegistro.getYear();
		
		if(fechaActual.getMonthValue()<fRegistro.getMonthValue()) {
			antiguedad = antiguedad-1;
		}
		return antiguedad;
	}
	
	public String segmento() {
		int puntos = this.numCompras;
		String segmento="";
		if(puntos>=1 && puntos<=5) {
			segmento="Estandar user";
		}else if(puntos>=6 && puntos<=10) {
			segmento="Affiliate";
		}else if(puntos>=11) {
			segmento="Premier";
		}
		return segmento;
	}
	
	public String status() {
		LocalDate uLogin = this.ultimoLogin;
		LocalDate fechaActual=LocalDate.now();
		String actividad="";
		int status= fechaActual.getYear()-uLogin.getYear();
		if(fechaActual.getMonthValue()<uLogin.getMonthValue()) {
			status = status-1;
		}
		if(status>=2) {
			actividad="Inactivo";
		}else {
			actividad="Activo";
		}
		return actividad;
		
	}

}
