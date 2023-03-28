package MyPackage;

import java.time.LocalDate;

public interface IProducto {

	public String getTipo();

	public void setTipo(String tipo);

	public int getPrecioUnitario();

	public void setPrecioUnitario(int precioUnitario);

	public double getPrecioFinal();

	public void setPrecioFinal();

	public LocalDate getDiaVenta();
	
	public double getPromedio();

	public void setDiaVenta(LocalDate diaVenta);
	
	public void setPromedio();

	public int getNumVentas();

	public void setNumVentas(int numVentas);
	
	public double aplicarIVA (double precio);
	
	public int promedioVentas();
		
	
}
