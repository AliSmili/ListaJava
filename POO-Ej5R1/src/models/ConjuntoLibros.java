package models;

import java.util.Arrays;

public class ConjuntoLibros {
	
	public final int tam = 10;
	private Libro[] libros;

	public ConjuntoLibros() {
		
		this.libros = new Libro[tam];
	}

	public void addLibro(Libro l) {
		boolean existe = false;					//Existe copia del libro que quiere añadir?

		for (Libro lib : libros) {
			if (lib != null && lib.getTitulo().equals(l.getTitulo())) {
				existe = true;
				break;
			}
		}

		if (!existe) {
			int posicion = siguientePosicion();
			if (posicion != -1) {
				libros[posicion] = l;
			} else {
				System.out.println("Tu conjunto está lleno");
			}
		} else {
			System.out.println("Ese libro ya lo tienes");
		}
	}

	/**
	 * Calcula el siguiente hueco libre para un libro
	 * 
	 * @return Devuelve la posición vacía o -1 si está lleno.
	 */
	private int siguientePosicion() {
		int i = 0;
		for (i = 0; i < libros.length; i++) {
			if (libros[i] == null) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		String s = "";
		int i = 1;
		for(Libro l : libros){
			s += i + ".- ";
			s += l;
			s += "\n";
			i++;
		}
		return s;
	}
	
	
}