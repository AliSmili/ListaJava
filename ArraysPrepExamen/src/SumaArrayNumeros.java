import java.util.Scanner;
public class SumaArrayNumeros {

	public static void main(String[] args) {
		// Introducir un array de numeros enteros y sumar sus elementos
		//segui sumando los resultados hasta llegar a un num inferior a 9
		//Si llega a superar el 9 hay que volver a introducir el numero
		
		int numero[]=new int[5];
		int suma=0, suma2=0;
		char sumaChar;
		char sumaCharArray[]=new char[2];
		
		Scanner teclado=new Scanner(System.in);
		
		for(int i=0;i<numero.length;i++){
			System.out.println("Introduzca un numero del array:");
			numero[i]=teclado.nextInt();
		}
		
		for(int i=0; i<numero.length;i++){
			
			suma=suma+numero[i];	
			
		}
		System.out.println("El array de numeros introducido es:");
		for (int i : numero) {
			System.out.print("\n"+i+" ");
		}
		System.out.println("Y La suma de los digitos es "+suma);
		
		if(suma>9){
			sumaChar=(char) suma;
			for(int i=0; i<2;i++){
				suma=suma2+sumaCharArray[i];
				
			}
			System.out.println("La nueva suma es: "+suma2 );
		}
		

	}

}
