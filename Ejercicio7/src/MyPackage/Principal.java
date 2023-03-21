package MyPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {

		
		List<String> supermercado = new ArrayList<>();
		Set<String> dni = new HashSet<>();
		Map<String,String> usuario = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String id;
		
		
		System.out.println("--SUPERMERCADO-- \n Añade tres elementos a la lista de la compra.");
		supermercado.add(sc.next());
		supermercado.add(sc.next());
		supermercado.add(sc.next());
		
		System.out.println(supermercado);
		
		System.out.println("--DOCUMENTOS DE IDENTIDAD -- \n Añade tres dni.");
		dni.add(sc.next());
		dni.add(sc.next());
		dni.add(sc.next());
		System.out.println(dni);
		
		System.out.println("--USUARIOS-- \n Añade el nombre e id de tres usuarios.");
		for(int i=0; i<3; i++) {
			int num=i+1;
			System.out.println("Nombre "+ num + ":");
			nombre=sc.next();
			System.out.println("ID "+ num + ":");
			id=sc.next();
			usuario.put(nombre, id);
		}
		
		System.out.println(usuario);
	}
}
