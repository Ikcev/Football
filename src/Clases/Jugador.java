package Clases;

public class Jugador extends Persona {
	
	private Integer dorsal;
	private String demarcacion;
	
	public Jugador() {
		super();
		
		System.out.println("Dorsal que lucirá el jugador");
		dorsal = Integer.parseInt(scan.nextLine());
		
		System.out.println("Posicion de campo en la que juega");
		demarcacion = scan.nextLine();
	}

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Se encuentra jugando furbol");
	}
	
	public void entrenar() {
		
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
