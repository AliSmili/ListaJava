
public class Ejercicio4R5 {

	public static void main(String[] args) {
		/*Escribe	la	función	“Contiene”	a	la	que	le	pasamos	una	cadena	y	
	un	carácter	por	parámetro	y	nos	dice	si	el	carácter	aparece	en	la	
	cadena	o	no.	Es	igual	que	la	función	Contains.	Evidentemente,	no	
	podéis	usar	esta	función	para	hacer	la	vuestra.*/
		
		
		String cadena="HolaMundo";
		char caracter='x';
		boolean existe=false;
		
		existe=Contiene(cadena, caracter);
		
		if(existe){
			System.out.println("El caracter existe dentro de la cadena");
		}else{
			System.out.println("El caracter no existe dentro de la cadena");
		}
		
		
		
		
		
		
		
		

	}
	public static boolean Contiene(String frase, char car){
		boolean exist=false;
		int contador=0;											//En caso de querer contar cuantas veces se encuentra el caracter
		
		frase=frase.toUpperCase();
		car = Character.toUpperCase(car);						//Hay que llevar los 2 parámetros  a mayuscula (o minuscula pero los dos
		char[]nuevoAr=frase.toCharArray();
		
		System.out.println("El array de caracteres es :/n");
		for (char c : nuevoAr) {
			System.out.print(c+" ");
		}
		
		for(int i=0;i<nuevoAr.length;i++){
			if(nuevoAr[i]==car){
				exist=true;
				contador++;
			}
					
			
		}
		return exist;
		
				
				
		
		
		
		
		
		
		
	}

}
