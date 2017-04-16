import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		
		int resultado=1;
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el numero al cual le quieres sacar su numero fibonacci");
		
		n = teclado.nextInt();
		
		resultado = fibonacci(n);
		
		System.out.println("El resultado de la operacion es "+resultado);
		
	}
	
	    public static int fibonacci(int n) {
	        if (n <= 1) return n;
	        else return fibonacci(n-1) + fibonacci(n-2);
	    }
	
}
