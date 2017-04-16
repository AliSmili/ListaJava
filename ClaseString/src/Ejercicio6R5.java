
public class Ejercicio6R5 {

	public static void main(String[] args) {
		/* Escribe  la  función  “CuentaPalabras”  a  la  que  le  pasamos  una 
		cadena  que  contiene  una  frase  y  nos  devuelve  el  número  de 
		palabras que hay en la misma.*/
		
		String frase="Hola mundo cruel que me jode bien";
		int numPalabras=0;
		
		numPalabras=CuentaPalabras(frase);
		
		System.out.println("El numero de palabras contenidas en esta frase es: "+numPalabras);
		
		
		

	}
	public static int CuentaPalabras(String cadena){
		
		String subCadena=" ";
		cadena=cadena.trim();
		int indice = 0;
		int contador = 0;

		while (indice != -1) {
			indice = cadena.indexOf(subCadena, indice);

			if (indice != -1) {

				contador++;
				indice += subCadena.length();
			}
		}
		return contador+1;
		
		
		
		
	}

}
