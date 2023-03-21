package MyPackage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class Principal {

	public static void main(String[] args) {
		Set<String> nombres = new HashSet<>();
		
			try {
				File archivo = new File("C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\Ejercicio9\\Nombre.txt");
				Scanner sc = new Scanner(archivo);
				while(sc.hasNextLine())
				{
					
					nombres.add(sc.nextLine());
					
				}
				
				String contenido="";
				for(String nombre:nombres) {
					contenido+=nombre + "\n";
				}
				System.out.println(contenido);
				
				FileWriter fw= new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(contenido);
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		

	}

}
