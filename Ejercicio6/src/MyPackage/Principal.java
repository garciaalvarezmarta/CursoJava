package MyPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class Principal {
	public static void main(String[] args) {
		
		List<String> frutas = new ArrayList<>();
		Set<String> verduras = new HashSet<>();
		Map<String,Integer> meses = new HashMap<>();
		
		frutas.set(0, "plátano");
		frutas.set(1, "fresa");
		frutas.set(2, "melocotón");
		frutas.set(3, "uva");
		frutas.set(4, "manzana");
		frutas.set(5, "pera");
		frutas.set(6, "maracuyá");
		frutas.set(7, "granada");
		frutas.set(8, "pomelo");
		frutas.set(9, "naranja");
		
		verduras.add("Lechuga");
		verduras.add("Tomate");
		verduras.add("Coliflor");
		verduras.add("Brócoli");
		verduras.add("Col");
		verduras.add("Judías");
		verduras.add("Remolacha");
		verduras.add("Alcachofa");
		verduras.add("Acelga");
		verduras.add("Espinaca");
		
		meses.put("Enero", 31);
		meses.put("Febrero", 28);
		meses.put("Marzo", 31);
		meses.put("Abril", 30);
		meses.put("Mayo", 31);
		meses.put("Junio", 30);
		meses.put("Julio", 31);
		meses.put("Agosto", 31);
		meses.put("Septiembre", 30);
		meses.put("Octubre", 31);
		meses.put("Noviembre", 30);
		meses.put("Diciembre", 31);
	}
}
