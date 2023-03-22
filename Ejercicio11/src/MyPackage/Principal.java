package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Principal {


		public static void main(String[] args) throws IOException{

			try {
				URL url1 = new URL("https://rickandmortyapi.com/api/character");
				URL url2= new URL("https://rickandmortyapi.com/api/location");
				URL url3= new URL("https://rickandmortyapi.com/api/episode");
				HttpURLConnection con1 = (HttpURLConnection) url1.openConnection();
				con1.connect();
				HttpURLConnection con2 = (HttpURLConnection) url1.openConnection();
				con2.connect();
				HttpURLConnection con3 = (HttpURLConnection) url1.openConnection();
				con3.connect();
				
				int tiempoRespuesta1 = con1.getResponseCode();
				int tiempoRespuesta2 = con1.getResponseCode();
				int tiempoRespuesta3 = con1.getResponseCode();
				
				if(tiempoRespuesta1!=200) {
					throw new RuntimeException("HttpResponseCode" + tiempoRespuesta1);
				}
				else if(tiempoRespuesta2!=200){
					throw new RuntimeException("HttpResponseCode" + tiempoRespuesta2);
					
				}else if(tiempoRespuesta3!=200) {
					throw new RuntimeException("HttpResponseCode" + tiempoRespuesta3);
					
				}else {
				
					StringBuilder informacion= new StringBuilder();
					Scanner sc = new Scanner(url1.openStream());
					Scanner sc2 = new Scanner(url2.openStream());
					Scanner sc3 = new Scanner(url3.openStream());
					
					while(sc.hasNext()) {
						informacion.append(sc.nextLine());
					}
					while(sc2.hasNext()) {
						informacion.append(sc2.nextLine());
					}
					while(sc3.hasNext()) {
						informacion.append(sc3.nextLine());
					}
					sc.close();
					System.out.println(informacion);
					
				}
				
			}catch(MalformedURLException e){
				e.printStackTrace();
			}

		}

	}
