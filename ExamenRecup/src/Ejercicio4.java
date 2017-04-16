import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int cont = 0; 							//un contador, el cual si es mayor a dos indica que el numero no es primo
	        for (int i = 2; i < 101; i++){  	
	        	for (int j = 1; j <= i; j++){   		
	 
	               if (i % j == 0){ 
	                  cont = cont + 1;
	               }
	            }
	    
	    
	            if (cont <= 2){ 				//si variable cont es mayor a dos, el numero es divisible en mas de dos numero es decir, no es primo
	               System.out.println(i+" ");;
	            }      
	            cont = 0;               		
	    
	    
	         }

	}

}
