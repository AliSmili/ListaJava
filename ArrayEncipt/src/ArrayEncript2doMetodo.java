import java.util.Scanner;
import java.util.Arrays;
public class ArrayEncript2doMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);					//PENDIENTE!! Quiero asignar a cada char un numero, y al incrementarlo, char coge la letra siguiente
		
		int[] convert= new int[26];
		char[] aCaracteres = new char[26];
		char[] encript = new char[26];
		int puntero;
		
		System.out.println("Introduzca una cadena de carácteres");
		String cadena=teclado.next();
		aCaracteres=cadena.toCharArray();
		
		for(int i=0; i<cadena.length(); i++){
		convert[i]=(int) cadena.charAt(i);
		
		}
		
		for(int i=0;i<cadena.length();i++){
			encript[i]=(char)convert[i];
		}
		
		for(int i=0;i<cadena.length();i++){
			puntero=convert[i];
			puntero++;
			convert[i]=puntero;
			 	
		}
		String encripta=Arrays.toString(convert);				//?????
		;
		System.out.print("El encriptado resultante es: "+encripta);
		
		}
	}


