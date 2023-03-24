package MyPackage;

import java.time.LocalDate;

public interface IPersona {
	public String getNombre();
	
	public LocalDate getFechaNac();
	
	public String getPais();
	
	public void setNombre(String n);
	
	
	public void setFechaNac(LocalDate f);
	
	public void setPais(String p);

}
