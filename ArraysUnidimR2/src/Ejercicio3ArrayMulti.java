import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio3ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[];
		boolean error=false;
		int tam=1;
		String resultado="";
		boolean esOrdenado=false;
		
		Scanner teclado=new Scanner(System.in);
		
		do{
			
			System.out.print("Introduzca el tamaño del array: ");
			resultado=teclado.nextLine();
			try{
				tam=Integer.parseInt(resultado);
				error=false;
			}catch(Exception e){
				error=true;
				System.out.println("Dato introducido no numérico !");
			}
			if (error == false && tam <= 0) {
				error = true;
				System.out.println("La dimensión del array no puede ser igual o menor que cero !");
			}
			
		}while(error);
		
		enteros=new int[tam];
		error=false;
		
		do{
			System.out.println("Introduzca los elementos del array de enteros:");

			for (int i = 0; i < enteros.length; i++) {
				
				try {
					resultado = teclado.next();
					enteros[i] = Integer.parseInt(resultado);
					error=false;
					
				} catch (Exception e) {
					error = true;
					System.out.println("Error generico, revisa la excepcion");
					break;
				}

			}
			
			
		}while(error);
		
		int ordenado[]=new int[tam];
		
		for(int i=0; i<enteros.length;i++){
			
			ordenado[i]=enteros[i];				//Le ponemos los mismos valores de enteros al array auxiliar
		}
		Arrays.sort(ordenado);
		
		if(Arrays.equals(enteros, ordenado)){
			esOrdenado=true;
			System.out.println("El array introducido está ordenado de forma ascendente ");
		}else{
			esOrdenado=false;
			System.out.println("El array introducido está desordenado");
		}
		
		
		
		
		
		
		
	}

}
