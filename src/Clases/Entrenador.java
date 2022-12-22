package Clases;

public class Entrenador extends Persona {

	private String idFederacion;
	
	public Entrenador() {
		super();
		
		System.out.println("Federación de futbol a la que pertenece");
		idFederacion = scan.nextLine();
	}
	
	public String getIdFedereacion() {
		return idFederacion;
	}

	public void setIdFedereacion(String idFedereacion) {
		this.idFederacion = idFedereacion;
	}
	
	public void dirigirPartido() {
		System.out.println("alineo al jugador mientras le masajeando los huevos");
	}
	
	public void dirigirEntrenamiento() {
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

}
