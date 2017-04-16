import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		
		int resultado=1;
		int n;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero para calcular el factorial");
		
		n = teclado.nextInt();
		resultado = Factorial(n);
		
		System.out.println("El factorial del numero introducido es "+resultado);
	
		
	}
	
	public static int Factorial(int a){
		  int result = 1;
		  
		  if (a == 0){
			  return 1;
		  }else{
	       for (int i = 1; i <= a; i++) {
	           result = result * i;
	       }
		  
		return result;
		  }
	}
	
	
}
