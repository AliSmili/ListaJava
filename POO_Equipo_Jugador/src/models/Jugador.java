package models;

public class Jugador {
	
	
	private int dorsal;
	private String nombre;
	private String posicion;
	
	// Constructor
	public Jugador(int dorsal, String nombre) {
		this.dorsal = dorsal;
		this.nombre = nombre;
	}

	// Comportamientos
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public String toString(){
		String s = "Nombre: "+this.nombre+"\nDorsal: "+this.dorsal;
		return s;
	}

}
