
public class Palindromo {

	public static void main(String[] args) {
		
		
		String palabra="arenera";						//Arenera, soletatelos...
		boolean correcto=false;
		
		correcto=esPalindromo(palabra);
		
		if(correcto){
			System.out.println("La palabra es palindroma");
		}else{
			System.out.println("La palabra no es palindroma");
		}
		

	}
	public static boolean esPalindromo(String cadena){
		boolean correct=true;
		char[]nuevaCadena=new char[cadena.length()];
		int asc=0;
		int desc=cadena.length()-1;
		
		nuevaCadena=cadena.toCharArray();
		
		
			while(asc<desc && correct==true){
			if(nuevaCadena[asc]==nuevaCadena[desc]){
				asc++;
				desc--;
				correct=true;
				
			}else{
				correct=false;
			}
			
			}
			return correct;
	
	
}
}
