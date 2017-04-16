import java.util.Scanner;
public class ArraySignoPuntuacion {

	public static void main(String[] args) {
		// Introducir una serie de caracteres y decidnos cuantos signos de puntuación tiene:
		// Ejemplo: Hola Mundo; es domingo!  tiene 2 signos de puntuación ; y !
		
		char caracteres[]=new char[10];
		Scanner teclado=new Scanner(System.in);
		int contador=0;
		
		for(int i=0;i<caracteres.length; i++){
			System.out.println("Introduce un caracter para completar el array :");
			caracteres[i]=teclado.next().charAt(0);
			
		}
		for (char c : caracteres) {
			System.out.print(c+" ");    
		}

	}

}
