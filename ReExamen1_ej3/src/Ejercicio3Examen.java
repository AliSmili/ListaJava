import java.util.*;
public class Ejercicio3Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String caracter="*.";
		String cadena="";
		
		int N=0;				//Numero de pisos
		String linea="";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número de pisos: ");
		N=teclado.nextInt();
		
		for(int i=1;i<=N;i++){
						
				linea="."+linea;
				for(int j=0;j<=N-i;j++){
					
					cadena=cadena+caracter;
				
			}
				System.out.println(linea+cadena);
				cadena="";
						
				
			}
		
		
		
		
		

	
	}
}
