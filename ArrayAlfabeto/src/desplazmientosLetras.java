import java.util.Scanner;
public class desplazmientosLetras {

	public static void main(String[] args) {
		// ROTAR LETRAS EN UN ARRAY...DESPLAZAMIENTOS
		
		char palabra[]=new char[4];
		char aux=' ';
		Scanner teclado=new Scanner(System.in);
	
		for(int i=0; i<palabra.length; i++){
			
			System.out.println("Introduzca un caracter: ");
			palabra[i] = teclado.next().charAt(0);
  
	}
			for(int i=0; i<palabra.length; i++){
			System.out.println(palabra[i]);
		}
			System.out.println("El vector resultante es: ");
			
			for(int i=palabra.length-1;i>=0;i--){
				aux=palabra[i-1];
				palabra[i]=aux;
				
			}
			for(int i=0; i<palabra.length;i++){
				System.out.print("El vector resultante es :"+palabra[i]+" ");
			}
	}
}
