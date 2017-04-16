import java.util.Scanner;

public class Ejercicio2ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteros[];
		boolean error=false;
		int tam=1;
		String resultado="";
		int numero;
		
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
		
		for(int i=0; i<enteros.length;i++){
			
			enteros[i]=tam;
			tam--;
			
		}
		
		System.out.println("El vector resultante es: \n");
		
		for (int i : enteros) {
			System.out.print(i+" ");
		}

	}

}
