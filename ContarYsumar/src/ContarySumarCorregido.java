
import java.util.Scanner;

public class ContarySumarCorregido{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String respuesta="";
		int contador=0;
		float suma=0;
		System.out.println("Quiere introducir mas numeros");
	    respuesta=teclado.next();
		for (;!respuesta.equals("N");){	
			System.out.println("Numero");
			float numero=teclado.nextFloat();
			System.out.println("Quiere introducir mas numeros");
		    respuesta=teclado.next();
		    contador=contador+1;
		    suma=suma+numero;
		  }
		System.out.println(contador);
		System.out.println(suma);
	  }
	}

