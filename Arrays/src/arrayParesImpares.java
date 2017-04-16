
public class arrayParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero[]= {3,5,7,9,2,8,15,6,34,54};
		int aux1=0;
		int aux2=0;
		
		int[] pares= new int[10];
		int[] impares= new int[10];
		
		for(int i=0;i<numero.length;i++){
			
				if(i%2==0){
					aux1++;
					pares[i]=numero[i];
					
					
				}
				else{
					aux2++;
					impares[i]=numero[i];
				
					
				
				}
			}
				System.out.println("El vector de impares es:");
				for (int b : impares) {
					System.out.print(b+" \n");
				}
				System.out.println("El vector de pares es:");
				for (int c : impares) {
					System.out.print(c+" ");
					
				}
			
		}

	}


