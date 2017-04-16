package main;
import models.*;

public class pruebaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche1 = new Coche ("Seat", "rojo" , 2012 ,150 , 4, "1B54", false );
		Coche miCoche2 = new Coche ("Ferrari", "negro" , 2013 ,150 , 4, "25A5", true );
		Coche miCoche3 = new Coche ("Renault", "azul" , 2015 ,150 , 4, "E453", true );
		
		//Condion de si es deportivo el num de puertas tiene que ser 2, si no de 4
		
		miCoche1.esDeportivo();
		miCoche2.esDeportivo();
		miCoche3.esDeportivo();
		
		//Cambiar el color
		
		miCoche1.cambiaColor("gris");
		
		System.out.println("El número de puertas del coche1 es "+ miCoche1.dimeNumPuerta());
		System.out.println("El número de puertas del coche2 es "+ miCoche2.dimeNumPuerta());
		System.out.println("El número de puertas del coche3 es "+ miCoche3.dimeNumPuerta());
		
		System.out.println("El color del coche 1 es "+miCoche1.dameColor());
		System.out.println("El color del coche 2 es "+miCoche2.dameColor());
		System.out.println("El color del coche 3 es "+miCoche3.dameColor());
		
		
		System.out.println("La velocidad máxima del coche 1 es "+miCoche1.dimeVelocidad());
		System.out.println("La velocidad máxima del coche 2 es "+miCoche2.dimeVelocidad());
		System.out.println("La velocidad máxima del coche 3 es "+miCoche3.dimeVelocidad());
		
		
		
		
		
		
		
		
		
		

	}

}
