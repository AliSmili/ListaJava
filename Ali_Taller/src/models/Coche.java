package models;

public class Coche extends Vehiculo {
	
	private String estadoVentanillas;
	public Coche(String color, String matricula, String marca, String modelo, double velMax, String telefonoPropietario,
			double precioRep, double totalPagado) {
		super(color, matricula, marca, modelo, velMax, telefonoPropietario, precioRep, totalPagado);
		
	}
	
	
	//Metodos
	public void subirVentanillas(){
		this.estadoVentanillas="Subidas";
	}
	
	public void bajarVentanillas(){
		this.estadoVentanillas="Bajadas";
	}

	

}
