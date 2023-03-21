package MyPackage;

import java.time.LocalDate;

public interface IEmpleado {

	public LocalDate getfechaIngreso();
	public int getSalario();
	public int getantiguedad();
	public String posicion();
	
	public void setFechaIngreso(LocalDate fecha);
	public void setSalario(int salario);
	public void setAntiguedad();
	
	public void setPosicion(String posicion);
	
	public int checkAntiguedad();
}
