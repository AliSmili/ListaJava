import java.util.Scanner;
public class ArrayAlfabeto2 {

	public static void main(String[] args) {
		/* Diseñar una aplicación que declare una tabla de 6 elementos enteros.
		Leer mediante el teclado 8 números. Después se debe pedir un número y una posición,
		insertarlo en la posición indicada, desplazando los que estén detrás.*/

		Scanner teclado=new Scanner(System.in);                     //MUY IMPORTANTE EJERCICIO
		
		int numero[]=new int[9];                                 //9 para dejar un espacio en blanco
		
		
		for(int i=0;i<numero.length-1;i++){		
		System.out.println("Introduce un número: ");
		 numero[i]= teclado.nextInt();
		}				
		numero[numero.length-1]=' ';                       //DECLARAR UN ESPACIO EN BLANCO
		
		for(int i=0; i<numero.length-1; i++){
			System.out.println(numero[i]);
		}
		System.out.println("Introduce el número que quiere insertar: ");
		int num=teclado.nextInt();
		
		System.out.println("Introduce una posición: ");
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
