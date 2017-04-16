import java.util.*;
public class Ejercicio2Examen {

	public static void main(String[] args) {				//No me convence::si hay saltos mayores q 1 el if de la z y la a no resuelve 
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		char[]cadena= new char[4];
		char[]encript=new char[4];
		char[]desencript=new char[4];
		int numCadena;
		int elect=0;
		int pos=0;
		
		
		System.out.println("Introduzca el texto que quiere encriptar/desencriptar: ");
		
		for(int i=0;i<cadena.length;i++){
			
			cadena[i]=teclado.next().charAt(0);
		}
		
		System.out.println("El texto introducido es:\n");
		for (char c : cadena) {
			System.out.print(c+" ");
		}
		
		System.out.println("Introduzca 1 para encriptar y 2 para desencriptar: ");
		elect=teclado.nextInt();
		
		System.out.println("Introduzca el número de saltos de encript/desencript que quiere implementar: ");
		pos= teclado.nextInt();
		
		//PROCESO
		if(elect==1){
		for(int i=0;i<cadena.length;i++){
			if(cadena[i]=='z'){
				encript[i]='a';
				
			}
			else{
				if(cadena[i]=='Z'){
					encript[i]='A';
				}
				else{
					
					numCadena=(int)cadena[i];
					numCadena=numCadena+pos;
					
					
					encript[i]=(char)numCadena;
					
					
					
			}
			
				
			}
			
		}
		System.out.println("La encriptación resultante es: \n");
		for (char c : encript) {
			System.out.print(c+" ");
		}
		
		}
		
		if(elect==2){
			for(int i=0;i<cadena.length;i++){
				if(cadena[i]=='a'){
					desencript[i]='z';
					
				}
				else{
					if(cadena[i]=='A'){
						desencript[i]='Z';
					}
					else{
						
						numCadena=(int)cadena[i];
						numCadena=numCadena-pos;
						
						desencript[i]=(char)numCadena;					
											
				}
								
			}
				
			}
			System.out.println("La desencriptación resultante es: \n");
			for (char c : desencript) {
				System.out.print(c+" ");
			}
		}
		if(elect!=1 && elect!=2){
			System.out.println("Tiene que validar con 1 o 2 !");
		}
		
		
		
		
		
		
		
			}
											
	
			
}
