package models;

public abstract class Instrumento implements Playable {

	private String marca;
	private String modelo;
	private String color;
	private float precio;
	protected boolean isAfinado ;
	
	public Instrumento (String marca, String modelo, String color, float precio){
		this.marca= marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.isAfinado = false;
	}
	
	public Instrumento(boolean isAfinado){
		this.isAfinado = isAfinado;
	}
	
	
	
	@Override
	public void TocarInstrumento(){
		System.out.println("Tocando el instrumento");
	}
	
	@Override
	public void AfinarInstrumento(){
		this.isAfinado = true;
		System.out.println("Instrumento afinado");
	}
	//Getters
	
	public String getMarca(){
		return this.marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public float getPrecio(){
		return this.precio;
	}
	
	public boolean estaAfinado(){
		return this.isAfinado;
	}
	
	
	//Setters
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setPrecio(float precio){
		this.precio = precio;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setAfinado(boolean isAfinado){
		this.isAfinado = isAfinado;
	}
	
	@Override
	public String toString() {
		return "Instrumento [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio="+precio
				+ "]";
	}
	
	
	
}
