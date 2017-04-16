package test;

import models.*;

public class test {

	public static void main(String[] args) {

		Libro l = new Libro(300, "Azul", "Lo que el viento se llevo",
				"Cervantes");

		Libro l2 = new Libro(270, "Blanco", "La ladrona de libros",
				"Markus Zusack");

		Libro l3 = new Libro(250, "negro",
				"Harry potter y la piedra filosofal", "J.K. Rowling");

		Libro l4 = new Libro(34, "blanco", "The va al parque", "Raúl Cortés");

		Libro l5 = new Libro(500, "naranja",
				"El señor de los anillos. La comunidad del anillo",
				"J.R.R. Tolkien");

		CD cd = new CD("Grandes exitos de ayer y hoy", "Raphael", 99.99F, 1982);
		CD cd2 = new CD("hello again", "Adele", 16.25F, 1996);
		CD cd3 = new CD("Hijos del mar", "David Bisbal", 18.25F, 2000);
		CD cd4 = new CD("Oro", "Camela", 12.25F, 1998);
		CD cd5 = new CD("Cry Baby", "King África ", 21.25F, 2013);

		CD[] cds = { cd, cd2, cd3, cd4, cd5 };
		Libro[] libros = {l, l2, l3, l4, l5};
		
		Libreria lib = new Libreria("Tony", cds, libros);
		
		CD cdMasCaro = lib.getCDmasCaro();
		
		System.out.println("El nombre del cd mas caro es "+cdMasCaro.getNombre());
		System.out.println(String.format("El nombre del cd mas caro es %s",cdMasCaro.getNombre()));
	
		System.out.println("El precio total de cds es: "+lib.getPrecioTotalCDs());
	}
}
