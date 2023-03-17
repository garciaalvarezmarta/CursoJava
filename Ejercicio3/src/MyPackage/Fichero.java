package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Fichero implements IFichero{
	private String ruta;
	private String contenido;
	private LocalDate fecha;
	
	public Fichero (String ruta, String contenido, LocalDate fecha){
		this.ruta=ruta;
		this.contenido=contenido;
		this.fecha=fecha;
	}
	
	public String getRuta() {
		return this.ruta;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setRuta(String ruta) {
		this.ruta=ruta;
	}
	
	public void setContenido(String contenido) {
		this.contenido=contenido;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha=fecha;
	}
	
	public void createFile(Fichero f) {
		try {
			
			File fichero = new File(f.getRuta());

			if (!fichero.exists()) {
				fichero.createNewFile();
			}

			FileWriter fw = new FileWriter(fichero);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(f.getContenido());
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
