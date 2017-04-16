package Models;

public class Coche {
	//Atributos
	String Color;
	int numRuedas;
	int Potencia;
	String Marca;
	int numVentanillas;
	int velocidadMax;
	int tpo0aCien;
	int cilindrada;
	int capacidaddeCarga;
		

	
	public Coche(String Color, int numRuedas, int tpo0aCien, int Potencia, int velocidadMax) {
		
		
		this.Color=Color;
		this.numRuedas=numRuedas;
		this.tpo0aCien= tpo0aCien;
		this.Potencia=Potencia;
		this.velocidadMax=velocidadMax;
		
		this.Potencia = (float)(capacidaddeCarga * cilindrada +0.98);
	}
	
	public void  Arranca(){
		System.out.println("He arrancado");;
	}
	
	public void Accelera(){
		System.out.println("He accelerado !!");
	}
	public int Corre( int velMax){
		System.out.println("He alcanzado la velocidad máxima de ");
		return velocidadMax;
	}
	

 
 
 

}
 