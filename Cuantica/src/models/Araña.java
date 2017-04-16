package models;

public class Ara�a extends Animal {
	private boolean venenosa;

	public Ara�a(boolean venenosa, String nombre, int edad) {
		super(nombre, edad);
		this.venenosa = venenosa;
	}

	@Override
	public String toString() {
		return "Ara�a [venenosa=" + venenosa + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
