package models;

public class Guitarra extends Instrumento{

	private int numCuerdas;
	private String tipo;
	public Guitarra(String marca, String modelo, String color, float precio) {
		super(marca, modelo, color, precio);
	}
	public Guitarra(int numCuerda, String tipo, String marca, String modelo, String color, float precio) {
			super(marca, modelo, color, precio);
			this.numCuerdas = numCuerdas;
			this.tipo = tipo;
			
	/* public Guitarra (int numCuerdas , String tipo){
			//super(marca, modelo, color, precio);
			this.numCuerdas = numCuerdas;
			this.tipo = tipo;*/
	}
		
	
	
	//GETTERS
	
	public int getNumCuerdas(){
		return numCuerdas;
	}
	
	public String getTipoGuitarra(){
		return tipo;
	}
	
	
	public String toString() {
		return super.toString()+" Instrumento guitarra [tipo=" + tipo + ", numero de cuerdas=" + numCuerdas + "]";
				
	}
	
	
	public static void TocarInstrumento(boolean isAfinado){
		//this.isAfinado = isAfinado;
		if(isAfinado){
		System.out.println("tiritiritiritiri");
		}else{
			System.out.println("[Maullidos Indescriptíbles]");
		}
		
	}
	
	

}
