package models;

public class Reptil extends Animal {

	private String especie;
	private boolean venenoso;
	public Reptil(String nombre, String FechaNacimiento, double peso, String especie, boolean venenoso) {
		super(nombre, FechaNacimiento, peso);
		
	}
	
	public String getEspecie(){
		return especie;
	}
	
	public boolean tieneVeneno(){
		return venenoso;
	}
	
	@Override
	public String toString() {
		return "Ficha de Gato / Animal [nombre :" + nombre + ",/ especie :" + especie + "/, Fecha de nacimiento :" + FechaNacimiento 
				+ "/ Peso : "+peso+" Es Venenoso ?: "+venenoso+" /n Comentarios :"+comentarios;
	}
	
	

}
