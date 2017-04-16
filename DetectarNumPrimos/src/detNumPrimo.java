import java.util.Scanner;
public class detNumPrimo {

	public static void main(String[] args) {
		// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
		int rInicial=2;
		int rFinal;
		boolean esPrimo;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Inroduzca un numero : ");
		 rFinal=teclado.nextInt();
		
		
		for(int i=rInicial;i<=rFinal;i++){
			esPrimo=true;                  //Suponer q es primo hasta q se demuestre el contrario
			
				for(int j=2;j<i;j++){
				if(i%j==0){
					esPrimo=false;
				}
				}
				if (esPrimo){
					System.out.println(i);
				
						
						
					}
					
				
				


					
					
				
				
				
				}
				
				}
				
			}
	
			


		
