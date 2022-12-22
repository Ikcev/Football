package Clases;

import java.util.Scanner;

public abstract class Persona {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
	Scanner scan = new Scanner(System.in);
	
	public Persona() {
		System.out.println("Introduce el id de la persona a registrar");
		id = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce el nombre de la persona a registrar");
		nombre = scan.nextLine();
		
		System.out.println("Introduce apellidos de la persona a registrar");
		apellidos = scan.nextLine();
		
		System.out.println("Introduce edad del registrado");
		edad = Integer.parseInt(scan.nextLine());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public abstract void concentrarse();
	
	public abstract void viajar();

	@Override
	public String toString() {
		return "Persona " + id + ", nombre " + nombre + ", apellidos " + apellidos + ", edad " + edad;
	}
	
	
}
