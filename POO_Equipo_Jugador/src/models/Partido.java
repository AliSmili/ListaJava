package models;

public class Partido {
	
	/*
	 * - Equipo local
	 * - Equipo visitante
	 * - int marcador L
	 * - int marcador V
	 * 
	 * ---------------
	 * 
	 * + golLocal()
	 * + golVisitante()
	 * + AnunciarAlineacion(Equipo e)
	 */
	
	private Equipo local;
	private Equipo visitante;
	private int marcadorL;
	private int marcadorV;
	
	// Constructor
	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		this.marcadorL=0;
		this.marcadorV=0;
	}

	// Comportamientos
	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public int getMarcadorL() {
		return marcadorL;
	}

	public void setMarcadorL(int marcadorL) {
		this.marcadorL += marcadorL;
	}

	public int getMarcadorV() {
		return marcadorV;
	}

	public void setMarcadorV(int marcadorV) {
		this.marcadorV += marcadorV;
	}

}
