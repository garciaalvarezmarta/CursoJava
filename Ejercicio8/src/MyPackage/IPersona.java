package MyPackage;

import java.time.LocalDate;

public interface IPersona {

	public String getNombre();
	public String getApellido();
	public String getDni();
	public LocalDate getFechaNacimiento();
	public String getLocalidad();
	
	public int getEdad();
	
	public String setLocalidad();
	
	public void setNombre(String nombre);
	
	public void setApellido(String apellido);
	public void setDni(String dni);
	
	public void setEdad() ;
	
	public void setFechaNacimiento(LocalDate fecha);
	
	public int checkEdad();
}
