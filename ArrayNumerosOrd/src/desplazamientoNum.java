import java.util.Scanner;

public class desplazamientoNum {

	public static void main(String[] args) {
		// DESPLAZAMIENTO Y ROTACION DE UN ARRAY DE NUMEROS------IMPORTANTE!!			
		int numeros[]=new int[3];
		Scanner teclado=new Scanner(System.in);
	
		for(int i=0; i<numeros.length; i++){
			
			System.out.println("Introduzca un caracter: ");
			numeros[i] = teclado.nextInt();
  
	}


				
			
			for(int i=1; i<=i%numeros.length;i++){                //SE USA EL MODULO PARA PODER VOVER AL PRINCIPIO													
				int temp1 =numeros[i+1];
				numeros[i+1]=numeros[i];  //??
				numeros[i]=temp1;								  //Ya que i%numeros.lenght cdo llega i a numeros.length,el modulo de la operción es 0.	
				
			}
				
				for(int i=0; i<numeros.length;i++){
				System.out.print("El vector resultante es :"+numeros[i]+" ");
			}
	}
	
}
