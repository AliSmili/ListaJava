package models;

public class Piano extends Instrumento{

	private int numTeclas;
	public Piano(String marca, String modelo, String color, float precio) {
		super(marca, modelo, color, precio);
	}
	public Piano(int numTeclas, String marca, String modelo, String color, float precio) {
			super(marca, modelo, color, precio);
			this.numTeclas = numTeclas;
	}
	
	public int getNumTeclas(){
		return this.numTeclas;
	}
	
	public void setNumTeclas(int numPlatos){
		this.numTeclas = numTeclas;
	}
	
	
	public String toString() {
		return super.toString()+"Instrumento piano [número de teclas=" + numTeclas +  "]";
				
	}

}
