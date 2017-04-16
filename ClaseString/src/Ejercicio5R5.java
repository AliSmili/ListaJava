
public class Ejercicio5R5 {

	public static void main(String[] args) {
		/*Escribe  la  función  “RepiteCaracter”  a  la  que  le  pasamos  dos 
	parámetros: un carácter y un entero. La función nos devolverá una 
	cadena  que  contendrá  el  carácter  repetido  tantas  veces como 
	indique el entero. Ej.: RepiteCaracter(‘A’, 5) = “AAAAA”. */
		
		char caracter='a';
		int numero=5;
		String resultado="";
		
		resultado=RepiteCaracter(caracter, numero);
		System.out.println("La cadena resultante es "+resultado);
		
		

	}
	public static String RepiteCaracter(char car, int num){
		
		String frase="";
		for(int i=0;i<num;i++){
			frase=frase+car;
		}
		return frase;
	}

}
