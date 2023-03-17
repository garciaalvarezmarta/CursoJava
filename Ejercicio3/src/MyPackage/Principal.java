package MyPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Elena", "Gutierrez", "Ingeniera", "30000");
		Empleado empleado2 = new Empleado("Javier", "Martinez", "Desarrollador", "27000");
		Empleado empleado3 = new Empleado("Jimena", "Perez", "Tecnica", "25000");

		try {
			LocalDate fecha = LocalDate.now();
			String ruta = "C:\\\\Users\\\\mgarciaalv\\\\Documents\\\\CURSOS\\\\info_empleados_"+fecha+".txt";

			String contenido = empleado1.getNombre() + empleado1.getApellido() + "\n" + empleado1.getPosicion() + "\n"
					+ empleado1.getSueldo() + "\n" + "\n";
			contenido += empleado2.getNombre() + empleado2.getApellido() + "\n" + empleado2.getPosicion() + "\n"
					+ empleado2.getSueldo() + "\n" + "\n";
			contenido += empleado3.getNombre() + empleado3.getApellido() + "\n" + empleado3.getPosicion() + "\n"
					+ empleado3.getSueldo() + "\n" + "\n";

			File fichero = new File(ruta);

			if (!fichero.exists()) {
				fichero.createNewFile();
			}

			FileWriter fw = new FileWriter(fichero);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
