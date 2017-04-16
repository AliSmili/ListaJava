package main;
import models.*;
import java.util.*;
public class pruebaMusica {
	
	private static Tienda t ;
	public static void main(String[] args) {
		
		t = new Tienda ("AliBaba");
		int opcion;
		
	do{
			opcion = MostrarMenuPrincipal();
			RealizarOpcion(opcion);
	}while(opcion !=5 );
	
	}
	
	
	/**
	 * Mostrar Menu Principal
	 */
	public static int  MostrarMenuPrincipal(){			
	Scanner sc = new Scanner(System.in);
	System.out.println("** MENU **");
	System.out.println("1. Añadir Instrumento");
	System.out.println("2. Total Ventas");
	System.out.println("3. Probar Instrumento");
	System.out.println("4.Vender Instrumento");
	System.out.println("5.Salir");
	

	System.out.println("¿Qué desea hacer?: ");
	return sc.nextInt();

	}
	
	public static void RealizarOpcion(int opcion ){
		Scanner teclado = new Scanner(System.in);
		
		 
		switch(opcion){
		
		case 1:
			int opcion2 =t.MostrarMenuInsertar();
			t.AniadirInstrumento(opcion2);
			break;
		case 2:
			t.getTotalVentas();
			break;
		case 3:
			System.out.println("Inserte el modelo que quieres probar de la lista de productos que hay :");
			String modelo=teclado.nextLine();
			for (Instrumento i : t.getListaInstrumentos()) {
				if(i.getModelo().equalsIgnoreCase(modelo)){
					t.probarInstrumento(i);
					
				}else{
					System.out.println("No existe tal modelo en nuestro stock !");
				}
			}		
			
		break;
		
		case 4:
			
			System.out.println("Inserte el modelo que quieres vender de la lista de productos que hay :");
			String modelo2=teclado.nextLine();
			
			for (Instrumento i : t.getListaInstrumentos()) {
				if(i.getModelo().equalsIgnoreCase(modelo2)){
					t.venderInstrumento(i);
				}else{
					System.out.println("El modelo introducido no es válido");
				}
							
			}
			break;
			
		default:
			System.out.println("Ha decidido salir del menú");
			break;
			
		}
	}
	
	
	}



