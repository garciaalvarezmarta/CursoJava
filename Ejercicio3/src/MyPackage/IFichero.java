package MyPackage;

import java.time.LocalDate;

public interface IFichero {
	public String getRuta();
	public String getContenido();
	public LocalDate getFecha();
	public void setRuta(String ruta);
	public void setContenido(String contenido);
	public void setFecha(LocalDate fecha);
	public void createFile(Fichero f);

}
