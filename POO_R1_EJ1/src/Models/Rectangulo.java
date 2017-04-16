package Models;

public class Rectangulo {

	
	//Atributos
	
	private float base;
	private float altura;
	private float Perimetro;
	private float Area;
	
	
	//Constructor
	
	public  Rectangulo (float base , float altura){
		
		this.base =Math.abs(base);
		this.altura=Math.abs(altura);
		
		
	}
	
	//getters and setters
	
	public float getPerimetro(){
		
		this.Perimetro = 2*(base + altura);
		
		
		return Perimetro;
	}
	
	public float getArea(){
		
		this.Area = base * altura;
		
		return Area;
		
	}
	
	
	
	
	
	
	
}
