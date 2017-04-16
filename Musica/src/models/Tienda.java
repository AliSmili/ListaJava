package models;
import java.util.*;
public class Tienda {
	
	private String nombre;
	private ArrayList<Instrumento> ListaInstrumentosStock;
	private float totalVentas;
	public static int cont=0;
	private int ventas;
	private boolean isAfinado;

	public Tienda(String nombre) {
		this.nombre = nombre;
		this.ListaInstrumentosStock = new ArrayList<Instrumento>();
		this.totalVentas = 0;
	}
	

	/**
	 * Listar los instrumentos que estan en el stock
	 */
	public ArrayList<Instrumento> getListaInstrumentos() {
		return ListaInstrumentosStock;
	}
	
	/**
	 * Añadir Instrumento nuevo al stock
	 */
	
	public void AniadirInstrumento(int opcion){
		Scanner teclado = new Scanner(System.in);
		
		String color, marca, modelo, tipo;
		float precio;
		int numCuerdas;
		int numPlatos;
		int numTimbales;
		int numTeclas;
		
		
			System.out.println("Color : ");
			color = teclado.nextLine();
			
			System.out.println("Marca : ");
			marca = teclado.nextLine();
			
			System.out.println("Modelo : ");
			modelo = teclado.nextLine();
			
			System.out.println("Precio : ");
			precio = teclado.nextFloat();
			
			
			switch(opcion){
			
			case 1:
				System.out.println("Indica el número de cuerdas");
				numCuerdas = teclado.nextInt();
				
				System.out.println("Indica el tipo de guitarra");
				tipo = teclado.nextLine();
				Instrumento g = new  Guitarra( numCuerdas,  tipo,  marca,  modelo,  color,  precio);
			
				ComprobarStock(g);					//Lo comprueba y si hay hueco lo mete
				break;
				
			case 2:
				System.out.println("Indica el número de timbales");
				numTimbales = teclado.nextInt();
				
				System.out.println("Indica el numero de platos");
				numPlatos = teclado.nextInt();
				Instrumento b = new  Bateria( numTimbales,  numPlatos,  marca,  modelo,  color,  precio);
				ComprobarStock(b);
				break;
			
			case 3:
				System.out.println("Indica el número de teclas del piano");
				numTeclas = teclado.nextInt();
				
				Instrumento p = new  Piano( numTeclas , marca,  modelo,  color,  precio);
				ComprobarStock(p);
				break;
			
			default:
				System.out.println("Opcion no válida");
			break;
			}
	
	
	}
	/**
	 * Comprobar si el instrumento esta en el stock
	 */
	
	private void ComprobarStock(Instrumento i){
		if(!this.ListaInstrumentosStock.contains(i)){
			ListaInstrumentosStock.add(i);
			
		}else{
			System.out.println("Este instrumento cuyo modelo es "+i.getModelo()+"  ya existe en el stock de la tienda !");
		}
	}
	
	/**
	 * Mostrar el subMenu para elegir el instrumento y devuelve la opcion seleccionada
	 */
	public int MostrarMenuInsertar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("/** SUBMENU - AGREGAR INSTRUMENTO **/");
		System.out.println("1. Guitarra");
		System.out.println("2. Batería");
		System.out.println("3. Piano");

		System.out.println("¿Qué desea agregar a la tienda?: ");
		return sc.nextInt();
	}
	
	/**
	 * Menu para elegir el instrumento
	 */
	public int MostrarMenuElegir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("/** SUBMENU - ELEGIR INSTRUMENTO **/");
		System.out.println("1. Guitarra");
		System.out.println("2. Batería");
		System.out.println("3. Piano");

		System.out.println("¿Qué desea elegir para probar ?: ");
		return sc.nextInt();
	}
	
	/**
	 * Sacar el total de las ventas y ctas ventas se han realizado
	 */
	public void getTotalVentas(){
			
		System.out.println("Se han hecho un total de "+cont+" ventas hoy");
		System.out.println("El totl vendido es "+this.totalVentas);
	}
	
	
	/**
	 * Probar Instrumento
	 */
	public void probarInstrumento(Instrumento i){
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quieres afinar el instrumento ?");
		String afin= teclado.nextLine();
		
		if(afin.equalsIgnoreCase("SI")){
			this.isAfinado= true;
		}else{
			this.isAfinado = false;
		}
		
		
			if(i instanceof Guitarra){
				isAfinado=i.estaAfinado();
				Guitarra.TocarInstrumento(isAfinado);
				
			}else{
				if(i instanceof Bateria){
					isAfinado = i.estaAfinado();
					Bateria.TocarInstrumento(isAfinado);
				
				}else{
					if(i instanceof Piano ){
						i.TocarInstrumento();
					}else{
						System.out.println("No hay nada que probar !");
					}
				}
			}
				
		
	}
	
	/**
	 * Listar instrumentos
	 */
	private void listarInstrumentosStock() {
		System.out.println("Lista de instrumentos: ");
		for (Instrumento inst : this.getListaInstrumentos()) {
			System.out.println(inst);
		}
		if (this.getListaInstrumentos().isEmpty())
			System.out.println("No hay instrumentos");
	}
	/**
	 * Vender Instrumento
	 */
	public void venderInstrumento(Instrumento i){
		Scanner teclado = new Scanner(System.in);
		String confirm;
		System.out.println("[CONFIRMACIÓN] ¿Quieres marcar el intrumento cuyo modelo es "+ i.getModelo() + " como vendido?");
		confirm = teclado.nextLine();
		if(confirm.equalsIgnoreCase("SI")){
			ListaInstrumentosStock.remove(i);
			cont ++;
			this.totalVentas += i.getPrecio();
			
			
		}else{
			System.out.println("No ha confirmado su venta !");
		}
	}
	
	


}
