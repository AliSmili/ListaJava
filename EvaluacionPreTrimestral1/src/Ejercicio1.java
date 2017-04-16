import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		/* Realizar un programa que convierta un numero binario a decimal.
		 * El numero debe estar guardado en un variable entera, por ejemplo, el 101 es 5 decimal.
		 * El programa mostrara un eror si el numero no es binario.ej: 100510.
		 * Repite el ejercicio con el numero guardado en un array
		 */

		Scanner teclado =new Scanner(System.in);
		byte[] binario=new byte[5];
		double decimal=0;
		boolean error=false;
		final int AUX=2;
		double indice;	
	
		System.out.println("Introduzca un numero binario: ");	
		for(int i=0;i<binario.length;i++){
			
			binario[i]=teclado.nextByte();
				
			
		}
		for(int i=0;i<binario.length;i++){
			if(binario[i]<0 || binario[i]>1){
				error=true;	
				
			}
			
			}
		
			if(error==true){
				System.out.println("El dato introducido no es binario");
			}
		
		
			else{
	
		
		for (byte b : binario) {
			
			
			System.out.print(b+" \n");
		}
		
		  for(int i=0;i<binario.length;i++){
			indice=Math.pow(AUX, i)*binario[i];
			decimal=decimal+indice;
		 
		}
		System.out.println("El numero convertido a decimal es: "+decimal);
		}
		}
	}


