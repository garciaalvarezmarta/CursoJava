package MyPackage;

import java.time.LocalDate;

public class Persona implements IEdad,IPersona{
	
	private String nombre;
	private LocalDate fechaNac;
	private String pais;
	private int edad;

	public Persona() {
		
	}
	
	public Persona(String nombre, LocalDate fechaNac, String pais) {
		this.nombre=nombre;
		this.fechaNac=fechaNac;
		this.pais=pais;
		this.edad=edad;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaNac() {
		return this.fechaNac;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public void setFechaNac(LocalDate f) {
		this.fechaNac=f;
	}
	
	public void setPais(String p) {
		this.pais=p;
	}
	
	public int edad() {
		LocalDate fechaActual= LocalDate.now();
		int edad = fechaActual.getYear()-fechaNac.getYear();
		if(fechaActual.getMonthValue()<fechaNac.getMonthValue()) {
			edad = edad-1;
		}
		return edad;
	}

}
