package models;

public class Bicicleta {

	//atributos
	
	private int velocidad;
	//private String color;
	public int pulgadas;
	protected String marca;
	int platos;
	public String color;
	
	//Constructor
	public Bicicleta(String marca, int pulgadas){
		this.velocidad =0;
		this.color= color;
		this.pulgadas = pulgadas;
		this.marca=marca;  
	}
	
	//getters and setterds
	
	private int getVelocidad(){
		return velocidad;
	}
	
	protected String getMarca(){
		return marca;
	}
	
	public int getPulgadas(){
		return pulgadas;
	}
	
	int getPlatos(){
		return platos;
	}
	
	
	
	
	
	
	
	
	
	
	/*Metodos
	
	public void Acelerar(int Kmh){
		velocidad+=Kmh;
		System.out.println("la Bici"+ marca+ " tiene "+velocidad+ " Km/h");
	}
	public void Frenar(int Kmh){
		if(Kmh>velocidad){
			velocidad=0;
		}else{
			velocidad-=Kmh;
		}
		
		System.out.println(velocidad);
	}*/
		
	}

