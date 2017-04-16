package models;

public class Gato extends Animal {

	private String raza;
	private String microchip;
	public Gato(String nombre,String raza, String FechaNacimiento, double peso, String microchip) {
		super(nombre, FechaNacimiento, peso);
			
	}
	
	public String getRaza(){
		return raza;
	}
	
	public String getMicrochip(){
		return microchip;
	}
	
	@Override
	public String toString() {
		return "Ficha de Gato / Animal [nombre :" + nombre + ",/ Raza :" + raza + "/, Fecha de nacimiento :" + FechaNacimiento 
				+ "/ Peso : "+peso+" Microship : "+microchip+" / Comentarios :"+comentarios;
	}

}
