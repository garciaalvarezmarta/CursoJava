package Package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) throws IOException {

		try {
			URL url1 = new URL("https://rickandmortyapi.com/api/character");
			URL url2 = new URL("https://rickandmortyapi.com/api/location");
			URL url3 = new URL("https://rickandmortyapi.com/api/episode");
			HttpURLConnection con1 = (HttpURLConnection) url1.openConnection();
			con1.connect();
			HttpURLConnection con2 = (HttpURLConnection) url1.openConnection();
			con2.connect();
			HttpURLConnection con3 = (HttpURLConnection) url1.openConnection();
			con3.connect();

			String ruta = "C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\Ejercicio12\\API.txt";
			String contenido = "s";
			File archivo = new File(ruta);

			int tiempoRespuesta1 = con1.getResponseCode();
			int tiempoRespuesta2 = con1.getResponseCode();
			int tiempoRespuesta3 = con1.getResponseCode();

			if (tiempoRespuesta1 != 200) {
				throw new RuntimeException("HttpResponseCode" + tiempoRespuesta1);
			} else if (tiempoRespuesta2 != 200) {
				throw new RuntimeException("HttpResponseCode" + tiempoRespuesta2);

			} else if (tiempoRespuesta3 != 200) {
				throw new RuntimeException("HttpResponseCode" + tiempoRespuesta3);

			} else {

				//StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url1.openStream());
				Scanner sc2 = new Scanner(url2.openStream());
				Scanner sc3 = new Scanner(url3.openStream());

				if (!archivo.exists()) {
					archivo.createNewFile();
				}
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				

				while (sc.hasNext()) {
					contenido+=sc.nextLine();
				}
				while (sc2.hasNext()) {
					contenido+=sc2.nextLine();
				}
				while (sc3.hasNext()) {
					contenido+=sc3.nextLine();
				}
				
				bw.write(contenido);

				sc.close();
				//System.out.println(informacion);

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
