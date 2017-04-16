
public class Ejercicio8R5 {

	public static void main(String[] args) {
		/*		
		 * Escribe la función “VecesCaracter” a la que le pasamos una cadena y
		 * un caacter y nos dice cuántas veces se repite ese
		 * caracter en la cadena.
		 */

		String miFrase = "Hola mundo Cruel, el mundo es un quilombo";
		char caracter='u' ;
		int numVeces = 0;

		numVeces = VecesCaracter(miFrase, caracter);

		System.out.println("Ls veces que se repite la subcadena dentro de la cadena es " + numVeces);

	}

	public static int VecesCaracter(String cadena, char car) {		 // Si no es -1, es que lo ha encontrado
																		
																	
		int indice = 0;
		int contador = 0;
		cadena=cadena.toUpperCase();
		car = Character.toUpperCase(car);

		while (indice != -1) {
			indice = cadena.indexOf(car, indice);

			if (indice != -1) {

				contador++;
				indice += 1;
			}
		}
		return contador;

	}

	

}
