
public class Ejercicio10R5 {

	public static void main(String[] args) {
		/*Escribe  la  función  “SustituyePalabra”  a  la  que  le  pasamos 
	una cadena y dos palabras y nos devuelve otra cadena en la que 
	haya que sustituir la primera por la segunda. */
		
		String cadena="Hola mundo cruel !";
		String subCadena1="Hola";
		String subCadena2="mundo";
		String resultado="";
		
		resultado=SustituyePalabra(cadena, subCadena1, subCadena2);
			
			System.out.println("La cadena resultante es "+resultado);
			
			
		}	
		

	
	public static String SustituyePalabra(String frase,String sub1, String sub2){
		int indice=0;
		String aux1="";
		String aux2="";
		
		frase=replaceFirst( sub1,sub2);
	
		return frase;
	}



	private static String replaceFirst(String sub1, String sub2) {
		// TODO Auto-generated method stub
		return null;
	}
	
 
}
