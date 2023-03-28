package MyPackage;

import java.time.LocalDate;

public class Producto extends Tienda{
	
	private String tipo;
	private int precioUnitario;
	private double precioFinal;
	private LocalDate diaVenta;
	private int numVentas;
	private double promedio;
	
	public Producto(String tipo, int precioUnitario, int totalVentas, int numTotalProductosVendidos,
			LocalDate diaVenta, int numVentas) {
		super(totalVentas);
		this.tipo=tipo;
		this.precioUnitario = precioUnitario;
		this.diaVenta = diaVenta;
		this.numVentas = numVentas;
	}
	
	
	public Producto(String tipo, int precioUnitario, int numVentas,
			LocalDate diaVenta) {
		this.tipo=tipo;
		this.precioUnitario = precioUnitario;
		this.diaVenta = diaVenta;
		this.numVentas = numVentas;
	}
	
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioFinal() {
		return aplicarIVA(this.precioUnitario);
	}

	public void setPrecioFinal() {
		this.precioFinal=aplicarIVA(this.precioUnitario);
	}

	public LocalDate getDiaVenta() {
		return diaVenta;
	}
	
	public double getPromedio() {
		return promedioVentas();
	}

	public void setDiaVenta(LocalDate diaVenta) {
		this.diaVenta = diaVenta;
	}
	
	public void setPromedio() {
		this.promedio=promedioVentas();
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	
	public double aplicarIVA (double precio) {
		return precio*1.21;
	}
	
	public int promedioVentas() {
		int totalVentas= super.getTotalVentas();
		int totalVentaProducto= this.getNumVentas();
		
		
		return totalVentas/totalVentaProducto;
	}

	
	

}
