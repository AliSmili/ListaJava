import java.util.Scanner;
public class DetNumPrimos {

	public static void main(String[] args) {
		//REALIZAR UN PROGRAMA QUE NOS PIDA UN NUMERO n ,Y NOS PIDA DIGA CTOS NUMEROS PRIMOS HAY ENTRE 1 Y n
		
		int numero,det=0,numPrimos=0;
		int aux, i, j;
		
		boolean Esprimo=false;
		

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		  numero=teclado.nextInt();
		//esta mal
		  if( numero<1){
			  System.out.println("Numero introducido inferior a uno.Vuelva a introducir numero");
		  }
		  else{
			  for( j=numero;j>=1;j--){
			    for( i=1; i<=numero ;i++){
				  aux=numero%i;
				  
				  
				  if (aux==0){
					  det++;
					  }
			    
					if (det++==2){
						numPrimos++;
					}
				  
			    }  
					  
				  }	  
				    
			    }
			  
			  
		  System.out.println("El número de numeros primos en este rango siempre que sea mayor que 2 es: "+numPrimos );    
			   
		   }
	}



	
	


