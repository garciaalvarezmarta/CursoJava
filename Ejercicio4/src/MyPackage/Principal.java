package MyPackage;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int num = (int)(Math.random()*100+1);
		int numUser=-1;
		int intentos=3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("--Adivina el número-- \n Tienes "+intentos+" intentos");
		
		while(numUser!=num && intentos>0) {
			
			System.out.println("Elige un número. \n Intentos: "+intentos);
			
			numUser=sc.nextInt();
			
			if(numUser!=num && intentos>0) {
				System.out.println("Fallaste.");
				intentos--;
			}
			
		}
		sc.close();
		
		if(intentos>0) {
			System.out.println("¡Enhorabuena, acertaste el número "+num+"!");
		}
		else {
			System.out.println("Lo siento. Te quedaste sin intentos.");
		}
		

	}

}
