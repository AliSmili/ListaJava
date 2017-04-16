import java.util.Scanner;

public class ArrayAlfabeto {

	public static void main(String[] args) {
		// METER UN CARACTER DE ALFABETO EN SU ADECUADA POSICION EN UN ARRAY
		// Realiza un programa que introduzcamos una serie de caracteres en un
		// array. Después se ordena el array y se le pide ala usuario un nuevo
		// carácter que se insertara en el lugar adecuado.,

		final int MAX_PALABRA = 6;
		char palabra[] = new char[MAX_PALABRA];
		char aux1, aux2;
		char p  ;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < palabra.length; i++) {
			System.out.println("Introduzca un caracter: ");
			palabra[i] = teclado.next().charAt(0);
			
		}
		// ORDENAR ARRAY DE CARACTERES
		for (int i = 0; i < palabra.length-1 ; i++) {
			for (int j = i + 1; j < palabra.length; j++) {
				if (palabra[i] > palabra[j]) {
					aux1 = palabra[j];
					palabra[j] = palabra[i];
					palabra[i] = aux1;
				}

			}                                              //YA TENGO MI VECTOR ORDENADO :)

		}
		System.out.println("El vector de carácteres ordenado es: ");

		for (int i = 0; i < palabra.length; i++) {
			System.out.println(palabra[i]);
		}
		System.out.println("Introduzca el caracter que quiere introducir:");
		p = teclado.next().charAt(0); // quiero captar por teclado un carácter
		
		for(int i=0;i<palabra.length-1;i++){		
			if(palabra[i]>p){
				aux2=palabra[i];
				palabra[i]=p;
				palabra[i+1]=aux2;       //???
				
				
				
			}
		

	}
		System.out.println("El veector de carácteres resultante es : ");
		for(int i=0; i<palabra.length;i++){
			System.out.println(palabra[i]);
		}
	}
}
