package models;

public class Perro extends Animal {

	
	protected String raza;
	
	
	public Perro (String raza, int Kg){
		super(Kg);											//Hay que llamar a Papa para que se encargue de Kg, y había que declarar una variable de Papa
		this.raza = raza;									//Super tiene que ser la primera instrucción
		
	}
	
}
