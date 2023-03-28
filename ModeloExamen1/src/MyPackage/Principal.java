package MyPackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Principal {

	public static void main(String[] args) {
		try {
			
			File archivo = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ModeloExamen1\\ventas_28032023.txt");
			Scanner sc = new Scanner(archivo);
			Tienda t = new Tienda(185);
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("[d/M/yyyy][dd/MM/yyyy]");
			
			sc.nextLine();
			while(sc.hasNextLine()) {
				String pal = sc.nextLine();
				Scanner palsc = new Scanner(pal);
				t.addProducto(new Producto(palsc.next(),Integer.parseInt(palsc.next()),Integer.parseInt(palsc.next()),LocalDate.parse(palsc.next(), formato)));
			}
			
			//Añadimos al fichero con los nuevos campos 
			File archivoFinal = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ModeloExamen1\\ventas_FINAL_"+LocalDate.now()+".txt");
			String primera= "DESCRIPCION \t PRECIO_UNITARIO \t PRECIO+IVA \t CANTIDAD_VENDIDA_TOTAL \t PROMEDIO \n";
			String contenido=primera;
			
			for(int i=0;i<t.getSize();i++) {
				Producto prod = t.getPos(i);
				contenido=contenido+prod.getTipo()+" \t"+prod.getPrecioUnitario()*prod.getNumVentas()+" \t"+prod.getPrecioFinal()*prod.getNumVentas()+" \t"+prod.getNumVentas()+" \t"+prod.promedioVentas()+"\n";
			}
			
			FileWriter fw = new FileWriter(archivoFinal);
			BufferedWriter bw = new BufferedWriter(fw);
			
			fw = new FileWriter(archivoFinal);
			
			bw.write(contenido);
			bw.close();
			
			
			sc.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		
		

	}

}
