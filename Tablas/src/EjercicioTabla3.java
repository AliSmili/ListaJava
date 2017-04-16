import java.util.Scanner;
public class EjercicioTabla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.

		Scanner teclado=new Scanner(System.in);
		int vector[]=new int[5];
		int contaPos=0;
		int contaNeg=0;
		int contaCeros=0;
		int numPos=0;
		int numNeg=0;
		                                            //MUY INTERESANTE EJERCICIO !
		
		for(int i=0;i<=4;i++){
			System.out.println("Introduzca los números por teclado: ");
			vector[i]=teclado.nextInt();
		}
		
		for(int i=0;i<=4;i++){
			if (vector[i]==0){
			contaCeros++;
			}
			else{
				if(vector[i]>0){
					
					numPos=numPos+vector[i];
					contaPos++;
				}
				else{
					
					numNeg=numNeg+vector[i];
					contaNeg++;
					
				}
			}
			
			}
		if(contaCeros==0){
			System.out.println("No hay ceros");
		
		}
		else{
			System.out.println("El número de ceros que hay es "+contaCeros);
		}
		
		if(contaPos==0){
			System.out.println("No hay números positivos");
			
		}
		else{
			System.out.println("La media de los numeros positivos es "+(float)(numPos/contaPos));
			
		}
		if(contaNeg==0){
			System.out.println("No hay números negativos");
			
		}
		else{
			System.out.println("La media de lo numeros negativos es:"+(float)(numNeg/contaNeg));
			
		}
		
			
			
		   
		
		
		
	}
	

}
