
public class Ejercicio2R5 {

	public static void main(String[] args) {
		/* Escribe	 la	 función “NumeroVocales” a	 la	 que le	 pasamos una	
	cadena y nos devuelve el número	 de	vocales que hay en la	cadena*/
		
		int numVocales=0;
		String cadena="Hola mundo cruel ! Aqui estamos fatal !!";
		
		//Función que calcula el número de vocales
		numVocales=NumeroVocales(cadena);
		
		System.out.println("El número de vocales en esta cadena es :"+numVocales);
			
		
		


	}
	public static int NumeroVocales(String frase){
		
		//char[]vocales={'A','E','I','O','U'};
		int contador=0;
		
		
		//Primero pasar la cadena a mayúsculas.
		 frase=frase.toUpperCase();
		 
		 //Quitamos los espacios en blanco del principio y final si existen
		 frase.trim();
		 
		 System.out.println(frase);
		 
		 
		//Hay que comparar cada caracter de la cadena con el array de chars
		 
		 for(int i=0;i<frase.length();i++){
			 if(frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U' ){
				 contador++;
			 }
		 }
		 	 
		 
		/*for(int i=0;i<array.length;i++){
			for(int j=0;j<vocales.length;j++){
				if(array[i]==vocales[j]){
					contador++;
				}
			}
		}*/
		return contador;
		
	}

}
