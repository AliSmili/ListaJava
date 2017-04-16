import java.util.Scanner;
public class Ejercicio5ArraysUnidim2 {

	public static void main(String[] args) {
		// Ejercicio 3 de la relación 2 de arrays
		
		
		
		
		
		int miArray[]={3,4,5,6,7};
		int arrayCeros[];
		
			arrayCeros=PonCeros(miArray);
			for (int i : arrayCeros) {
				System.out.print(i);
			}
		
	}
		public static int[] PonCeros(int array[]){
			
			for(int i=0;i<array.length;i++){
				array[i]=0;
							
				
			}
			return(array);
				
		
		
		
		}
		
		
		
		

	

}
