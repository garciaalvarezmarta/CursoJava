package es.login.aop;

import java.io.BufferedWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component

public class DAOEmpleado //implements IEmpleado,IGenerarTxt 
{
	
	public void finalizacion()
	{
			System.out.println("se esta cerrando el programa");
	
	}
	
	
	
	private String nombre;
	private String apellido;
	private int edad;

	public DAOEmpleado() {
		
	}
	
	public DAOEmpleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void generarTxt(DAOEmpleado e2) {
		
		try {
			String ruta = "C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\Ejercicio17\\Empleados.txt";	
			String contenido = "Nombre \t Apellido \t Edad \n";
			contenido+= this.nombre + " \t" + this.apellido + " \t" + this.edad + "\n";
			contenido+= e2.nombre + " \t" + e2.apellido + " \t" + e2.edad;
			File archivo = new File(ruta);
			
			if (!archivo.exists())
				{
					archivo.createNewFile();
				}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
		
			}
	}
	
	public void cierrePrograma(AnnotationConfigApplicationContext contexto) {
		contexto.close();
	}

}
