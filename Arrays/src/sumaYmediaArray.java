import java.util.Scanner;
public class sumaYmediaArray {

	public static void main(String[] args) {
		// Suma y media de elementos de un array
		
		float vector[]= new float[5];
		float suma=0;
		float media=0;
		
		Scanner teclado=new Scanner(System.in);
		
		for(int i=0;i<vector.length;i++){
			System.out.println("Introduzca los valores del array: ");
			vector[i]=teclado.nextFloat();      //Se puede usar nextInt ya que java convierte spre
		}                                       //de un conjunto menor como INT a un conj mayor como FLOAT   
		                                        // CASTING*  (INVEST TIPO DE CASTING(auto o forzado)
			
			
		
		for (int i=0;i<vector.length;i++ ) {     //Investigar foreach + ctrl+spacebar
			suma+=vector[i];
			
		}			
		
		 	
		 media=(suma/vector.length);
			System.out.println("La suma de los números es: "+suma);
			System.out.println("La media de la suma de los numeros es: "+media);
		
		}
	}
	


