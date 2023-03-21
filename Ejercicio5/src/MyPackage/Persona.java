package MyPackage;

public class Persona {
	private String name;
	private String status;

	public Persona(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	public Persona () {
		this.name="";
		this.status="";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void checkStatus(int status) {
		String [] chistes = {"¿Cuál es el último animal que subió al arca de Noé? El del-fin.","¿Qué le dice un gusano a otro gusano? Voy a dar una vuelta a la manzana.","Si los zombies se deshacen con el paso del tiempo ¿zombiodegradables?"};
		int num=(int)(Math.random()*3+1);
		
		switch(status) {
		case 1:{
			setStatus("Enojado");
			System.out.println("Deberías hacer yoga");
			
		}break;
		case 2:{
			setStatus("Triste");
			System.out.println("Deberías ir a terapia");
			
		}break;
		case 3:{
			setStatus("Feliz");
			System.out.println("Muy bien. ¡Sigue así!");
			
		}break;
		case 4:{
			setStatus("Preocupado");
			System.out.println("Deberías hablar con alguien de lo que te preocupa.");
			
		}break;
		case 5:{
			setStatus("Aburrido");
			System.out.println("Te voy a contar un chiste: \n"+ chistes[num-1]);
			
		}break;
		case 6:{
			setStatus("Somnoliento");
			System.out.println("Deberías tomarte un café");
		}break;
		
		}
	}

}
