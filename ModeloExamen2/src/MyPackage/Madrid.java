package MyPackage;

public class Madrid extends ClimaPais{

	public Madrid(double grados) {
		super("Madrid", grados);
	}
	
	public boolean sembrado() {
		boolean sem=false;
		
		if(super.getGrados()<15) {
			sem=true;
		}
		return sem;
		
	}

	
	
	

}
