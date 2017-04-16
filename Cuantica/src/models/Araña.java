package models;

public class Araña extends Animal {
	private boolean venenosa;

	public Araña(boolean venenosa, String nombre, int edad) {
		super(nombre, edad);
		this.venenosa = venenosa;
	}

	@Override
	public String toString() {
		return "Araña [venenosa=" + venenosa + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
