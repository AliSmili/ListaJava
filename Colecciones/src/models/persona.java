package models;

public class persona {
	
	private String nombre ;
	private int edad ;
	
	
	public persona ( String nombre,int edad ){
		this.nombre = nombre;
		this.edad = edad;
	}
	

	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Edad=" + edad + "]"; 
				
	}

}
