import java.util.*;
public class ejercicio7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[]=new int[5];
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		
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
