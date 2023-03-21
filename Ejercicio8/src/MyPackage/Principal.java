package MyPackage;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {

	public static void main(String[] args) {
		LocalDate fecha= LocalDate.now();
		Empleado e1 = new Empleado("Juan","Perez", "05678944Q",LocalDate.of(1983, 06, 15),"Madrid",LocalDate.of(2010, 04, 25), 35000,"Desarrollador");
		Empleado e2 = new Empleado("Juan","Perez", "05678944Q",LocalDate.of(1983, 06, 15),"Madrid",LocalDate.of(2010, 04, 25), 35000,"Desarrollador");
		Empleado e3 = new Empleado("Elena","García", "34568976S",LocalDate.of(1990, 02, 18),"Teruel",LocalDate.of(2019, 10, 01), 40000,"Tech Lider");
		Empleado e4 = new Empleado("Cristina","González", "12345678P",LocalDate.of(1989, 11, 24),"Huelva",LocalDate.of(2020, 06, 12), 30000,"Project Manager");
		Empleado e5 = new Empleado("Alfonso","Diaz", "98765432L",LocalDate.of(1978, 04, 03),"Toledo",LocalDate.of(2007, 01, 25), 50000,"Ingeniero de Software");
		
		e1.setAntiguedad();
		e2.setAntiguedad();
		e3.setAntiguedad();
		e4.setAntiguedad();
		e5.setAntiguedad();
		
		Set<Empleado> empleados = new HashSet<>();
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		
		try {
			String ruta = "C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\Ejercicio8\\info_salarial_plantilla_"+LocalDate.now()+".txt";	
			String contenido="";
			String contenidoEmp1="";
			int num=1;
			for(Empleado empleado:empleados) {
				contenidoEmp1 = "\n--EMPLEADO "+num+"-- \n Nombre:"+ empleado.getNombre()+"\n Apellido: " +empleado.getApellido()+"\n Dni:"+ empleado.getDni() + "\n Edad:" + empleado.getEdad()+"\n Localidad: "+empleado.getLocalidad()+"\n Salario: "+empleado.getSalario()+"\n Puesto: " + empleado.posicion()+"\n Antiguedad: "+empleado.getantiguedad()+"\n";
				contenido=contenido+contenidoEmp1;
				num=num+1;
			}
			
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
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}

}
