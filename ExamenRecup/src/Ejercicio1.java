import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String caracter1="*.";
		String caracter2="* ";
		String cadena="";
		
		
		int N=0;				//Numero de pisos
		String linea="";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número de pisos: ");
		N=teclado.nextInt();
		
		for(int i=1;i<=N;i++){
						
				linea=" "+linea;
				for(int j=0;j<=N-i;j++){
					if(j==N-i){
					cadena=cadena+caracter2;
					}else{
						cadena=cadena+caracter1;
					}
			}
				System.out.println(linea+cadena);
				cadena="";
						
				
			}

	}

}
