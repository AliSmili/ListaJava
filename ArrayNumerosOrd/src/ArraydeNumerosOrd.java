import java.util.Scanner;
public class ArraydeNumerosOrd {

	public static void main(String[] args) {
		// Introducir un array de numeros y ordenarlos de menor a mayor
		
		
         int vector[]=new int[5];
         int aux;
         Scanner teclado=new Scanner(System.in);
         
         for(int i=0;i<vector.length;i++){
        	 System.out.println("Introduzca los valores del array: ");
        	 vector[i]=teclado.nextInt();  	 
        	 				
         }
         for(int i=0;i<(vector.length-1);i++){
            for(int j=1+i;j<vector.length;j++ ){
            	if(vector[i]>=vector[j]){
            		aux=vector[i];
            		vector[i]=vector[j];
            		vector[j]=aux;
            		
            		
            	}
            }
        	 
         }
         System.out.println("El vector ordenado es : ");
         
         for(int i=0; i<=vector.length-1;i++){
        	 System.out.println(vector[i]);
        	 
         }
         
         
         
         
	}

}
