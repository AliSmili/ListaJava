import java.util.Scanner;

public class ejercicio10ArrayValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		float media = 0;
		int N = 0;
		boolean error = false;
		String resultado = "";

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca la dimensión del array de enteros");
			resultado = teclado.nextLine();
			try {
				N = Integer.parseInt(resultado);
				error = false;
			} catch (Exception e) {
				error = true;
				System.out.println("Error generico, revisa la excepcion");
			}
			
			if (error == false && N <= 0) {
				error = true;
				System.out.println("La dimensión del array no puede ser igual o menor que cero !");
			}

		} while (error);

		int enteros[] = new int[N];

		do {
			System.out.println("Introduzca los elementos del array de enteros:");

			for (int i = 0; i < enteros.length; i++) {

				try {
					resultado = teclado.next();
					enteros[i] = Integer.parseInt(resultado);
				} catch (Exception e) {
					error = true;
					System.out.println("Error generico, revisa la excepcion");
				}

			}

		} while (error);

		for (int i = 0; i < enteros.length; i++) {
			suma += enteros[i];
		}
		media = suma / enteros.length;

		System.out.println("El valor medio de los elementos del array de enteros es " + media);

	}

}
