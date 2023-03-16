package MyPackage;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int opcion;
		int n1, n2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--CALCULADORA--");
		System.out.println("Elige una opción:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. División");
		System.out.println("4. Multiplicación");
		
		opcion=teclado.nextInt();
		
		switch(opcion) {
		case(1): {
			int suma;
			System.out.println("Escribe el primer número para sumar:");
			n1=teclado.nextInt();
			System.out.println("Escribe el segundo número para sumar:");
			n2=teclado.nextInt();
			suma=n1+n2;
			System.out.println("La suma entre "+n1+" y "+n2+" es: "+suma);
		}break;
		
		case(2): {
			int resta;
			System.out.println("Escribe el primer número para restar:");
			n1=teclado.nextInt();
			System.out.println("Escribe el segundo número para restar:");
			n2=teclado.nextInt();
			resta=n1-n2;
			System.out.println("La resta entre "+n1+" y "+n2+" es: "+resta);
		}break;
		
		case(3): {
			int division;
			do {
				System.out.println("Escribe el primer número distinto de 0 para dividir:");
				n1=teclado.nextInt();
				System.out.println("Escribe el segundo número distinto de 0 para restar:");
				n2=teclado.nextInt();
				
				if(n1==0 || n2==0) {
					System.out.println("Por favor introduzca números distintos de 0.");
				}else {
					division=n1/n2;
					System.out.println("La división entre "+n1+" y "+n2+" es: "+division);
				}
			}while(n1==0 || n2==0);
			
		}break;
		
		case(4):{
			int multiplicacion;
			System.out.println("Escribe el primer número para multiplicar:");
			n1=teclado.nextInt();
			System.out.println("Escribe el segundo número para multiplicar:");
			n2=teclado.nextInt();
			multiplicacion=n1*n2;
			System.out.println("La multiplicación entre "+n1+" y "+n2+" es: "+multiplicacion);
		}break;
		
		}
		
		teclado.close();
		
		}
	
}
