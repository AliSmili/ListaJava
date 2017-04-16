package vector;
import java.util.Scanner;
public class arrayBinarioDecimal {

	public static void main(String[] args) {
		// INTRODUCIR UN ARRAY DE BITS Y CONVERTIRLO A DECIMAL
		
		byte binario[]=new byte[4];
		double decimal=0,aux;
		final byte AUX=2;
		                                                                   //hecho por mi :)
		Scanner teclado=new Scanner(System.in);
		
		for(int i=0; i<binario.length;i++){
			System.out.println("Introduzca un bit: ");
			binario[i]=teclado.nextByte();
			
		}
		
		for(int i=0;i<binario.length;i++){
			for(int j=0;j<binario.length;j++){
				 aux=Math.pow(AUX, j)*binario[i];
				 i++;
				 decimal=decimal+aux;
				
			}
		}
		System.out.print("El decimal resultante es el: "+ decimal);

	}

}
