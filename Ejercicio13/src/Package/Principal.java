package Package;

import org.json.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Principal {

	public static void main(String[] args) throws IOException {

			
			try {
			URL url = new URL ("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRepuesta = con.getResponseCode();
			if (tiempoDeRepuesta != 200) 
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			}
			else
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				sc.close();	
				System.out.println(informacion);
				JSONArray objeto = new JSONArray(informacion.toString());
				JSONObject jsonGato = objeto.getJSONObject(0);
				
				URL urlImagen = new URL(jsonGato.getString("url"));
				
				Image imagenGato = ImageIO.read(urlImagen);
				ImageIcon imageIcon = new ImageIcon(imagenGato);
				
				int width = (int)(jsonGato.get("width"))+50;
				int height = (int)(jsonGato.get("height"))+50;
				
				JFrame jFrame = new JFrame();
				jFrame.setBackground(Color.blue);
				
				JLabel jLabel = new JLabel();
				jLabel.setIcon(imageIcon);
				
				jFrame.add(jLabel);
				
				jFrame.setSize(width, height);
				
				jFrame.setIconImage(imagenGato);
				
				
				
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
				
				
				
				//Declaracion de la estructura y normalización.
				
		}
	} catch (MalformedURLException e)
			{
				e.printStackTrace();
			}
	
	}
}
