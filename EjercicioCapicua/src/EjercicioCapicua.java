import java.util.Scanner;
public class EjercicioCapicua {

	public static void main(String[] args) {
		//  EJERCICIO NUMERO CAP�CUA....esta mal pero hay que repasarlo
		Scanner teclado=new Scanner(System.in);
		float numero;
		System.out.println("Introduzca un numero entre 0 y 9,999");
		numero=teclado.nextFloat();
		if(numero<0|| numero>9999){
			System.out.println("Dato introducido fuera del rango de valores permitidos");
		}
		//1-numero al reves
		String nuevacadena="";
	
		nuevacadena=Float.toString(numero);
		char pos0,pos1,pos2,pos3,pos4;
		pos3=',';
		pos4=nuevacadena.charAt(0);
		pos2=nuevacadena.charAt(1);
		pos1=nuevacadena.charAt(2);
		pos0=nuevacadena.charAt(5);
		
		System.out.println("El numero introducido al rev�s es :" +pos4+pos3+pos2+pos1+pos0);
		
		

	}
 
}
