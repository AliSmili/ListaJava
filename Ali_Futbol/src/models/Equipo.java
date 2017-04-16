package models;
import java.util.ArrayList;
public class Equipo {
	
	
	private ArrayList<Jugador> jugadores;
	private String nombreEquipo;
	
	
	public Equipo (String nombreEquipo, ArrayList<Jugador>jugadores){
	
	this.nombreEquipo = nombreEquipo;
	this.jugadores = jugadores;
	

	}
	public Equipo (String nombreEquipo){
		
	this.nombreEquipo = nombreEquipo;
	this.jugadores = new ArrayList<Jugador>();
	
	}
	
	
	@Override
	public String toString() {
		
		return "Equipo [nombre=" + nombreEquipo + ", jugadores=" + jugadores + "]";
	}
	
	//GETTERS
	public String getNombreEquipo(){
		
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombre){
		this.nombreEquipo = nombre;
	}
	

	public ArrayList<Jugador> getJugadores(ArrayList<Jugador> jugadores){								//Me devuelve los jugadores
		return jugadores;
	}
	
	public void setJugadores (ArrayList<Jugador>jugadores){												//Me asigna los jugadores
		this.jugadores = jugadores;
		
	}
	
	public void fichaJugador(Jugador fichaje){														//Me añade un jugador en el ArrayList
		
		this.jugadores.add(fichaje);
	}
	
	public void quitaJugador(Jugador j){
		this.jugadores.remove(j);
	}
	
	
	
	
	
	
	
	
	
	
}