package es.camcar.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleados empleado1 = new JefeEmpleado();
		Empleados empleado2 = new SecretarioEmpleado();
		Empleados empleado3 = new DirectorEmpleado();
		
		System.out.println(empleado1.getTareas());
		System.out.println(empleado2.getTareas());
		System.out.println(empleado3.getTareas());*/
		//Creando contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Pedir bean
		DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		//Utilizar el bean
		System.out.println(juan.getTareas());
		//Utiliza el bean con la dependencia inyectada por constructor
		System.out.println(juan.getInforme());
		//Utiliza el bean con el campo inyectado por setter
		System.out.println("Email: "+juan.getEmail());
		System.out.println(juan.getNombreEmpresa());
		/*
		//Pedir bean con inyección de dependencia por setter
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		//Utilizar el bean
		System.out.println(pedro.getTareas());
		//Utiliza el bean con la dependencia inyectada por setter
		System.out.println(pedro.getInforme());
		//Utiliza el bean con el campo inyectado por setter
		System.out.println("Email: "+pedro.getEmail());
		System.out.println(pedro.getNombreEmpresa());
		System.out.println("Email: "+pablo.getEmail());*/
		//Cerrar el XML
		contexto.close();
	}

}
