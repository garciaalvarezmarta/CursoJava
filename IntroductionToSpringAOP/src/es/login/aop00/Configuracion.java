package es.login.aop00;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration //Esto le indica a Eclipse que es la configuración
@EnableAspectJAutoProxy //Esto HABILITA la relación entre AOP y
						//el proyecto.
@ComponentScan("es.login.aop00") //Esto le indica que va a scannear este paquete buscando Aspectos.



public class Configuracion {
	
	

}
