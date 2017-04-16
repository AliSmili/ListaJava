import java.util.Scanner;

public class orenacionArraytresNumeros {

	public static void main(String[] args) {
		// Ordenar de menor a mayor indices de un vector de dimensión 3 de la
		// manera correcta//

		Scanner teclado = new Scanner(System.in);
		int vector[] = new int[3];
		int aux;

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca los valores del array: ");
			vector[i] = teclado.nextInt();
		}
		System.out.println("El Vector introducido es: ");

		for (int m = 0; m < vector.length; m++) {
			System.out.print("");
			System.out.print(" " + vector[m] + " ");
			System.out.println("");
		}

		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[i] > vector[j]) {
					aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
		System.out.println("El nuevo vector ordenado es: ");

		for (int m = 0; m < vector.length; m++) {   //foreach
			System.out.print("");
			System.out.print(" ");
			System.out.print(" " + vector[m] + " ");  //  for(int i : vector){
  
		}                                             //   System.out.print(i+" ");

	}                                                 //   }

}
  