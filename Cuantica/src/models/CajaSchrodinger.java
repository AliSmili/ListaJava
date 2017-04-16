package models;

import java.util.Random;

public class CajaSchrodinger<T extends Animal> {
	private T animalito;

	public CajaSchrodinger(){}
	
	public void add(T animalito) {
		this.animalito = animalito;
	}
	
	public T get() {
		return this.animalito;
	}
	
	public T observar(){
		double prob = Math.random();
		
		// Muere
		if(prob <= 0.5){
			return null;
		} // Sobrevive
		else {
			return animalito;
		}
	}

}
