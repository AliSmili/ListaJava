package models;

public class Rata extends Animal {
	private String color;

	public Rata(String color, String nombre, int edad) {
		super(nombre, edad);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rata [color=" + color + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
