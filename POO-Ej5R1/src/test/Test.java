package test;


import models.*;

public class Test {
	public static void main(String[] args){
		Libro l1 = new Libro("HP 1", "J.K. Rowling", 300, 10);
		Libro l2 = new Libro("HP 2", "J.K. Rowling", 300, 10);
		Libro l3 = new Libro("HP 3", "J.K. Rowling", 300, 10);
		Libro l4 = new Libro("HP 4", "J.K. Rowling", 300, 10);
		
		ConjuntoLibros cj = new ConjuntoLibros();
		cj.addLibro(l1);
		cj.addLibro(l2);
		cj.addLibro(l2);
		cj.addLibro(l3);
		cj.addLibro(l4);
		
		System.out.println(cj);
		
		
	}
}