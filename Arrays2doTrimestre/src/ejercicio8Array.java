import java.util.Scanner;

public class ejercicio8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int suma=0;

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número indicando la dimensión del array");
		N =teclado.nextInt();

		int enteros[]=new int[N];
		
		
		
		
		System.out.println("Introduzca los elementos del array");
		for(int i=0;i<enteros.length;i++){
			enteros[i]=teclado.nextInt();
		}
		
		for(int i=0;i<enteros.length;i++){
			suma+=enteros[i];
		}
		
		System.out.println("La suma de los valores del array de enteros es "+suma);

	}

}
