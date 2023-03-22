package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException{

		try {
			URL url = new URL("https://sv443.net/jokeapi/v2/?ref=apilist.fun");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int tiempoRespuesta = con.getResponseCode();
			if(tiempoRespuesta!=200) {
				throw new RuntimeException("HttpResponseCode" + tiempoRespuesta);
			}
			else {
				StringBuilder informacion= new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				
				while(sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				sc.close();
				System.out.println(informacion);
				
			}
			
		}catch(MalformedURLException e){
			e.printStackTrace();
		}

	}

}
