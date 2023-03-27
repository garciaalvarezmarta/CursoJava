package es.login.aop00;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import es.login.aop.DAOEmpleado;

@Aspect
@Component

public class Aspecto {
	
	
	
	@Before("execution(public void generarTxt(DAOEmpleado e2))")
	public void init() {
		System.out.println("Se está generando un fichero");
	}
	
	@After("execution(public void cierrePrograma(AnnotationConfigApplicationContext contexto))")
	public void end() {
		System.out.println("Se está cerrando el programa");
	}

}
