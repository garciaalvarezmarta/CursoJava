package MyPackage;

public class Persona implements IPersona{

	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}

}
