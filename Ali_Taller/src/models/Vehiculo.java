package models;

public abstract class Vehiculo implements Arrancable, Movible {

	//Atributos
	private String color;
	private String matricula;
	private String marca;
	private String modelo;
	private double velMax;
	private double velAct;
	private String telefonoPropietario;
	private double precioRep;
	private double totalPagado;
	
	public Vehiculo(String color, String matricula, String marca, String modelo, double velMax, String telefonoPropietario, double precioRep, double totaPagado){
		
		this.color=color;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo=modelo;
		this.velMax = velMax;
		this.velAct=0;
		this.telefonoPropietario=telefonoPropietario;
		this.precioRep=0;
		this.totalPagado=0;
		
	}
	
	//Metodos
	
	@Override
	public void arrancar(){
		System.out.println("El vehículo con matrícula " + this.matricula + " ha arrancado.");
	}
	
	@Override
	public void parar(){
		System.out.println("El vehículo con matrícula " + this.matricula + " ha parado.");
	}
	
	@Override
	public void acelerar(double velocidad){
		this.velAct+=velocidad;
		
	}
	
	@Override
	public void frenar(double velocidad){
		this.velAct-=velocidad;
	}
	
	//GETTERS
	public String getMarca(){
		return marca;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public double getVelMax(){
		return velMax;
	}
	
	public double getVelAct(){
		return velAct;
	}
	
	public String getTelefonoPropietario() {
		return telefonoPropietario;
	}
	
	public double getPrecioRep(){
		return precioRep;
	}
	
	public double getTotalPagado(){
		return totalPagado;
	}
	
	//SETTERS
	
	public void setPrecioRep(double precioRep){
		this.precioRep = precioRep;
	}
	
	public void setTotalPagado(double totalPagado){
		this.totalPagado=totalPagado;
	}
	
	@Override
	public String toString(){
		return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", telefonoPropietario=" + telefonoPropietario
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
