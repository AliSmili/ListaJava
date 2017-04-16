import java.util.Scanner;

public class ejercicio9Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[]=new int[5];
		int suma=0;
		float media=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca los elementos del array");
		for(int i=0;i<enteros.length;i++){
			enteros[i]=teclado.nextInt();
		}
		
		for(int i=0;i<enteros.length;i++){
			suma+=enteros[i];
		}
		media=suma/5;
		
		System.out.println("El valor medio de los elementos del array de enteros es "+media);

	}

}
