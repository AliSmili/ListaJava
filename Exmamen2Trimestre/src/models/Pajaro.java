package models;

public class Pajaro extends Animal {

	
	private String especie;
	private boolean cantor;
	
	public Pajaro(String nombre, String FechaNacimiento, double peso, String especie, boolean cantor, String comentarios) {
		super(nombre, FechaNacimiento, peso, comentarios);
		
	}
	
	public String getEspecie(){
		return especie;
	}
	
	public boolean cantaPajaro(){
		return cantor;
	}
	
	@Override
	public String toString() {
		return "Ficha de Gato / Animal [nombre :" + nombre + ",/ especie :" + especie + "/, Fecha de nacimiento :" + FechaNacimiento 
				+ "/ Peso : "+peso+" es Cantor ?: "+cantor+" / Comentarios :"+comentarios;
	}

}
