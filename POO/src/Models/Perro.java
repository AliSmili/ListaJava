package Models;

public class Perro {

	String color;
	String raza;
	String colorOjos;
	
	
	public Perro(){
		
		this.color = "marr�n";
		
		this.raza ="Pitbull";
		this.colorOjos="azul";
		
	}
	
	
	public void RazaPerro(){
		System.out.println("La raza del perro es "+raza);
	}
	public void Muerde(){
		
	}
	public void Corre(){
		
	}
}
