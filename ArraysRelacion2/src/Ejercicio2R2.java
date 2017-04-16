import java.util.Scanner;
public class Ejercicio2R2 {

	public static void main(String[] args) {		//**Importante
		// Escribe una funci�n �RellenaEnOrdenDesc� que nos rellena un array con los valores siguientes:
		//tama�o del array, tama�o del array-1, etc., 3, 2, 1.
		
		int miArray[];
		int dim;
		
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		String resultado="";
		
		//Validaci�n del dato de la dimensi�n del array
			
		
		dim=ValidarDimensionArray(resultado);
		
		miArray=new int[dim];
		
		//La funci�n para realizar la operacion del relleno del array con valores que parten desde el tama�o de ese.
		
		miArray= OrdenarArrayAscend(miArray,dim);
		
		
		System.out.println("El array descendente es :");
		
		 
		
		for (int i : miArray) {
			System.out.print(" "+i+" ");
		}
		
		
		
		
		

	}
	
	//Validaci�n del dato de la dimensi�n del array
	
	public static int ValidarDimensionArray(String resultado){
		int dim=1;
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		
		do{
			System.out.println("Introduzca el tama�o del array que va a introducir:");
			resultado=teclado.next();
			error=false;
		try{
			dim=Integer.parseInt(resultado);
			
		}catch(Exception e){
			System.out.println("ERROR: No ha introducido un n�mero!");
			error=true;
		}
		if(dim<1 && error==false){
			System.out.println("ERROR:La dimesi�n del array no puede ser inferior a 1 !");
			error=true;
		}
			
		}while(error);
		
		return(dim);
		
		
	}
	
	//La funci�n para realizar la operacion del relleno del array con valores que parten desde el tama�o de ese.
	
	public static int[] OrdenarArrayAscend(int[]Array, int dimension){
	Array=new int[dimension];
		
		for(int i=0;i<Array.length;i++){
			
			Array[i]=dimension;
			dimension--;
		}
		return(Array);
	}
	
	
	
	
	

}
