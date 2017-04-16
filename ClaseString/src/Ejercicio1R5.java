
public class Ejercicio1R5 {

	public static void main(String[] args) {
		/* Escribe	 la	 función	 “NúmeroEspacios”	 a	 la	 que	 le	 pasamos	 una	
		cadena	 y	 nos	 devuelve	 el	 número	 de	 espacios	 que	 contiene	 esa	
		cadena	(tanto	al	principio	y	al	final	como	intercalados).*/
		
		String cadena="Los amores son perros pero me gusta la vida !";
		String subCadena=" ";	
		int numVeces = 0;

		numVeces = NémeroEspacios(cadena, subCadena);

		System.out.println("Ls veces que se repite la subcadena dentro de la cadena es " + numVeces);

	}

	public static int NémeroEspacios(String cadena, String subCadena) {		 // Si no es -1, es que lo ha encontrado
																		
																	
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
