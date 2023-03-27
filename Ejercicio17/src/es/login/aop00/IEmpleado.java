package es.login.aop00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public interface IEmpleado {
	
	public String getNombre();

	public void setNombre(String nombre);

	public String getApellido();

	public void setApellido(String apellido);
	public int getEdad();
	public void setEdad(int edad);
	public void cierrePrograma(AnnotationConfigApplicationContext contexto);

}
