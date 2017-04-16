import java.util.Scanner;
public class ordenarNumArray {

	public static void main(String[] args) {
		// Ordenar de menor a mayor indices de un vector de dimensión 3
		
		Scanner teclado= new Scanner(System.in);
		int vector[]=new int[3];
		int ordvector[]=new int[3];
		
		
		for(int i=0;i<vector.length;i++){
			System.out.println("Introduzca los valores del array: ");
			vector[i]=teclado.nextInt();
		}
			for(int i=0;i<vector.length;i++){
			System.out.print(""+vector[i]+"");
			System.out.println("");
		}
		
		
		
		 if(vector[0]<vector[1] && vector[0]<vector[2]){
			ordvector[0]=vector[0];
			if(vector[1]<=vector[2]){
				ordvector[1]=vector[1];
				ordvector[2]=vector[2];						
			}									
			else{
				if(vector[1]>vector[2]){
					
				
				ordvector[1]=vector[2];
				ordvector[2]=vector[1];
				
				}
			}
		 System.out.println("El nuevo vector queda así: ");
		 for(int j=0;j<ordvector.length;j++){
		 	
				System.out.println(ordvector[j]+"");
		 }		
			}	
		
		
		 if(vector[1]<vector[0] && vector[1]<vector[2]){
			ordvector[0]=vector[1];
			if(vector[0]<=vector[2]){
				ordvector[1]=vector[0];
				ordvector[2]=vector[2];
				
				}
				
			else{
				if(vector[0]>vector[2]){
				ordvector[1]=vector[2];
				ordvector[2]=vector[0];
				}
		 }
		 System.out.println("El nuevo vector queda así: ");
		 for(int j=0;j<ordvector.length;j++){
			 
				System.out.println(ordvector[j]+"");
		}
		 }	
				
			
		if(vector[2]<vector[0] && vector[2]<vector[1]){
			ordvector[0]=vector[2];
			if(vector[0]<=vector[1]){
				ordvector[1]=vector[0];
				ordvector[2]=vector[1];
			}
				else{
					if(vector[0]>vector[1]){
				
					ordvector[1]=vector[1];
					ordvector[2]=vector[0];
				}
				}	
		
		
		System.out.println("El nuevo vector queda así: ");
		for(int j=0;j<ordvector.length;j++){
			
			System.out.println(ordvector[j]+"");
			}
		
		}
	
		 
	}
	}

		
		
		
		
		

	


