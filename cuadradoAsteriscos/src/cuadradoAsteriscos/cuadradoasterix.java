package cuadradoAsteriscos;
import java.util.Scanner;
public class cuadradoasterix {

	public static void main(String[] args) {
		// Dibuja un cuadrado de n elementos de lado utilizando //
		
		String paint="*";
		int Numasterix=1;
		int i,j;
		int fila;
		
		
		Scanner teclado=new Scanner(System.in);

		System.out.println("Introduzca el número de asteriscos que quieras dibujar: ");
		  Numasterix=teclado.nextInt();
		  
		for(fila=1;fila<=Numasterix;fila++){
			
		     for(i=1;i<=Numasterix;i++){
			  System.out.print(paint);   
			  }
		     System.out.print("\n");
			
		}
		
	}
}

