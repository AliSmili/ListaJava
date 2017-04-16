import java.util.Scanner;
public class IntroducirNumeros {

	public static void main(String[] args) {
		// Introducir numeros por teclado hasta que el usuario escriba N//
		int contador=0;
		float suma=0;
		String respuesta="";
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca por favor un numero : ");
	    respuesta=teclado.next();
	    for (;!respuesta.equals("N");contador=contador+1){
	    	float numero=teclado.nextFloat();
	    	System.out.println("Quiere Introducir mas numeros?" );
	    	respuesta=teclado.next();
	    	
	    	
	    	suma= suma + numero;
	    	
	    	
	    }
	    	System.out.println("El numero de veces que ha tecleado numero ha sido: "+ contador);
	    	System.out.println("La suma de los numeros introducidos es :" + suma);
	   
		
		

	}

}
