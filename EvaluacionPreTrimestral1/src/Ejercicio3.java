import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// Realizar un programa que sume los d�gitos de un n�mero.
		
		int[] numero = new int[5];
		int suma=0;
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Introduzca los 5 d�gitos del n�mero entero:");
		for(int i=0; i<numero.length;i++){
			numero[i]=teclado.nextInt();
			
			
		}
		for(int i=0;i<numero.length; i++){
			suma=suma+numero[i];
			
		}
		System.out.println("La suma de los �ndices del array es: "+suma);

	}

}
