import java.util.Scanner;

public class ArrayNumerosGrande {

	public static void main(String[] args) {
		/* Dise�ar una aplicaci�n que declare una tabla de X elementos enteros.
		Leer mediante el teclado 8 n�meros. Despu�s se debe pedir un n�mero y una posici�n,
		insertarlo en la posici�n indicada, desplazando los que est�n detr�s.*/

		Scanner teclado=new Scanner(System.in);                     // EJERCICIO COMPLEMENTARIO del ejAlfabeto2
		final int MAX_RANGO=10;
		int numero[]=new int[MAX_RANGO];  
		
		
		System.out.println("Introduce cu�ntos n�meros quiere insertar:");
		int rango=teclado.nextInt();
		
		for(int i=numero.length-1;i>=rango;i--){
			
			numero[i]=' ';                                //DECLARAR ESPACIOS EN BLANCO
			}
		
		
		for(int i=0;i<rango;i++){		
		System.out.println("Introduce un n�mero: ");
		 numero[i]= teclado.nextInt();
		}
		
		for(int i=0; i<numero.length-1; i++){
			System.out.print(numero[i]+" ");
		}
		System.out.println("Introduce el n�mero que quiere insertar: ");
		int num=teclado.nextInt();
		
		System.out.println("Introduce una posici�n: ");
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
