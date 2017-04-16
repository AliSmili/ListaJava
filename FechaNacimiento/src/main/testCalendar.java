package main;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
public class testCalendar {

	public static void main(String[] args) {
		
		Date fechaActual = new Date();
		int dia ;
		int mes;
		int anio;
		String Dia, Mes, Anio;
		//System.out.println(fechaActual);
		String FechaNac = "27/09/1981";
		StringTokenizer st = new StringTokenizer(FechaNac, "/");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su fecha de nacimiento empezando por el dia");
		dia = teclado.nextInt(); 
		
		System.out.println("Intrduzca el mes");
		mes = teclado.nextInt();
		
		System.out.println("Introduzca el anio");
		anio = teclado.nextInt();
		
		System.out.println("Su fecha de nacimiento introducida es :");
		System.out.println(anio/mes/dia);
		
		System.out.println("lA FECHA ACTUAL DE HOY ES");
		System.out.println(fechaActual);
		
		Dia  = Integer.toString(c1.get(Calendar.DATE));
		Mes = Integer.toString(c1.get(Calendar.MONTH));
		Anio = Integer.toString(c1.get(Calendar.YEAR));

	}

}
