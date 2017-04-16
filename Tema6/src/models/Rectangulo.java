package models;

public class Rectangulo {

	//Atributos
	private float l1;
	private float l2;
	
	public Rectangulo(float l1, float l2) {
		this.l1 = Math.abs(l1);
		this.l2 = Math.abs(l2);
	}
	
	public Rectangulo(float l1) {
		this(l1, l1);
	}
	
	//Métodos
	public float area(){
		return l1*l2;
	}
	
	public float perimetro(){
		return l1+l1+l2+l2;
	}
}
