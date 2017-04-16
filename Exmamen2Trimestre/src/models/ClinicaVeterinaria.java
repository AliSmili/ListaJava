package models;
import java.util.*;

public class ClinicaVeterinaria {
	
	private String nombre;										//Para la identificacion le pongo este atributo
	private ArrayList<Animal> listaAnimales;
	
	public ClinicaVeterinaria(String nombre) {
		this.nombre = nombre;
		this.listaAnimales = new ArrayList<Animal>();
		
	}
	
	/**
	 * Nos devuelve la lista de animales disponibles
	 */
	public ArrayList<Animal> getListaAnimales() {
		return listaAnimales;
	}
	
	/**
	 * Para agregar un animal a la clínica
	 */
	public void InsertaAnimal (int opcion){
		//int opcion = mostrarMenuInsertar();
		String nombre="",  FechaNacimiento="", comentarios="", raza="" , microchip="", especie="";
		double peso;
		boolean cantor = false;
		boolean venenoso = false;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Peso: ");
		peso = teclado.nextDouble();
		System.out.println("Fecha de nacimiento: ");
		FechaNacimiento = teclado.nextLine();
		System.out.println("Comentarios: ");
		comentarios = teclado.nextLine();
		
		switch (opcion) {
		case 1://Perro
			Animal perro = new Perro(nombre, raza, FechaNacimiento, peso, microchip, comentarios);
			aniadirAnimal(perro);
			break;
		case 2://Gato
			Animal gato = new Gato( nombre, raza,  FechaNacimiento,  peso,  microchip);
			aniadirAnimal(gato);
			break;
		case 3://Pajaro
			Animal pajaro = new Pajaro( nombre,  FechaNacimiento,  peso,  especie,  cantor,  comentarios);
			aniadirAnimal(pajaro);
			break;
			
		case 4://Reptil
			Animal reptil = new Reptil(  nombre,  FechaNacimiento,  peso,  especie,  venenoso);
			break;
			
		default:
			break;
		}
		
	}
	
	/**
	 * Aniadir al animal de una vez
	 */
	
	private void aniadirAnimal(Animal a) {
		if (!this.listaAnimales.contains(a)) {
			this.listaAnimales.add(a);
		} else {
			System.out.println("[ERROR] El animal en cuestión " + a.getNombre() + " ya está en la clínica!!");
		}
	}
	
	/**
	 * Menú Insertar
	 */
	public int mostrarMenuInsertar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** MENU - INSERTAR ANIMAL **/");
		System.out.println("1. Perro");
		System.out.println("2. Gato");
		System.out.println("3. Pajaro");
		System.out.println("4. Reptil");

		System.out.println("¿Qué Animal desea insertar?: ");
		return teclado.nextInt();

	}
	
	/**
	 * Buscar un animal concreto
	 */
	
	public void BuscaAnimal(String nombre){
		
		for (Animal animal : listaAnimales) {
			
			if(nombre.equalsIgnoreCase(Animal.getNombre())){
				System.out.println(animal);
			}else{
				System.out.println("El animal cuyo nombre es "+nombre+" no se encuentra en esta clínica");
			}
			
		}
				
	}
	
	/**
	 * Modificar comentarios
	 */
	public void ModificarComentario(String nombre, String NuevoComentario){
	
		for (Animal animal : listaAnimales) {
			
			if(nombre.equalsIgnoreCase(Animal.getNombre())){				//ERROR GRAVE  ANIMALEN VEZ DE ANIMAL
				Animal.setComentario(NuevoComentario);
			}else{
				System.out.println("El animal cuyo nombre es "+nombre+" no se encuentra en esta clínica");
			}
	
		}
	
	}
	
	/**
	 * Menu con varias opciones
	 */
	public void listarAnimales() {
		System.out.println("Lista de Animales: ");
		for (Animal anim : this.listaAnimales) {
			System.out.println(anim);
		}
		if (this.getListaAnimales().isEmpty())
			System.out.println("No hay vehiculos reparados");
	}
	
	private int mostrarSubmenu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("/** MENU MULTIFUNCIONAL **/");
		System.out.println("1. Insertar animal");
		System.out.println("2. Modificar comentarios");
		System.out.println("3. Mostrar ficha animal");
		

		System.out.println("¿Qué opcion desea insertar?: ");
		return teclado.nextInt();

	}
	
	
	
	
	
	
	
}
