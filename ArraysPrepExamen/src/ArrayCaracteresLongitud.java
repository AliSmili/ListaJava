import java.util.Scanner;
public class ArrayCaracteresLongitud {

	public static void main(String[] args) {
		// realiza un programa java que dado un array de caracteres nos imprima la longitud del mismo,
		//nos pida un caracter, y nos muestre el numero de ocurrencias de dicho caracter y 
		//usando el mismo caracter no trocee el array mostrandonos cada uno de los trozos de las subcadenas que van 
		//desde el principio de la aarraya hasta el final de la letra introducido.
			
		char[] cadenaChar=new char[10];						//HECHO POR MI Y FUNCIONA :) //pero no me coge espacio !!
		int contador=0;
		int contador2=0;
		char caracter=' ';
		char[] cadenaInf=new char[10];
		char[] cadenaSup=new char[10];
		
		
		
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<cadenaChar.length;i++){
			System.out.println("Intoduzca un caracter ");
			cadenaChar[i] = teclado.next().charAt(0);
			contador++;
		}
		
		System.out.println("La longitud del array introducido es :"+contador);
		
		System.out.println("Introduzca un caracter para evaluar: ");
		caracter=teclado.next().charAt(0);
		
		for(int i=0;i<cadenaChar.length;i++){
			
			if(cadenaChar[i]==caracter){
				contador2++;   
				System.out.println("El numero de iteraciones del caracter es: "+contador2);
				
				System.out.println("El array de caracteres superior es :");
				for(int j=i+1;j<cadenaChar.length;j++){
					cadenaSup[j]=cadenaChar[j];
					System.out.print("\n"+cadenaSup[j]+" ");
					
				}
				System.out.println("El array de caracteres inferior es :");
				for(int j=0;j<i;j++){
					cadenaInf[j]=cadenaChar[j];
					System.out.print("\n"+cadenaInf[j]+" ");
				}
				
			}
			
		}
		
		
		
		
		
		
		

	}

}
