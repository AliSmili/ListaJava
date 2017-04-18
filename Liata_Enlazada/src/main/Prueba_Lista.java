package main;

import java.util.Scanner;

import models.Lista;



public class Prueba_Lista {

	private static Lista<String> miLista;
	public static void main(String[] args) {
		
		int opcion = 0;	
		boolean error = false;
		miLista= new Lista<String>();
		
		do {
			
			try{
			opcion = mostrarMenu();
			realizarOpcion(opcion);
			error = false;
			}catch(Exception e){
			 System.out.println("Dato introducido no válido !");
			 error = true;
			 }
			} while (opcion != 8 || error);
		
		
	}
	
	public static int mostrarMenu(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("+++ SELECCIONE UNA OPCIÓN DEL MENÚ : +++");
		System.out.println("1. Añada un elemento a la lista");
		System.out.println("2. Quitar un elemento de la lista");
		System.out.println("3. Dime el siguiete elemento de la lista");
		System.out.println("4. Dime el elemento previo de la lista");
		System.out.println("5. Dime en qué elemento de la lista estamos");
		System.out.println("6. Establece un indice que apunte a un elemento de la lista");
		System.out.println("7. Mostrar los elementos de la lista");
		System.out.println("8. Salir");
		
		return sc.nextInt();
		
	}
	public static void realizarOpcion(int opcion) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		switch (opcion) {
		case 1:
			System.out.println("Introduzca un elemento a la Cola :");									
			miLista.add(sc.next());
			break;
		case 2:
			System.out.println("Introduzca un elemento que desea retirar de la Cola :");
			if(miLista.isEmpty()){
				System.out.println("No hay ningún elemento que extraer de la lista");
			}else{
			miLista.remove(sc.next());
			}
			break;
		case 3:
			if(miLista.isEmpty()){
				System.out.println("No hay ningún elemento de la lista que se pueda mostrar");
			}else{
			miLista.getNext();
			}
			System.out.println("El siguiente elemento de la lista es "+miLista.getCurrent());
			break;
		case 4:
			if(miLista.isEmpty()){
				System.out.println("No hay ningún elemento de la lista que se pueda mostrar");
			}else{
			miLista.getPrev();
			}
			System.out.println("El anterior elemento de la lista es "+miLista.getCurrent());
			break;
		case 5:
			if(miLista.isEmpty()){
				System.out.println("No hay ningún elemento de la lista que se pueda mostrar");
			}else{
				miLista.getCurrent();
			System.out.println("El elemento actual al que apunta el index de mi lista es  :"+miLista.getCurrent());
			}
			break;
		case 6:
			if(miLista.isEmpty()){
				System.out.println("No hay ningún elemento de la lista a donde apuntar");
			}else{
				System.out.println("Introduzca un indice de la lista :");
				miLista.setIndex(sc.nextInt());
				System.out.println("El elemento actual al que apunta el index de mi lista es  :"+miLista.getCurrent());
			}
			break;
		case 7:
			if( miLista.isEmpty()){
				System.out.println("La Cola está vacía  ");
			}else{
			miLista.display();
			}
			break;
		case 8:
			System.out.println("Que tenga un Feliz Día !");
			break;

		default:
			System.out.println("[ERROR] Opción no válida.");
			break;	
		}				
	}
}
