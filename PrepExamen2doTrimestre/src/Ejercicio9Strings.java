import java.util.Scanner;

public class Ejercicio9Strings {

	public static void main(String[] args) {
		/*
		 * Escribe la función “VecesPalabra” a la que le pasamos una cadena y
		 * una palabra (otra cadena) y nos dice cuántas veces se repite ese
		 * palabra en la cadena.
		 */

		String miFrase = "Hola mundo Cruel, el mundo es un quilombo";
		String cadena = "mundo";
		int numVeces = 0;

		numVeces = VecesPalabra(miFrase, cadena);

		System.out.println("Ls veces que se repite la subcadena dentro de la cadena es " + numVeces);

	}

	public static int VecesPalabra(String cadena, String subCadena) {		 // Si no es -1, es que lo ha encontrado
																		
																	
		int indice = 0;
		int contador = 0;

		while (indice != -1) {
			indice = cadena.indexOf(subCadena, indice);

			if (indice != -1) {

				contador++;
				indice += subCadena.length();
			}
		}
		return contador;

	}

}
