import java.util.Arrays;
import java.util.Scanner;
public class MediaPositivosNegativos {

	public static void main(String[] args) {
		/* Programa Java que lea por teclado 10 números enteros y los guarde en un array.
		A continuación calcula y muestra por separado la media de los valores positivos y la de los valores negativos.*/
		
		int dim=1;
		int[] miArray=new int[dim];
		String entrada="";
		float mediaPos=0f;
		float mediaNeg=0f;
		int[]newArray=new int[dim];
		
			
		//Función Intro dimensión Array
		dim=IntroDimensionArray(entrada);
		
		//Función rellenar un Array
		miArray=IntroValoresIntArray(dim);
		
		System.out.println("El array introducido es :");
		//Función ImprimeArray
		ImprimeArray(miArray);
		
		//Función media de los numeros positovos del array
		
		mediaNeg=MediaNegativos(miArray, dim);
		mediaPos=MediaPositivos(miArray, dim);
		
		System.out.println();
		System.out.println("La media de los números negativos es :"+mediaNeg);
		System.out.println("La media de los números positivos es :"+mediaPos);
		
		
		
		
		
		
		
		
			
		

	}//Introduccion de la dimension del array
	
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
	
	//Sacar la media de los numeros negativos introducidos en el array
	
	public static float MediaNegativos(int[]array, int dim){
		
		float media=0f;
		int acumulador=0;
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++){
			if(array[i]<=0){
				
				acumulador+=array[i];
				media=(float)acumulador/(float)dim;
			}		
			
		}
		
		return media;	
		
	}
	
	//Sacar la media de los numeros positivos introducidos en el array
	public static float MediaPositivos(int[]array, int dim){
		
		float media=0f;
		int acumulador=0;
		
		Arrays.sort(array);
			
		for(int i=0;i<array.length;i++){
			if(array[i]>=0){
				
				acumulador+=array[i];
				media=(float)acumulador/(float)dim;
			}		
		}
		return media;	
		
	
	
	
	}
	
	

}
