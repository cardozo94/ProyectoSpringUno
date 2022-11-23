package es.camcar.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//singleton
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(pedro);	
		System.out.println(pablo);	
		
		if(pedro==pablo) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
		//proptotype
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleadoPrototype", SecretarioEmpleado.class);
		SecretarioEmpleado ana = contexto.getBean("miSecretarioEmpleadoPrototype", SecretarioEmpleado.class);
		
		System.out.println(maria);	
		System.out.println(ana);	
		
		if(maria==ana) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
		contexto.close();

	}

}
