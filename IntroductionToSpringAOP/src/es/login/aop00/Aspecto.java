package es.login.aop00;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class Aspecto {
	
	@Before("execution(* es.login.aop00.DAO.saludar())")
	public void init() {
		System.out.println("Comienza el saludo");
	}
	
	@After("execution(* es.login.aop00.DAO.saludar())")
	public void end() {
		System.out.println("Terminó el saludo");
	}

}
