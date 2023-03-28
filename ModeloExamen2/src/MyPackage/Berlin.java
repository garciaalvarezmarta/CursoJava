package MyPackage;

public class Berlin extends ClimaPais{

	public Berlin(double grados) {
		super("Berlin", grados);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean produccion() {
		boolean prod=false;
		if(super.getGrados()>=20) {
			prod=true;
		}
		return prod;
	}
	

	
	

}
