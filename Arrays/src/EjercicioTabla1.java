import java.util.Scanner;
public class EjercicioTabla1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Leer 5 números y mostrarlos en el mismo orden introducido
		
		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[5];
		
		for(int j=0; j<5;j++){
		System.out.println("Introduzca un número: ");
		 vector[j] = teclado.nextInt();
		}
		
		for(int i=0; i<5;i++){
			System.out.println(vector[i]);
		}

	}

	
}