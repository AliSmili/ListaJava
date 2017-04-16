
public class Ejercicio7R5 {

	public static void main(String[] args) {
		/* Escribe  la  función  “QuitaEspaciosPro”  a  la  que  le  pasamos  una 
	cadena  y  nos  devuelve  la  misma  cadena  pero  con  todos  los 
	espacios quitados (tanto los del principio como los del final como 
	los intermedios). */
		
		String frase=" Hola mundo Cruel !";
		String resultado="";
		
		resultado=QuitarEspaciosPro(frase);
		System.out.println("La cadena resultante quitando los espacios en blanco es :\n"+resultado);

	}
	public static String QuitarEspaciosPro(String cadena){
		String cadenaSinBlancos="";
		for (int i=0; i < cadena.length(); i++) {
			  if (cadena.charAt(i) != ' ')
			    cadenaSinBlancos += cadena.charAt(i);
			}
		return cadenaSinBlancos;
	}

}
