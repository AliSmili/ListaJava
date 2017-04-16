import java.util.Scanner;
public class SumaDigitosNumericos {

	public static void main(String[] args) {
		// Introducir un numero grande (4 digitos), y sacar la suma de sus digitos...asi sucesivamente hasta llegar a una suma menor o igual que 9
		
		int suma=0;
		int numero;
		int aux;
		int dig1, dig2, dig3,dig4;								//PERFE :)
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un numero de 4 digitos: ");
		
		numero= teclado.nextInt();
		
		dig1=numero/1000;
		aux=numero%1000;
		dig2=aux/100;
		aux=aux%100;
		dig3=aux/10;
		dig4=aux%10;
		System.out.println("Los digitos son "+ dig1+ " "+dig2+" "+dig3+" "+dig4);
		
		suma= (dig1+dig2+dig3+dig4);
		
		do{
		
			dig3=suma/10;
			dig4=suma%10;
			suma =dig3+dig4;
			
			
		}
		while(suma>9);
		
		System.out.println("La suma de los dígitos es :"+suma);
				
				
		

	}


}
