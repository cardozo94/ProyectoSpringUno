package es.camcar.ioc;

public class DirectorEmpleado implements Empleados {
	
	//Define dependencia
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	//Constructor con inyeccción de dependencias
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo =  informeNuevo;
	}
	
	//Método init. Ejecutar tareas antes de que el bean esté disponible
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irían las tareas ejecutar antes de que el bean esté listo");
	}
	//Método destroy. ejecutar tareas después de qeu el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irían las tareas ejecutar despues de utilizar el bean");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa.";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}

}
