
public class Ejercicio5R5 {

	public static void main(String[] args) {
		/*Escribe  la  funci�n  �RepiteCaracter�  a  la  que  le  pasamos  dos 
	par�metros: un car�cter y un entero. La funci�n nos devolver� una 
	cadena  que  contendr�  el  car�cter  repetido  tantas  veces como 
	indique el entero. Ej.: RepiteCaracter(�A�, 5) = �AAAAA�. */
		
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
