import java.util.Arrays;
import java.util.Scanner;

public class MediaPosicionPares {

	public static void main(String[] args) {
		/* Programa Java que lea 10 números enteros por teclado y los guarde en un array. 
		 * Calcula y muestra la media de los números que estén en las posiciones pares del array.
		Considera la primera posición del array (posición 0) como par.*/
		
		int dim=1;
		int[] miArray=new int[dim];
		String entrada="";
		float media=0f;
		;
		int[]newArray=new int[dim];
		
			
		//Función Intro dimensión Array
		dim=IntroDimensionArray(entrada);
		
		//Función rellenar un Array
		miArray=IntroValoresIntArray(dim);
		
		System.out.println("El array introducido es :");
		//Función ImprimeArray
		ImprimeArray(miArray);
		
		//Función media de los numeros en las posiciones pares del array
		
		media=MediaPosPares(miArray, dim);
		
		
		System.out.println();
		System.out.println("La media de los números n las posiciones pares es :"+media);	
		
			
	}

	//Introduccion de la dimension del array
	
	public static int IntroDimensionArray(String entrada){
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		
		int dimension=1;
		
		do{
			System.out.println("Introduzca la dimensión del array :");
			entrada=teclado.next();
			error=false;
			try{
				
				dimension=Integer.parseInt(entrada);
							
			}catch(Exception e){
				System.out.println("Error! No ha introducido un número !");
				error=true;
			}
			if(dimension<1 && !error){
				System.out.println("La dimension del array no puede ser infrior a uno !");
				error=true;
			}
					
		}while(error);
		
		return dimension;
	}
	
	
	//Validación de la introducción de datos para rellenar el array
	
	public static int[] IntroValoresIntArray(int dim){
	
		boolean error=false;
		int[]miArray=new int[dim];
		String resultado="";
		Scanner teclado=new Scanner (System.in);
	 
	do{
		for(int i=0;i<miArray.length;i++){
			
			System.out.println("Introduzca un numero entero en el array : ");
			resultado=teclado.next();											//OJO: Tiene que ser next() en vez de nextLine()
			error=false;
			try{
				miArray[i]=Integer.parseInt(resultado);
				
			}catch(Exception e){
				System.out.println("ERROR ! No ha introducido un numero entero !");
				error=true;break;													//A ver como se puede evitar el break, pero va bien!
			}		
			
		}		
		
	}while(error);
	
	return miArray;
	
	}
	//Función para imprimir un array
	
	public static void ImprimeArray(int[]array){
		for (int i : array) {
			System.out.print(" "+i+" ");
		}
	}
	
	//Sacar la media de los numeros en las posiciones pares introducidos en el array
	
	public static float MediaPosPares(int[]array, int dim){
		
		float media=0f;
		int acumulador=0;
		int pos=0;
		
			
		for(int i=0;i<array.length;i++){
			pos=i%2;
			if(i==0 || pos==0){
				
				acumulador+=array[i];
				media=(float)acumulador/(float)dim;
			}		
		}
		return media;	
		
	
	
	
	}
	
	

}
