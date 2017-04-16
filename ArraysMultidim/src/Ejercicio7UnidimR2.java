import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7UnidimR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaraci�n de variables
		
		int notas[];
		int NumAprob=0;
		int tam=1;
		boolean error=false;
		String resultado="";
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		//ENTRADA
		
		
		
		do{
			System.out.println("Introduzca el tama�o del array de enteros: ");
			resultado = teclado.next();
			error=false;
			try{
				tam = Integer.parseInt(resultado);
				
			}catch(Exception e){
				error=true;
				System.out.println("ERROR ! No has introducido un n�mero");
			}
			if(tam<=0 && error==false){
				error=true;
				System.out.println("El tama�o del array no puede ser inferior o igual a zero !");
				 
			}
			
		}
		while(error);
		
		notas = new int[tam];
		
		
		
		do{
			
			for(int i=0;i<notas.length;i++){
				System.out.println("Introduzca un elemento del array de enteros: ");
				
				resultado=teclado.next();
				error=false;							//Hay que volver a inicializar esta variable para que se resetee el bucle for
				try{
					notas[i]=Integer.parseInt(resultado);
				}catch(Exception e){
					error=true;
					System.out.println("No has introducido un n�mero!");
					break;
				}
				if(notas[i]<0 && error==false){
					error=true;
					System.out.println("La nota no puede ser un n�mero negativo !");break;
				}
				
			}				
			
			
		}while(error);
		
		//PROCESO
		
		 Arrays.sort(notas);
		 
		 for(int i=0;i<notas.length;i++){
			 if(notas[i]>=5){
				 NumAprob++;
			 }
		 }
		 if(NumAprob==0){
			 System.out.println("No hay ning�n aprobado !");
		 }else{
			 System.out.println("El n�mero de aprobados es "+NumAprob);
		 }
		 
		 

	}

}
