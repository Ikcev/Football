package Main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Clases.Entrenador;
import Clases.Jugador;
import Clases.Masajista;
import Clases.Persona;

public class Run {
	public void run() {
		ArrayList <Persona> personas = new ArrayList<Persona>();
		
		int select;
		System.out.println("Menú:");
		System.out.println("1.	Crear Futbolista");
		System.out.println("2.	Crear Entrenador");
		System.out.println("3.	Crear Masajista");
		System.out.println("4.	Mostrar Personas registradas");
		System.out.println("5.	Elegir entre Futbolista, Entrenador o Masajista");
		System.out.println("6.	Finalizar programa");
		
		do {
		select=Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opción"));
			if (select==1) {
				Jugador jugador = new Jugador();
				personas.add(jugador);
				
			} else if (select==2) {
				Entrenador entrenador = new Entrenador();
				personas.add(entrenador);
				
			}else if (select==3) {
				Masajista masajista = new Masajista();
				personas.add(masajista);
				
			}else if (select==4){
				for (Persona persona : personas) {
					System.out.println(persona);
				}
				
			}else if (select==5) {
				
				
			}else if (select==6) {
				JOptionPane.showMessageDialog(null,  "ADIÓS");
				
			}
		}while(select!=6);
	}
}
