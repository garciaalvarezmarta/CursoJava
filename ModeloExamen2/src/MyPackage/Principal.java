package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection; 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner; //El scanner.
import org.json.*;


public class Principal {
	public static void main(String[] args) throws IOException {

		try {

			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&current_weather=true&forecast_days=1&start_date=2023-03-28&end_date=2023-03-28");
			URL url2 = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			HttpURLConnection con2 = (HttpURLConnection) url2.openConnection();
			con.connect();

			int tiempoDeRepuesta = con.getResponseCode();
			int tiempoDeRepuesta2 = con2.getResponseCode();

			if (tiempoDeRepuesta != 200) {
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			} else if (tiempoDeRepuesta != 200){
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta2);
				
			}else {
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				
				StringBuilder informacion2 = new StringBuilder();
				Scanner sc2 = new Scanner(url2.openStream());
				
				while (sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				
				while (sc2.hasNext()) {
					informacion2.append(sc2.nextLine());
				}

				
				sc.close();
				sc2.close();
				
				
				JSONObject jsonTiempoMad = new JSONObject(informacion.toString());
				//System.out.println(jsonTiempo);
				JSONObject currentWeatherMad = jsonTiempoMad.getJSONObject("current_weather");
				double temperatureMad = currentWeatherMad.getDouble("temperature");
				
				JSONObject jsonTiempoBer = new JSONObject(informacion2.toString());
				JSONObject currentWeatherBer = jsonTiempoBer.getJSONObject("current_weather");
				double temperatureBer = currentWeatherBer.getDouble("temperature");
				
				Madrid m= new Madrid(temperatureMad);
				Berlin b= new Berlin(temperatureBer);
				
				System.out.println("--MADRID-- \n Temperatura: "+temperatureMad+" ºC");
						
				if(m.sembrado()==true) {
					System.out.println("Se realizan tareas de sembrado y producción.");
				}else {
					System.out.println("Solo se realizan tareas de producción.");
				}
				
				System.out.println("--BERLÍN-- \n Temperatura: "+temperatureBer+" ºC");
				
				if(b.produccion()==true) {
					System.out.println("Se realizan tareas de producción.");
				}else {
					System.out.println("Se realizan tareas de mantenimiento.");
				}
				
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
