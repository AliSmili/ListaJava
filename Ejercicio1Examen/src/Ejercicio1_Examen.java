import java.util.Scanner;
public class Ejercicio1_Examen {

	public static void main(String[] args) {
		// CADENA Y SUBCADENA
		
		char cadena[]={'H','O','L','A','M','U','N','D','O','S'};
		char subcadena[]={'M','U'};							//No utilizare este array, es solo a modo de aclarar que subcadena voy a evaluar
		int contador=0;
		boolean esCorrecto=false;
		int pos=0;
		
		for(int i=0;i<cadena.length-1;i++){
			
			for(int j=1;j<cadena.length;j++){
				
				if(cadena[i]=='O'){
					if(cadena[j]=='S'){
						esCorrecto=true;
						pos=i;							//pos=0 es la primera posición por definición en mi ejercicio
					}
					
				}
						
			}
			
		}
		if(esCorrecto){
			System.out.println("La subcadena existe dentro de la cadena");
			System.out.println("La posicion de la subcadena dentro de la cadena es:"+pos);
		}
		else{
			System.out.println("La subcadena N0 existe dentro de la cadena");
		}

	}

}
