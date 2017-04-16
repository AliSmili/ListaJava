package main;
import java.util.*;
import models.*;

public class testClinica {

	private static ClinicaVeterinaria c;
	public static void main(String[] args) {
		
		c = new ClinicaVeterinaria("ratata");
		int opcion;
	
		do {
			opcion = mostrarMenu();
			realizarOpcion(opcion);
		 } while (opcion != 4);
			
	}
	
	/**
	 * Mostrar el menu
	 */
	private static int mostrarMenu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** MENU MULTIFUNCIONAL **/");
		System.out.println("1. Insertar animal");
		System.out.println("2. Modificar comentarios");
		System.out.println("3. Mostrar ficha animal");
		System.out.println("4. Salir");
		

		System.out.println("¿Qué opcion desea insertar?: ");
		return teclado.nextInt();

	}
	
	/**
	 * Listar los Animales
	 */
	public static void realizarOpcion(int opcion) {
		Scanner teclado =new  Scanner (System.in);
		String nombre, NuevoComentario;
		switch (opcion) {
		case 1:
			int opcion1= c.mostrarMenuInsertar();
			c.InsertaAnimal(opcion1);	
			break;
		case 2:
			System.out.println("Ingresa el nombre de la mascota :");
			nombre = teclado.nextLine();
			System.out.println("Esciba su nuevo comentario :");
			NuevoComentario = teclado.nextLine();
			c.ModificarComentario( nombre ,  NuevoComentario) ;
			
			break;
		case 3:
			System.out.println("Escriba el nombre de la mascota");
			nombre = teclado.nextLine();
			c.BuscaAnimal(nombre);
			
			break;
			
		case 4:
			System.out.println("Ha decidido salir del menú");
		

		}
		
	}
	
	
	

}
