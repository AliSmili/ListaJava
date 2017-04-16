import java.util.Scanner;
public class ArbolitoAsteriscos {

	public static void main(String[] args) {
		// Dibuja un rectangulo de b colunmnas y h filas utilizando *
		
		int altura, base;
		char asterisco='*';
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca altura del rectangulo (o ctas filas): ");
		altura= teclado.nextInt();
		
		System.out.println("Introduzca la base del rectangulo: (o ctas Columnas");
		base=teclado.nextInt();
		
		for(int i=0;i<altura;i++){
			for(int j=0;j<base;j++){
				System.out.print(asterisco);
				
			}
			System.out.println("\n");
			
		}
		
		
		
		
		

	}

}
