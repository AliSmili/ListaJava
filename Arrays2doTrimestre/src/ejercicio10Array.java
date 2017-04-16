import java.util.Scanner;

public class ejercicio10Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma=0;
		float media=0;
		int N;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca la dimensión del array de enteros");
		N=teclado.nextInt();
		int enteros[]=new int[N];
		
		System.out.println("Introduzca los elementos del array");
		for(int i=0;i<enteros.length;i++){
			enteros[i]=teclado.nextInt();
		}
		
		for(int i=0;i<enteros.length;i++){
			suma+=enteros[i];
		}
		media=suma/enteros.length;
		
		System.out.println("El valor medio de los elementos del array de enteros es "+media);

	}

}
