package es.login.aop00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public void saludar() {
		System.out.println("Te estoy saludando, hola!");
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

		DAO saludo1 = contexto.getBean(DAO.class);
		
		
		saludo1.saludar();
		contexto.close();
		

	}

}
