import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean error=false;
		int numero = 1;
		String resultado="";
		Scanner teclado=new Scanner(System.in);
		int factorial=1;
		int aux=1;
		
		do{
		
			System.out.println("Introduzca un número positivo para calcular su factorial: ");
			resultado = teclado.next();
			error=false;
			try{
				numero = Integer.parseInt(resultado);
				
			}catch(Exception e){
				error=true;
				System.out.println("ERROR ! No has introducido un número");
			}
			if(numero<=0 && error==false){
				error=true;
				System.out.println("Ha introducido un número negativo !");
				 
			}
		}while(error);
		
		while(numero !=0){
			factorial = factorial*numero;
			numero--;
		
		
		}	
		System.out.println("El factorial del número introducido es : ");
		System.out.println(factorial);
											
			
			
		
	}

}
