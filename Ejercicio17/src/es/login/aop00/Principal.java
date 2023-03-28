package es.login.aop00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.login.aop.Configuracion;
import es.login.aop.DAOEmpleado;


public class Principal {
	


	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		AnnotationConfigApplicationContext contexto2 = new AnnotationConfigApplicationContext(Configuracion.class);

		DAOEmpleado e1 = contexto.getBean("DAOEmpleado", DAOEmpleado.class);
		DAOEmpleado e2 = contexto2.getBean("DAOEmpleado", DAOEmpleado.class);
		
		e1.setNombre("Marta");
		e1.setApellido("García");
		e1.setEdad(23);
		
		e2.setNombre("Pepe");
		e2.setApellido("Pérez");
		e2.setEdad(32);
	
		e1.generarTxt(e2);
		e1.cierrePrograma(contexto);
		e2.cierrePrograma(contexto2);
		
	}

}
