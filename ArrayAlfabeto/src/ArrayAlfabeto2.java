import java.util.Scanner;
public class ArrayAlfabeto2 {

	public static void main(String[] args) {
		/* Dise�ar una aplicaci�n que declare una tabla de 6 elementos enteros.
		Leer mediante el teclado 8 n�meros. Despu�s se debe pedir un n�mero y una posici�n,
		insertarlo en la posici�n indicada, desplazando los que est�n detr�s.*/

		Scanner teclado=new Scanner(System.in);                     //MUY IMPORTANTE EJERCICIO
		
		int numero[]=new int[9];                                 //9 para dejar un espacio en blanco
		
		
		for(int i=0;i<numero.length-1;i++){		
		System.out.println("Introduce un n�mero: ");
		 numero[i]= teclado.nextInt();
		}				
		numero[numero.length-1]=' ';                       //DECLARAR UN ESPACIO EN BLANCO
		
		for(int i=0; i<numero.length-1; i++){
			System.out.println(numero[i]);
		}
		System.out.println("Introduce el n�mero que quiere insertar: ");
		int num=teclado.nextInt();
		
		System.out.println("Introduce una posici�n: ");
		int pos =teclado.nextInt();
		
		for(int i=numero.length-1;i>pos;i--){
			numero[i]=numero[i-1];
			
		}
		numero[pos]=num;
		
		System.out.println("El vector resultante es :");
		for(int i=0; i<numero.length;i++){
			System.out.println(numero[i]);
		}
			
		
		
		
		
	}

}
