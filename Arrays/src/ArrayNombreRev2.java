import java.util.Scanner;
public class ArrayNombreRev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub        //Está corregido y subido a edmodo
		final int MAX_PALABRA=5;
		char palabra[] = new char[MAX_PALABRA];
		
		char aux;
		Scanner teclado=new Scanner(System.in);   //CAPTAR CARACTERES POR TECLADO
		
		for(int i=0;i<palabra.length-1;i++){
			System.out.println("Introduzca un caracter: ");
			char c=teclado.next().charAt(0);
			palabra[i]=c;
		}
		
		
		for(int i=0; i<(palabra.length);i++){
			
			aux=palabra[i];
			palabra[i]=palabra[palabra.length-1-i];
			palabra[palabra.length-1-i]=aux;
			
		}
		for(int i=0;i<palabra.length;i++){
		System.out.println("el vector invertido es:"+ palabra[i]);
	}
	}

}
