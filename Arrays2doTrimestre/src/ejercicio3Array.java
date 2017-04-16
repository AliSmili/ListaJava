import java.util.*;
public class ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[]=new int[5];
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca números enteros: ");
		
		for (int i=0;i<enteros.length;i++) {
			enteros[i]=teclado.nextInt();
		}
		
		System.out.println("El array introducido es el siguiente:");
		
		for (int i : enteros) {
			System.out.print(i+" ");
		}

	}

}
