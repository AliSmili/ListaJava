import java.util.Scanner;
public class DibRectangulo {

	public static void main(String[] args) {
		// Dibuja un rectangulo de b columnas y h filas utilizando *
		
		String paint="*";
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el número de filas: ");
		String input1=teclado.nextLine();
		int h=Integer.parseInt(input1);
		System.out.println("Introduzca el número de columnas: ");
		String input2=teclado.nextLine();
		int b=Integer.parseInt(input2);
		
		for(int i=1;i<=h;i++){
			for(int j=1;j<=b;j++){
			System.out.print(paint);
			
		}
			System.out.print("\n");
		
		
		}

	}

}
