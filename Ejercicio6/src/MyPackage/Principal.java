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
		
		frutas.add("plátano");
		frutas.add("fresa");
		frutas.add("melocotón");
		frutas.add("uva");
		frutas.add("manzana");
		frutas.add("pera");
		frutas.add("maracuyá");
		frutas.add("granada");
		frutas.add("pomelo");
		frutas.add("naranja");
		
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
