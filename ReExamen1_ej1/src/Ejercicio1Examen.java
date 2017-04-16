import java.util.*;
public class Ejercicio1Examen {

	public static void main(String[] args) {
		// No me coje espacios
		//error al poner subcadenas que se repiten
		
		Scanner teclado=new Scanner(System.in);
		char[] cadena=new char[10];
		char[] subcadena =new char[2];
		int pos=0;
		int contador=0;				//contador de subcadenas
		boolean existe=false;
		
		
		System.out.println("Introduzca la cadena de caracteres que quiere evaluar: ");
		for( int i=0;i<cadena.length;i++){
			
			cadena[i]=teclado.next().charAt(0);
				
		}
		System.out.println("La cadena Introducida es :");
		for (char c : cadena) {
			System.out.print(c+" ");
			
		}
		
		System.out.println("Introduzca la subcadena que quiere evaluar: ");
		
		for(int i=0;i<subcadena.length;i++){
			subcadena[i]=teclado.next().charAt(0);
			
		}
		System.out.println("La subcadena a evaluar es :");
		for (char c : subcadena) {
			System.out.print(c+" ");
		}
		
		//PROCESO
		
		for(int  i=0; i<subcadena.length-1; i++){
			for(int  j=0; j<cadena.length-1;j++){
				if(cadena[j]==subcadena[i]  ){
					
					j++;
					i++;
					
						
				}
				if(cadena[j]==subcadena[i]  ){
					contador++;
					pos=j-1;
					existe=true;
				}
				
				}					
							
		}
		//SALIDA
		if(existe==false){
			
				System.out.println("La subcadena no se encuentra en la cadena de caracteres introducida!");
			
		}
		else{
		System.out.println("Existe(n) "+contador+" subcadena(s) dentro de la cadena introducida");
		System.out.println("La subcadena existe en la posición "+pos+ " de la cadena introducida");
		
		}
		}

	

}
