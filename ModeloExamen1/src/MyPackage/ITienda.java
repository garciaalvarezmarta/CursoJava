package MyPackage;

public interface ITienda {
	
	public int getTotalVentas();


	public void setTotalVentas(int totalVentas);

	
	public void addProducto(Producto p);
	
	public void deleteProducto(Producto p);
	
	public Producto getPos(int n);
	
	public int getSize();

}
