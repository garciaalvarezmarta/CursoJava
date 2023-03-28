package MyPackage;

import java.util.List;
import java.util.ArrayList;

public class Tienda implements ITienda{

	private int totalVentas;
	private List <Producto> productosVendidos;
	
	
	public Tienda(int totalVentas) {
		super();
		this.totalVentas = totalVentas;
		this.productosVendidos=new ArrayList<>();
	}
	
	public Tienda() {
		
	}


	public int getTotalVentas() {
		return totalVentas;
	}


	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}

	
	public void addProducto(Producto p) {
		this.productosVendidos.add(p);
		this.totalVentas=this.totalVentas+1;
	}
	
	public void deleteProducto(Producto p) {
		this.productosVendidos.remove(p);
		this.totalVentas=this.totalVentas-1;
	}
	
	public Producto getPos(int n) {
		return this.productosVendidos.get(n);
	}
	
	public int getSize() {
		return this.productosVendidos.size();
	}
	
	
	
}


