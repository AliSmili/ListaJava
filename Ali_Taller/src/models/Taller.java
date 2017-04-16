package models;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Taller {
	
	private String nombre;
	
	private LinkedList<Vehiculo>ListaAveriados;
	private LinkedList<Vehiculo>ListaReparados;
	
	public Taller(String nombre , LinkedList<Vehiculo>ListaAveriados, LinkedList<Vehiculo>ListaReparados){
		
		this.nombre = nombre;
		this.ListaAveriados=new LinkedList<Vehiculo>();
		this.ListaReparados=new LinkedList<Vehiculo>();
		//ITERATOR
		ListIterator<Vehiculo> iterAv =ListaAveriados.listIterator();
		ListIterator<Vehiculo> iterRep =ListaReparados.listIterator();
	}
	
	//METODOS
	
		//GETTERS
	public LinkedList<Vehiculo> getListaAveriados(){
		return ListaAveriados;
	}
	
	public LinkedList<Vehiculo> getListaReparados(){
		return ListaReparados;
	}
	
		//SETTERS
	public void aniadirVehiculoAveriado(Vehiculo V){					//Mostrara un error si el vehículo ya esta en el taller
		if(ListaAveriados.contains(V)){
			System.out.println("El vehículo ingresado cuya matrícula es "+V.getMatricula()+" ya se encuentra en el el taller!");
		}else		
		{
			ListaAveriados.add(V);
		}
	}
	
	public void retirarVehiculo(Vehiculo V){							//Se puede mejorar
		ListaReparados.remove(V);
	}
	
	/*DAR PRESUPUESTO A UN VEHÍCULO
	 */
	
	public void modificarPrecioRep(Vehiculo V,double precioRep){
		V.setPrecioRep(precioRep);
	}
	
	//Desde Aqui el copie paste
	
	public void insertarNuevoVehiculo() {
		int opcion = mostrarMenuInsertar();
		String color, matricula, marca, tel, modelo;
		double precioRep, totalPagado;
		int veloMax = 0;
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Color: ");
		color = sc.nextLine();
		System.out.print("Matricula: ");
		matricula = sc.nextLine();
		System.out.print("Marca: ");
		marca = sc.nextLine();
		System.out.print("Modelo del Vehículo: ");
		modelo = sc.nextLine();
		System.out.print("Telefono del cliente: ");
		tel = sc.nextLine();
		System.out.print("Precio de la reparación ");
		precioRep = sc.nextDouble();
		System.out.print("El total pagado es: ");
		totalPagado=sc.nextDouble();
		
		
		System.out.print("Velocidad max: ");
		try {
			veloMax = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			// Si falla la lectura, 120km/h por defecto
			veloMax = 120;
		}

		switch (opcion) {
		case 1:// coche
			Vehiculo coche = new Coche(color, matricula, marca,modelo, veloMax, tel, precioRep, totalPagado);
			aniadirVehiculoAveriado(coche);
			break;
		case 2:
			System.out.print("Marca del escape?: ");
			String marcaEsc = sc.nextLine();
			Vehiculo moto = new Motocicleta(marcaEsc, marca, matricula, color, veloMax, tel, precioRep, totalPagado);
			aniadirVehiculoAveriado(moto);
			break;
		case 3:
			Vehiculo ciclo = new Ciclomotor(color, matricula, marca,modelo, veloMax, tel, precioRep, totalPagado);
			aniadirVehiculoAveriado(ciclo);
			break;
		default:
			break;
		}
	}

	public void listarVehiculos() {
		int opcion = mostrarMenuListar();
		switch (opcion) {
		case 1:
			listarVehiculosAveriados();
			listarVehiculosReparados();
			break;
		case 2:
			listarVehiculosAveriados();
			break;
		case 3:
			listarVehiculosReparados();
			break;
		default:
			break;
		}
	}
	


	private int mostrarMenuInsertar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("/** SUBMENU - CREAR VEHICULO **/");
		System.out.println("1. Coche");
		System.out.println("2. Motocicleta");
		System.out.println("3. Ciclomotor");

		System.out.println("¿Qué desea crear?: ");
		return sc.nextInt();

	}

	private int mostrarMenuListar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("/** SUBMENU - LISTAR VEHICULO **/");
		System.out.println("1. Todos");
		System.out.println("2. Averiados");
		System.out.println("3. Reparados");

		System.out.println("¿Qué desea crear?: ");
		return sc.nextInt();

	}
	
	//AQUI EMPIEZA LA CHICHA !!
	
	private int mostrarMenuReparar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("/** SUBMENU - REPARAR VEHICULO **/");
		System.out.println("1. Política de reparación FIFO");
		System.out.println("2. Política de reparación LIFO");
		System.out.println("3. Terminar jornada!");

		System.out.println("¿Qué desea hacer?: ");
		return sc.nextInt();

	}
	
	//AQUI VIENE NUESTRO AMIGO EL ITERATOR !
	
	private void listarVehiculosAveriados() {
		System.out.println("Lista de Averiados: ");
		for (Vehiculo veh : this.getListaAveriados()) {
			if(veh instanceof Coche)
				System.out.print("[COCHE]: ");
			else if(veh instanceof Motocicleta)
				System.out.print("[MOTO]: ");
			else if(veh instanceof Ciclomotor)
				System.out.print("[CICLO]: ");
			System.out.println(veh);
		}
		if (this.getListaAveriados().isEmpty())
			System.out.println("No hay vehiculos averiados");
	}

	private void listarVehiculosReparados() {
		System.out.println("Lista de Reparados: ");
		for (Vehiculo veh : this.getListaReparados()) {
			System.out.println(veh);
		}
		if (this.getListaReparados().isEmpty())
			System.out.println("No hay vehiculos reparados");
	}
	
	//Aqui la otra chicha GORDA
	private void repararVehiculo(Vehiculo V, int opcion, Cliente c, Taller T){
		Scanner sc = new Scanner(System.in);
		Vehiculo primerVeh, ultimoVeh;
		switch (opcion) {
		case 1:		//FIFO
			primerVeh=ListaAveriados.getFirst();
			System.out.println("El Primer Coche en llegar es : "+primerVeh);
			System.out.println("Una emergencia, y se le da la prioridad al hora de reparar !");
			
			c.pagarReparacion(V, T);							//Aqui gracias al este metodo, se comprueba si el vehiculo pertenece al cliente y sus deudas
		
			break;
		case 2:
			ultimoVeh=ListaAveriados.getLast();
			System.out.println("El Ultimo Coche en llegar es : "+ultimoVeh);
			c.pagarReparacion(V, T);
			break;
	
		case 3:
			System.out.println("[SALIR] Fin de la jornada.");
			break;
		default:
			System.out.println("[ERROR] Opción no válida.");
			break;
		}
	}

}
