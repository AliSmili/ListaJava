package models;

public class Motocicleta {

	//Atributos
	
	public float velocidad;
	public int pulgadas;
	public float de0aCien;
	public String color; 	
	public String marca;
	
	//Constructor
	
	public Motocicleta(String color,String marca, float velocidad ,float de0aCien){
		
		this.color=color;
		this.marca=marca;
		this.velocidad=velocidad;
		this.de0aCien=de0aCien;
	}
	
	//Metodos
	
	public void Acelerar(){
		
		/*marc=marca;
		acc =de0aCien;*/
		System.out.println("La moto cuya marca es "+marca+" accelera de 0 a 100 en "+de0aCien+" segundos");
		
		
	}
	
	public void Frenar(){
		
		
		velocidad= (velocidad *0.5f);
			System.out.println("La moto cuya ruedas son de "+pulgadas+" y de marca "+marca);
			System.out.println("Desacelera a un ritmo de "+velocidad+" metros por segundo");
	
	}

}
