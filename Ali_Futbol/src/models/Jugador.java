package models;

public class Jugador {
	
	private String nombreJugador;
	private int dorsal;
	
	
	public Jugador (String nombreJugador , int dorsal){
		 
		this.nombreJugador = nombreJugador;
		this.dorsal = dorsal;
		
		
	}
	
	public String getNombreJugador(){
		return nombreJugador;
	}
	
	public int getDorsal(){
		return dorsal;
	}
	
	public void setNombreJugador(String nombre){
		
		this.nombreJugador = nombre;
	}
	
	public void setDorsal(int num){
	
	this.dorsal = num;
	
	}

}
