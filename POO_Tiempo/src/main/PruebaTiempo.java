package main;
import models.*;
public class PruebaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiempo miHora1 = new Tiempo (23, 45, 59);
		Tiempo miHora2 = new Tiempo (9, 34, 59);
		Tiempo miHora3 = new Tiempo (-9, 30, 59);
		
		
		System.out.println(miHora1.dimeHora());
		System.out.println(miHora2.dimeHora());
		System.out.println(miHora3.dimeHora());
		
		miHora3.cambiaHora(-2, 48, 39);
		
		System.out.println(miHora3.dimeHora());
		
		Tiempo miHora4 = new Tiempo(5 , 53);
		Tiempo miHora5 = new Tiempo(5);
		
		miHora4.dimeHora();
		
		
		
		
		

	}

}
