package Models;

public class TransferenciaBancaria {


	
	int numCuentaOrigen;
	int numCuentaDestino;
	String emisor;
	String receptor;
	String bancoOrigen;
	String bancoDestino;
	int dinero;
	

	public TransferenciaBancaria(){
		emisor = "Ali";
		receptor="Pepe";
		numCuentaOrigen= 1111;
		numCuentaDestino=2222;
		dinero=5000;
}
	
	public int MandaPasta(){
		return dinero;
	}
	
	public int IngresaPasta(){
		return dinero;
	}
	
	
	}