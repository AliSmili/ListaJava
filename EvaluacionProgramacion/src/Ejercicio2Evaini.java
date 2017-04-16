import java.util.Scanner;
public class Ejercicio2Evaini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		int[]enteros=new int[5];				//Creación de un array de 5 numeros enteros
		int suma=0;
		
		
		System.out.println("Introduzca los números enteros que componen el array: ");
		
		for(int i=0;i<enteros.length;i++){
			enteros[i]=teclado.nextInt();
			
		}
		
		System.out.println("El array introducido es :");
		for (int i : enteros) {
			System.out.print(i );
		}
		System.out.println("");
		
		for(int i=0;i<enteros.length;i++) {
			suma=suma+enteros[i];
		}
		
		System.out.println("La suma de los elementos del array es :" +suma);
		

	}

}
