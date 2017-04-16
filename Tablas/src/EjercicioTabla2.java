import java.util.Scanner;
public class EjercicioTabla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Leer 5 números y mostrarlos en orden inverso al introducido.
		
		int vector[]=new int[5];
		int inverso[]=new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.println("Introduzca los valores del vector: ");
			vector[i]=teclado.nextInt();
		}
		System.out.println("El vector invertido es: ");
			
				for(int j=4;j>=0;j--){                          //Para el decremento (tanto como el incremento) ,hay que tener cuidado con la primera cond
				System.out.println(vector[j]);
				                                            //No puede ser < > o >=...tiene q ser = 			
					
				}                                               //Otra posible solucion es :
				
				                                                // for(int i=4;i>=0;i--){
				                                                //System.out.println(vector[i]);
			}
	
		}
		


	


