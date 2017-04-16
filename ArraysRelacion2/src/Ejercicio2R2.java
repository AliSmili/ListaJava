import java.util.Scanner;
public class Ejercicio2R2 {

	public static void main(String[] args) {		//**Importante
		// Escribe una función “RellenaEnOrdenDesc” que nos rellena un array con los valores siguientes:
		//tamaño del array, tamaño del array-1, etc., 3, 2, 1.
		
		int miArray[];
		int dim;
		
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		String resultado="";
		
		//Validación del dato de la dimensión del array
			
		
		dim=ValidarDimensionArray(resultado);
		
		miArray=new int[dim];
		
		//La función para realizar la operacion del relleno del array con valores que parten desde el tamaño de ese.
		
		miArray= OrdenarArrayAscend(miArray,dim);
		
		
		System.out.println("El array descendente es :");
		
		 
		
		for (int i : miArray) {
			System.out.print(" "+i+" ");
		}
		
		
		
		
		

	}
	
	//Validación del dato de la dimensión del array
	
	public static int ValidarDimensionArray(String resultado){
		int dim=1;
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		
		do{
			System.out.println("Introduzca el tamaño del array que va a introducir:");
			resultado=teclado.next();
			error=false;
		try{
			dim=Integer.parseInt(resultado);
			
		}catch(Exception e){
			System.out.println("ERROR: No ha introducido un número!");
			error=true;
		}
		if(dim<1 && error==false){
			System.out.println("ERROR:La dimesión del array no puede ser inferior a 1 !");
			error=true;
		}
			
		}while(error);
		
		return(dim);
		
		
	}
	
	//La función para realizar la operacion del relleno del array con valores que parten desde el tamaño de ese.
	
	public static int[] OrdenarArrayAscend(int[]Array, int dimension){
	Array=new int[dimension];
		
		for(int i=0;i<Array.length;i++){
			
			Array[i]=dimension;
			dimension--;
		}
		return(Array);
	}
	
	
	
	
	

}
