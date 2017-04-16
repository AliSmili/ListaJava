package models;

import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private ArrayList<Jugador> jugadores;
	
	// Constructor
	
	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public Equipo(String nombre){
		this.nombre=nombre;
		
	// El constructor inicializa una clase ArrayList<Jugador> vacía, para poder añadirle datos mas tarde.
		
		this.jugadores = new ArrayList<Jugador>();
	}
	
	// Comportamientos
	
	@Override
	public String toString() {
		
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	// Añadir jugador dado por el main
	
	public void fichaje(Jugador j){
		this.jugadores.add(j);
	}

}
