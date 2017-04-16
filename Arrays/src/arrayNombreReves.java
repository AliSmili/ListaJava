import java.util.Scanner;
public class arrayNombreReves {

	public static void main(String[] args) {
		//CORREGIDO
		// Dado un nombre introducido por teclado, sacar este nombre al revés
		
		// char c=teclado.nextLine().toCharArray()[0];
		// cadenaSplit[0].....devuelve el primer carácter
		//foreach hace que se imprimen los caracteres uno a uno :)
		
		
		
		Scanner teclado = new Scanner(System.in);
		char palabra[] = new char[4];
		char palabraInv[] = new char[4];
		
		
		for (int i = 0; i < palabra.length; i++) {
		System.out.println("Introduce caracter");
		char c = teclado.next().charAt(0);
		palabra[i] = c;
		}
		int j = 0;
		for (int i = palabra.length - 1; i >= 0; i--) {
		palabraInv[j++] = palabra[i];
		}
		System.out.println("Palabra invertida");
		for (char c : palabraInv) {
		System.out.print(c+" ");
		}
		
		
		

	}

}