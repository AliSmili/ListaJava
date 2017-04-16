import java.util.Scanner;
public class ejercicio6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número indicando la dimensión del array");
		N =teclado.nextInt();

		int enteros[]=new int[N];
		
		for(int i=0;i<enteros.length;i++){
			enteros[i]=0;
		}
		for (int i : enteros) {
			System.out.print(i+" ");
		}

	}

}
