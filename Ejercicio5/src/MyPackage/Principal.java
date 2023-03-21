package MyPackage;

import java.util.Scanner;
import java.time.LocalDateTime;


public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		LocalDateTime fecha = LocalDateTime.now();
		int opcion;
		
		System.out.println("--BUENOS DÍAS-- \n Fecha y hora de hoy: " +fecha+"\n ¿Cuál es tu nombre?");
		p.setName(sc.next());
		
		do {
			System.out.println("Hola"+p.getName()+"¿Cómo te encuentras hoy?");
			System.out.println("1.Enojado \n 2.Triste \n 3.Feliz \n 4.Preocupado \n 5.Aburrido \n 6.Somnoliento");
			opcion=sc.nextInt();
		}while(opcion<1 || opcion>6);
		
		p.checkStatus(opcion);
		sc.close();

	}

}
