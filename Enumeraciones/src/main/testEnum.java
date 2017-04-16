package main;
import java.util.Scanner;

import models.dia;
public class testEnum {
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String opcion;
		System.out.println("Introduce el día de la semana");
		System.out.println("1-LUNES");
		System.out.println("2-MARTES");
		System.out.println("3-MIERCOLES");
		System.out.println("4-JUEVES");
		System.out.println("5-VIERNES");
		System.out.println("6-SABADO");
		System.out.println("7-DOMINGO");
		System.out.println("->");
		
		opcion = teclado.nextLine();
		
		System.out.println(dia.valueOf(opcion.toUpperCase()));
		
		
		
		}
		

	}


