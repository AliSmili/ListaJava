package models;

public class Motocicleta extends Vehiculo {

	private String marcaEscape;
	public Motocicleta(String color, String matricula, String marca, String modelo, double velMax,
			String telefonoPropietario, double precioRep, double totalPagado) {
		super(color, matricula, marca, modelo, velMax, telefonoPropietario, precioRep, totalPagado);
	}
	public Motocicleta(String maracaEscape,String color, String matricula, String marca, String modelo, double velMax,
				String telefonoPropietario, double precioRep, double totalPagado) {
		super(color, matricula, marca, modelo, velMax, telefonoPropietario, precioRep, totalPagado);
	this.marcaEscape = marcaEscape;
		
		
	}
	
	
	//Metodos
		//SETTER
	public void setMarcaEscape(String marcaEscape){
		this.marcaEscape=marcaEscape;
		
	}
	
	//GETTER
	public String getMarcaEscape(){
		return marcaEscape;
	}
	

}
