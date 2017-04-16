
import java.util.*;

public class Ejercicio5UnidimR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaraci�n de variables
		
		int enteros[];
		int MinArray=0;
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
		
		enteros = new int[tam];
		
		
		
		do{
			
			for(int i=0;i<enteros.length;i++){
				System.out.println("Introduzca un elemento del array de enteros: ");
				
				resultado=teclado.next();
				error=false;							//Hay que volver a inicializar esta variable para que se resetee el bucle for
				try{
					enteros[i]=Integer.parseInt(resultado);
				}catch(Exception e){
					error=true;
					System.out.println("No has introducido un n�mero!");
					break;
				}
				
			}				
			
			
		}while(error);
		
		//PROCESO
		
		 Arrays.sort(enteros);
		 
		 MinArray=enteros[0];
		 
		 System.out.println("El elemento m�s peque�o del array es: "+MinArray);
		
		
		

	}

}
