package models;

public class Coche {
	
	/*Crear	 una	 clase	 Coche,	 a	 traves	 de	 la	 cual	 se	 pueda	 conocer	 el	
	color	 del	 coche,	 la	 marca,	 el	 modelo,	 el	 numero	 de	 caballos,	 el	
	numero	de	puertas	y	la	matricula.	Crear	el	constructor	del	String modelo;coche,	
	as		como	los	metodos	que	considere	necesarios.	Crear	una	clase	
	PruebaCoche	que	instancie	varios	coches,	cambiandole	el	color	a	
	lo	largo	de	la	vida	a	algunos	de	ellos	y	mostrandolo	por	pantalla.	*/
	
	
	private String color;
	private String marca;
	private int modelo;
	private int numCaballos;
	private int numPuertas;
	private String matricula;
	private boolean deportivo;
	private int velocidad;
	
	
	public Coche(String marca, String color, int modelo, int numCaballos, int numPuertas, String matricula, boolean deportivo){
		
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.matricula = matricula;
		this.numPuertas = numPuertas;
		this.numCaballos = numCaballos;
		this.deportivo = deportivo ;
		

		
	}
	
	public int dimeVelocidad(){			//GETTER
		if(numCaballos >=130){
			this.velocidad=200;
			return velocidad;
		}else{
			this.velocidad=150;
			return velocidad;
		}
	}
	
	
	public void esDeportivo(){				//SETTER
		if(deportivo){
			
			
			this.numPuertas=2;
			
			
		}else{
			
			this.numPuertas=4;
		}
	}
	
	public String dameColor(){			//GETTER
		return color;
	}
	
	public void cambiaColor(String color){
		this.color= color;
	}
	
	public int dimeNumPuerta(){
		return numPuertas;
	}
	
	
	
	
	
	
		
	
	
	
	

}
	
