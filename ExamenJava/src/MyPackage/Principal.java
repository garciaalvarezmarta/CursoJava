package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		try {
			File archivo = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ExamenJava\\Vuelos.txt");
			Scanner sc = new Scanner(archivo);
			List<Billete> billetes = new ArrayList<>();

			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			sc.nextLine();
			while (sc.hasNextLine()) {
				String pal = sc.nextLine();
				Scanner palsc = new Scanner(pal);
				billetes.add(new Billete(palsc.next(), Integer.parseInt(palsc.next()), palsc.next(),
						Integer.parseInt(palsc.next()), LocalDate.parse(palsc.next(), formato)));
			}

			sc.close();

			String resul = "NOMBRE_VUELO\tCANT_PASAJEROS\tTIPO_PASAJE\tVALOR_UNITARIO\tVALOR_FINAL\tFECHA_VUELO\tDIAS_DIFERENCIA\tSEGMENTACION \n";
			
			int montoTotal = 0;

			for (int i = 0; i < billetes.size(); i++) {

				resul = resul + billetes.get(i).getNombreVuelo() + "\t\t\t" + billetes.get(i).getNumPasajeros()
						+ "\t\t\t" + billetes.get(i).getTipoPasaje() + "\t\t\t" + billetes.get(i).getValorUnitario()
						+ "\t\t\t" + billetes.get(i).valorFinalVuelo() + "\t\t\t" + billetes.get(i).getFechaVuelo()
						+ "\t\t\t" + billetes.get(i).diasDiferencia() + "\t\t\t";
				if (billetes.get(i).segmentacion() == true) {
					resul = resul + "Rentable\n";
				} else {
					resul = resul + "No Rentable\n";
				}
				montoTotal = montoTotal + billetes.get(i).valorFinalVuelo();

			}

			resul = resul + "\n --MONTO FINAL TOTAL-- \n" + montoTotal;

			String ruta = "C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\ExamenJava\\Vuelos_Final_"
					+ LocalDate.now() + ".txt";

			File archivoFinal = new File(ruta);

			if (!archivoFinal.exists()) {
				archivoFinal.createNewFile();
			}

			FileWriter fw = new FileWriter(archivoFinal);
			BufferedWriter bw = new BufferedWriter(fw);

			fw = new FileWriter(archivoFinal);

			bw.write(resul);

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
