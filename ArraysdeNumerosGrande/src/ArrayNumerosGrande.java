import java.util.Scanner;

public class ArrayNumerosGrande {

	public static void main(String[] args) {
		/* Diseñar una aplicación que declare una tabla de X elementos enteros.
		Leer mediante el teclado 8 números. Después se debe pedir un número y una posición,
		insertarlo en la posición indicada, desplazando los que estén detrás.*/

		Scanner teclado=new Scanner(System.in);                     // EJERCICIO COMPLEMENTARIO del ejAlfabeto2
		final int MAX_RANGO=10;
		int numero[]=new int[MAX_RANGO];  
		
		
		System.out.println("Introduce cuántos números quiere insertar:");
		int rango=teclado.nextInt();
		
		for(int i=numero.length-1;i>=rango;i--){
			
			numero[i]=' ';                                //DECLARAR ESPACIOS EN BLANCO
			}
		
		
		for(int i=0;i<rango;i++){		
		System.out.println("Introduce un número: ");
		 numero[i]= teclado.nextInt();
		}
		
		for(int i=0; i<numero.length-1; i++){
			System.out.print(numero[i]+" ");
		}
		System.out.println("Introduce el número que quiere insertar: ");
		int num=teclado.nextInt();
		
		System.out.println("Introduce una posición: ");
		int pos =teclado.nextInt();
		
		for(int i=numero.length-1;i>=pos;i--){
			numero[i]=numero[i-1];
			
		}
		numero[pos]=num;
		
		System.out.println("El vector resultante es :");
		for(int i=0; i<numero.length;i++){
			System.out.print(numero[i]+" ");
		}

	}

}
