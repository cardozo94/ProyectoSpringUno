package es.camcar.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		Empleados camilo = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(camilo.getInforme());
		
		contexto.close();
		//System.out.println(camilo.getInforme());
	}

}
