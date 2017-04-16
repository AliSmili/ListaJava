import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		float base;
		float altura;
		float area;
		// Area Triangulo
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca la base ");
	    base=teclado.nextFloat();
		System.out.println("Introduzca la altura: ");
	    altura=teclado.nextFloat();
		
		area=(base*altura)/2;
		System.out.println("El area del tiangulo es : " +area);
		

	}

}
