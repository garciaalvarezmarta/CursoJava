package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Principal {

	public static void main(String[] args) {
		try {
			
			File archivo = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ModeloExamen3\\Peliculas.txt");
			Scanner sc = new Scanner(archivo);
			List <Pelicula> peliculas= new ArrayList<>();
			
			sc.nextLine();
			while(sc.hasNextLine()) {
				String pal = sc.nextLine();
				Scanner palsc = new Scanner(pal);
				peliculas.add(new Pelicula(palsc.next(),Long.parseLong(palsc.next()),Integer.parseInt(palsc.next())));
			}
			
			//GUARDAMOS LAS RECAUDACIONES POR AÑO
			
			List<Recaudacion> recaudaciones = new ArrayList<>();
			List<Integer> years = new ArrayList<>();
			int pos=0;
			
			for(int i=0;i<peliculas.size();i++) {
				recaudaciones.add(new Recaudacion(peliculas.get(i).getGanancia(),peliculas.get(i).getYear()));
				
				if(years.contains(peliculas.get(i).getYear())) {
					for(int j=0; j<recaudaciones.size();j++) {
						if(recaudaciones.get(j).getYear()==peliculas.get(i).getYear()) {
							recaudaciones.get(j).setGanancia(recaudaciones.get(j).getGanancia()+peliculas.get(i).getGanancia());
							pos=j;
						}
					}
					
				}else {
					years.add(peliculas.get(i).getYear());
	
				}
				
			}
			String rec="--RECAUDACION AGRUPADA POR AÑO-- \n";
			for(int i=0; i<recaudaciones.size();i++) {
				rec=rec+recaudaciones.get(i).getYear() + " " + recaudaciones.get(i).getGanancia()+"\n";
			}
			
			//GUARDAMOS EL TOP 3	
			List <Pelicula> pelisTop = new ArrayList<>();
			pelisTop.add(peliculas.get(0));
			pelisTop.add(peliculas.get(1));
			pelisTop.add(peliculas.get(2));
			
			for(int i=3; i<peliculas.size();i++) {
				if(peliculas.get(i).getGanancia()>pelisTop.get(0).getGanancia()) {
					pelisTop.set(0,peliculas.get(i));
				}else if(peliculas.get(i).getGanancia()>pelisTop.get(1).getGanancia()) {
					pelisTop.set(1,peliculas.get(i));
				}else if(peliculas.get(i).getGanancia()>pelisTop.get(2).getGanancia()) {
					pelisTop.set(2,peliculas.get(i));
				}
			}
			
			String top="\n --TOP 3 PELÍCULAS CON MAYOR RECAUDACIÓN -- \n";
			
			for(int i=0; i<pelisTop.size();i++) {
				top=top+pelisTop.get(i).getTitulo()+ "\t" +pelisTop.get(i).getGanancia()+"\n";
			}
			
			//IDENTIFICAR AÑO QUE MAS DINERO SE RECAUDÓ
			
			Recaudacion mayor= new Recaudacion(recaudaciones.get(0).getGanancia(),recaudaciones.get(0).getYear());
			
			for(int i=1; i<recaudaciones.size();i++) {
				if(recaudaciones.get(i).getGanancia()>mayor.getGanancia()) {
					mayor=recaudaciones.get(i);
				}
			}
			
			String recMay="\n --AÑO QUE MÁS DINERO SE RECAUDÓ-- \n" + mayor.getYear()+" \t" + mayor.getGanancia();
			
			//LISTA DE PELICULAS ORDENADAS
			
			String lista= "\n --LISTA DE PELÍCULAS POR ORDEN ALFABÉTICO-- \n";
			
			PeliculaComparator comparadorPorTitulo = new PeliculaComparator();
			Collections.sort(peliculas, comparadorPorTitulo);
			
			for(int i=0;i<peliculas.size();i++) {
				lista=lista+(peliculas.get(i).getTitulo())+"\n";
			}
			
			//ESCRIBO TODO EN UN FICHERO
			String contenido = rec + top + recMay + lista;
			
			File archivoFinal = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ModeloExamen3\\Info_peliculas_"+LocalDate.now()+".txt");
			
			FileWriter fw = new FileWriter(archivoFinal);
			BufferedWriter bw = new BufferedWriter(fw);
			
			fw = new FileWriter(archivoFinal);
			
			bw.write(contenido);
			bw.close();
			
		
		}catch (IOException e) {
			e.printStackTrace();

		}
		
	}
	
	
	
}
