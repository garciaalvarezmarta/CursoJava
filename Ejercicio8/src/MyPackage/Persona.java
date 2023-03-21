package MyPackage;

import java.time.LocalDate;

public class Persona implements IPersona {
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private int edad;
	private String localidad;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String localidad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.localidad=localidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getDni() {
		return this.dni;
	}
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public int getEdad() {
		return checkEdad();
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public String setLocalidad() {
		return this.localidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	
	public void setEdad() {
		this.edad=checkEdad();
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento=fecha;
	}
	
	public int checkEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear()-fechaNacimiento.getYear();
		if(fechaActual.getMonthValue()<fechaNacimiento.getMonthValue()) {
			edad = edad-1;
		}
		return edad;
	}

}
