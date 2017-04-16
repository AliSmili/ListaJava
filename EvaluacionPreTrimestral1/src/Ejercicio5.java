import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// Hacer un programa que nos pida introducir N números							//Esta Bien :)
		//Dicho programa nos sacara el mayor, menor y media de los numeros
		
		Scanner teclado = new Scanner(System.in);
		int max;
		
		int mayor=0, menor=0;
		float media=0;
		int suma=0;
		
		System.out.println("Introduzca cuántos númros quieres evaluar: ");
		max=teclado.nextInt();
		int[] vector= new int[max];
		System.out.println("Introduzca los valores del vector numérico: ");
		
		for(int i=0; i<vector.length; i++){
			vector[i]=teclado.nextInt();
		}
		
		menor=vector[0];									//Suponemos que el menor esta el pos 0;
		for(int i=1;i<vector.length; i++){
			if(vector[i]<=vector[0]){
				menor=vector[i];
			}
			else{
				mayor=vector[i];
			}
			
		}
		
		for(int i=0;i<vector.length;i++){
			for(int j=0;j<vector.length;j++){
				
			}
			
		}
		
	
	for(int i=0; i<vector.length; i++){
		suma+=vector[i];
		media=suma/max;	
			
	}
	System.out.println("El menor de los números es: "+menor+" El mayor es "+mayor+" y la media es "+media+" ");
	}
}
