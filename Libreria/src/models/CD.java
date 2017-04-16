package models;

public class CD {
	private String nombre;
	private String grupo;
	private float precio;
	private int anyo;

	public CD(String nombre, String grupo, float precio, int anyo) {
		this.nombre = nombre;
		this.grupo = grupo;
		this.precio = precio;
		this.anyo = anyo;
	}
	
	public String getGrupo(){
		return this.grupo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public int getAnyo() {
		return anyo;
	}

	public int antiguedad (int anyo){
		return anyo - this.anyo;
	}
	
}



