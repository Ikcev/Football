package Clases;

public class Masajista extends Persona {
	
	private String titulacion;
	private Integer aniosExperiencia;
	
	public Masajista() {
		super();
		
		System.out.println("¿Qué título posee el masajista?");
		titulacion = scan.nextLine();
		
		System.out.println("Años trabajados hasta el momento");
		aniosExperiencia = Integer.parseInt(scan.nextLine());
		
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(Integer aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void darMasaje() {
		System.out.println("Masajea huevos");
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Masajista registrado con el id " + getId() + ", nombre " + getNombre() + ", apellidos " + getApellidos() + ", su edad es " + getEdad() + ". Ha sido titulado con " + titulacion + " tiene " + aniosExperiencia + " años de experiencia.";
	}
	
	
	
}
