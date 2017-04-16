import java.util.Scanner;
public class ArrayChar2 {

	public static void main(String[] args) {
		// 
		
		int[]primos;
		int numero=0;
		boolean error=false;
		String resultado="";
		Scanner teclado=new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un número :");
			resultado=teclado.next();
			try{
				numero = Integer.parseInt(resultado);
				
			}catch(Exception e){
			error=true;
			System.out.println("ERROR!! NO HA INTRODUCIDO UN NÚMERO");
			}
			
		}
		
		while(error);
		
		

	}

}
