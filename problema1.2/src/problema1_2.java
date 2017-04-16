import java.util.Scanner;
public class problema1_2 {

	//SACAR POR PANTALLA LA ULTIMA CIFRA DE UN NUMERO INTRODUCIDO
	public static void main(String[] args) {
		int num;
		int longitud;
		int posicion;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		// TODO Auto-generated method stub
		 num=teclado.nextInt();
		String numero=Integer.toString(num);
	
	    longitud = numero.length();
        posicion=longitud-1;
		char resultado=numero.charAt(posicion);
		System.out.println("La ultima cifra del numero introducido es:" +resultado);
		

	}

}
