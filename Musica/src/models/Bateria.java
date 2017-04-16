package models;

public class Bateria extends Instrumento {

	private int numTimbales;
	private int numPlatos;
	public Bateria(String marca, String modelo, String color, float precio) {
		super(marca, modelo, color, precio);	
	}
	public Bateria(int numTimbales, int numPlatos, String marca, String modelo, String color, float precio) {
		super(marca, modelo, color, precio);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}
	
	public int getNumTimbales(){
		return this.numTimbales;
	}
	
	public int getNumPlatos(){
		return this.numPlatos;
	}
	
	public void setNumlatos(int numPlatos){
		this.numPlatos = numPlatos;
	}
	
	public void setNumTimbales(){
		this.numTimbales= numTimbales;
	}
	
	
	public String toString() {
		return super.toString()+"Instrumento bateria [número de platos=" + numPlatos + ", numero de timbales=" + numTimbales + "]";
				
	}
	
	public static void TocarInstrumento(boolean isAfinado){
		
		if(isAfinado){
		System.out.println("TÚM PAM PÚUM PAAM PÚUM");
		}else{
			System.out.println("[Mamporreos Indescriptíbles]");
		}
		
	}
	
	
	
	
		
	
}
