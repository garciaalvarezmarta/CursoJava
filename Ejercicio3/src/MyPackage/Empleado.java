package MyPackage;

public class Empleado extends Persona implements IEmpleado {
	private String posicion;
	private String sueldo;

	public Empleado(String nombre, String apellido, String posicion, String sueldo) {
		super(nombre,apellido);
		this.posicion=posicion;
		this.sueldo=sueldo;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	public String getSueldo() {
		return this.sueldo;
	}
	
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	
	public void setSueldo(String sueldo) {
		this.sueldo=sueldo;
	}

}
