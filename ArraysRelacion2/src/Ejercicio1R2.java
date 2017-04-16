import java.util.Scanner;

public class Ejercicio1R2 {

	public static void main(String[] args) {
		//Ejercicio 1 de la relacion 2 con validaciones y entrada de datos por teclado
		
				int miArray[];
				int dim=1;
				boolean error=true;
				String resultado="";
				int min;
				int aux;
				Scanner teclado=new Scanner(System.in);
				
				//Validación del dato de la dimensión del array
				
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
				
				error=false;
				
				//Validacion de la introduccion de datos para rellenar el array
				
				 miArray=new int[dim];
				
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
				
				//Odenar el array:
				
				OrdenarArray(miArray);
				
				/*Arrays.sort(miArray);							//Seria la forma mas facil , pero el ejercicio pide la funcion que lo implemente
				
				System.out.println("El array ordenado es:");
				
				for (int i : miArray) {
					System.out.print(" "+i+" ");
				}*/
				
				/*
				for(int i=0;i<miArray.length-1;i++){
					for(int j=1+i;j<miArray.length;j++){
						
						if(miArray[i]>=miArray[j]){		
							aux=miArray[i];
							miArray[i]=miArray[j];
							miArray[j]=aux;
					
						
						}
					}
				}
				*/
				System.out.println("El array ordenado es:");
				
				for (int i : miArray) {
					System.out.print(" "+i+" ");
				}
				
				
				

			}
			public static int[] OrdenarArray(int[] Array){
				int aux;
				for(int i=0;i<Array.length-1;i++){
					for(int j=1+i;j<Array.length;j++){
						
						if(Array[i]>=Array[j]){		
							aux=Array[i];
							Array[i]=Array[j];
							Array[j]=aux;
					
						
						}
					}
				}
			return(Array);

	}

}
