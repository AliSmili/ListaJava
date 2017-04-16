package models;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cliente {
	
	private String nombreCliente;
	private int id;
	private String telefonoCliente;
	private String matriculaCliente;
	private double deuda;
	
	
	public Cliente(int id, String nombreCliente, String telefonoCliente, double deuda){			//Suponiendo que el client puede tener deudas pendientes con el Taller
		
		this.id=id;
		this.nombreCliente=nombreCliente;
		this.telefonoCliente=telefonoCliente;
		this.matriculaCliente=matriculaCliente;
		this.deuda=deuda;
		
	}
	

	@Override
	public String toString(){
		return "[Nombre del Cliente :" + nombreCliente + ", cuya deuda pendiente es de=" + deuda + ", telefonoPropietario=" + telefonoCliente
				+ "]";
	}
	
	
	//GETTERS
	
	public int getIdCliente(){
		return id;
	}
	
	public String getNombreCliente(){
		return nombreCliente;
	}
	
	public String getTelefonoCliente(){
		return telefonoCliente;
	}
	
	public double getDeuda(){
		return deuda;
	}
		
	//SETTERS
	
	public void setNombreCliente(String nombreCliente){
		this.nombreCliente=nombreCliente;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setTelefonoCliente(String telefonoCliente){
		this.telefonoCliente=telefonoCliente;
	}
	
	
	/*
	 * PAGAR AL TALLER LA DEUDA
	 */
	public void pagarReparacion(Vehiculo V, Taller T){
		double pago = 0;
		double deuda=0;
		Scanner sc = new Scanner(System.in);
		
		if(V.getTelefonoPropietario()!=telefonoCliente){
			System.out.println("El vehículo no pertenece al cliente !!");
		}else{
		do{
		System.out.println("La deuda contraida es :"+V.getPrecioRep()+" euros");
		System.out.println("Cuánto dinero va a ingresar para pagar la deuda??");
		
		try {
			pago = sc.nextDouble();
			sc.nextLine();
			
			
		} catch (InputMismatchException e) {
			// Si falla la lectura, 0 por defecto de pago
			pago = 0;
		}
		
		if(pago <=0){
			System.out.println("No se puede pagar negativamente !");
		}else{
			this.deuda = V.getPrecioRep()-pago;
			if(deuda <=0){
				System.out.println("El vehículo cuya matrícula es "+V.getMatricula()+"y cuyo propietario es "+nombreCliente+" se puede retirar del Taller");		//Ojo
				T.retirarVehiculo(V);
			}else{
				System.out.println("Sentimos informar al cliente que no se puede retirar el vehículo hasta que pague lo que le corrsponde!");
			}
			
		}
				
		}while(pago<=0);
		}
	
	
	}
}
	
	
	
	
	
	
	


