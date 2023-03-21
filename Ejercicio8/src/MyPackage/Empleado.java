package MyPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado extends Persona implements IEmpleado{
	private LocalDate fechaIngreso;
	private int salario;
	private int antiguedad;
	private String posicion;
	private DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd");

	/*public Empleado() {
		// TODO Auto-generated constructor stub
	}*/
	
	public Empleado(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String localidad, LocalDate fechaingreso, int salario, String posicion) {
		super(nombre, apellido, dni, fechaNacimiento, localidad);
		this.fechaIngreso=fechaingreso;
		this.salario=salario;
		this.posicion=posicion;
	}
	
	public LocalDate getfechaIngreso() {
		return fechaIngreso;
	}
	public int getSalario() {
		return salario;
	}
	public int getantiguedad() {
		return checkAntiguedad();
	}
	public String posicion() {
		return posicion;
	}
	
	public void setFechaIngreso(LocalDate fecha) {
		this.fechaIngreso=fecha;
	}
	public void setSalario(int salario) {
		this.salario=salario;
	}
	public void setAntiguedad() {
		this.antiguedad=checkAntiguedad();
	}
	
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public int checkAntiguedad() {
		LocalDate fechaActual = LocalDate.now();
		int anoAntiguedad = fechaActual.getYear()-fechaIngreso.getYear();
		if(fechaActual.getMonthValue()<fechaIngreso.getMonthValue()) {
			anoAntiguedad = anoAntiguedad-1;
		}
		return anoAntiguedad;
		
	}

}
