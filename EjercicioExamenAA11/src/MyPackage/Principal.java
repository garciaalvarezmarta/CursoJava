package MyPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		try {
			File archivo1 = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\EjercicioExamenAA11\\USUARIOS_1.txt");
			File archivo2 = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\EjercicioExamenAA11\\USUARIOS_2.txt");
			File archivo3 = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\EjercicioExamenAA11\\Usuarios_3.txt");
			File archivoFinal = new File(
					"C:\\Users\\mgarciaalv\\eclipse-workspace\\EjerciciosCursoJava\\EjercicioExamenAA11\\Usuarios_Final.txt");

			Scanner sc1 = new Scanner(archivo1);
			Scanner sc2 = new Scanner(archivo2);
			Scanner sc3 = new Scanner(archivo3);

			FileWriter fw = new FileWriter(archivoFinal);
			BufferedWriter bw = new BufferedWriter(fw);

			// JUNTO LOS 3 ARCHIVOS EN EL ARCHIVO FINAL
			for (int i = 0; (sc1.hasNextLine()); i++) {
				bw.write(sc1.nextLine() + "\n");
			}

			sc2.nextLine();
			for (int i = 0; (sc2.hasNextLine()); i++) {
				bw.write(sc2.nextLine() + "\n");
			}

			sc3.nextLine();
			for (int i = 0; (sc3.hasNextLine()); i++) {
				bw.write(sc3.nextLine() + "\n");
			}

			bw.close();
			sc1.close();
			sc2.close();
			sc3.close();

			// AÑADO LOS CAMPOS DEL TXT A INSTANCIAS DE USUARIOS
			Scanner scFinal = new Scanner(archivoFinal);
			String linea;
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("[d/M/yyyy][dd/MM/yyyy]");
			Set<Usuario> usuarios = new HashSet<>();

			String primera = scFinal.nextLine();

			for (; scFinal.hasNextLine();) {
				String lin = scFinal.nextLine();
				Scanner lineaScanner = new Scanner(lin);
				usuarios.add(new Usuario(lineaScanner.next(), LocalDate.parse(lineaScanner.next(), formato),
						LocalDate.parse(lineaScanner.next(), formato), LocalDate.parse(lineaScanner.next(), formato),
						Integer.parseInt(lineaScanner.next()), lineaScanner.next()));
			}

			String contenido = primera + "\t Antiguedad \n Segmento \t Status \t Edad \n";

			for (Usuario usuario : usuarios) {
				contenido = contenido + usuario.getNombre() + "\t" + usuario.getFechaNac() + "\t"
						+ usuario.fechaRegistro() + "\t" + usuario.ultimoLogin() + "\t" + usuario.numCompras() + "\t"
						+ usuario.getPais() + "\t" + usuario.antiguedad() + "\t" + usuario.segmento() + "\t"
						+ usuario.status() + "\t" + usuario.edad() + "\n";

			}

			fw = new FileWriter(archivoFinal);
			BufferedWriter bw2 = new BufferedWriter(fw);
			bw2.write(contenido);
			bw2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
