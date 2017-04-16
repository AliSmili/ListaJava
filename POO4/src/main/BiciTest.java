package main;

import models.Motocicleta;
public class BiciTest {

	public static void main(String[] args) {
		
		Motocicleta miMoto = new Motocicleta("Rojo", "Honda", 250.8f, 10.8f);
		Motocicleta miPepino = new Motocicleta("Azul","Harley Davidson", 190.0f, 11.1f);
		
		miMoto.Acelerar();
		
		miMoto.Frenar();
		
		
		
		System.out.println("LA MARCA DE MI SEGUNDA MOTO ES: "+miPepino.marca);
		

	}

}
