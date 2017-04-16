package sumarFracciones;

import java.util.Scanner;

public class SumarFracciones {

	public static void main(String[] args) {
		// HAY QUE SUMAR 1+1/2+1/3+....+1/n
		Scanner teclado=new Scanner (System.in);
		
		
		double suma=0;
		int N=3;
		
		for(double i=1;i<=N;i++){
			suma += 1/i;  //suma=suma+(1/i);  si fuera 1+2+3...+N...EN VEZ DE 1/i PONER SOLO i
		}
           System.out.println("La suma es "+ suma);
	}

}
