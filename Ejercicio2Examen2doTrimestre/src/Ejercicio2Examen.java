
public class Ejercicio2Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultado="";
		String cadena="Nosotros vamos a la playa, y ellos a currar con nosotros, �l a trabajar. t� a masticar";
		
		
		//Funci�n que nos quita de la cadena los pronombres
		resultado=QuitarPronombres(cadena);
		System.out.println("La cadena resultante es: ");
		System.out.println(resultado);

	}
	
	public static String QuitarPronombres(String frase){
		
	String blanco="";
	String nuevo="";
	frase=frase.toUpperCase();						//Lo llevamos todo a may�scula para facilitar  las comparaciones
	String sub1="NOSOTROS";							//DEFINIMOS LOS PRONOMBRES EN VARIABLES
	String sub2="NOSOTRAS";
	String sub3="VOSOTROS";
	String sub4="VOSOTRAS";
	String sub5="Y�";
	String sub6="T�";
	String sub7="�L";
	String sub8="ELLOS";
	String sub9="ELLAS";
	
	
	
	
	//Reemplazamos cada subcadena por una cadena vac�a
	
	nuevo=frase.replaceAll(sub1,blanco);
	nuevo=nuevo.replaceAll(sub2,blanco);
	nuevo=nuevo.replaceAll(sub3,blanco);
	nuevo=nuevo.replaceAll(sub4,blanco);
	nuevo=nuevo.replaceAll(sub5,blanco );
	nuevo=nuevo.replaceAll(sub6 ,blanco);
	nuevo=nuevo.replaceAll(sub7,blanco);
	nuevo=nuevo.replaceAll(sub8,blanco);
	nuevo=nuevo.replaceAll(sub9,blanco);
		
	
	return nuevo;
	
	}
		
	

}
