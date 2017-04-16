import java.util.Scanner;
public class ArrayEncriptacion {

	public static void main(String[] args) {
		// Uno de los primeros algoritmos de encriptación consiste en cambiar cada letra del mensaje (que denominaremos texto claro) con la letra contigua. Por ejemplo, el texto claro "Hola" se codificaría como "Gpmb".
		//Realiza un programa Java que encripte un texto claro introducido por el usuario y muestre el mensaje codificado.
	char posicion;
	char[] encriptado = new char[26];		
	char[] aCaracteres=new char[26];
	char[] alfabeto={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner teclado=new Scanner(System.in);

	
	 
	 
	 System.out.println("Introduzca un texto corto: ");
	 String str=teclado.next();
	  aCaracteres=str.toCharArray();
	 
	 System.out.println(aCaracteres);
	 //Se ha realizado la conversion a un array de caracteres
	 
	 for(int i=0;i<aCaracteres.length;i++){
	  for(int j=0;j<alfabeto.length; j++){
		 	 
			 if (aCaracteres[i]==alfabeto[j]){
				 posicion=alfabeto[j+1];
				 encriptado[i]=posicion;
			 }
		 
	  }	 
			 
		 
	 }
	 System.out.print("La cadena de texto resultante es: ");
	 for(int i=0;i<encriptado.length;i++){
	 System.out.print(" "+encriptado[i]+" ");
	 }
	 
		 
	 }
	 
}	
		
	


