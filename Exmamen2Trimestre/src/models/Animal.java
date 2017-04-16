package models;

public abstract class Animal {

	public static String nombre;
	protected String FechaNacimiento;
	protected double peso;
	protected  String comentarios; 
	
	public Animal (String nombre, String FechaNacimiento, double peso, String comentarios){
		
		this.nombre = nombre;
		this.FechaNacimiento = FechaNacimiento;
		this.peso = peso;
		this.comentarios = comentarios;
	}
	
	public Animal (String nombre, String FechaNacimiento, double peso){
		
		this.nombre = nombre;
		this.FechaNacimiento = FechaNacimiento;
		this.peso = peso;
		
	}
	

	public static  String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public static  void setComentario(String comentarios){
		comentarios = comentarios;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", Fecha de nacimiento=" + FechaNacimiento + ", peso=" + peso
				+ "]";
	}
	
	
}
