
public class SumaRestaMultipl2Arrays {

	public static void main(String[] args) {
		// Suma , resta , Multiplicación, División de 2 arrays de números enteros.
		
		int numeros1[]={2,5,6,7,8};
		int numeros2[]={4,8,0,2,3};
		int[] suma=new int[numeros1.length];
		int[] resta= new int[numeros1.length];
		int[] producto= new int[numeros1.length];
		int[] division= new int[numeros1.length];
		
		for(int i=0; i<numeros1.length; i++){
			
			suma[i]=numeros1[i]+numeros2[i];
			resta[i]=numeros1[i]-numeros2[i];
			producto[i]=numeros1[i]*numeros2[i];
			if (numeros2[i]==0){
				division[i]= 0;
			}
			else{
				division[i]=numeros1[i]/numeros2[i];
			}
		}
		System.out.println("La suma de los arrays es: ");
		for (int num : suma) {
			System.out.print(num+" ");
		}
		System.out.println("\n La resta de los arrays es: ");
		
		for (int num : resta) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n El producto de los arrays es: ");
		for (int f : producto) {
			System.out.print(f+" ");
			
		}
		
		System.out.println("\nLa división entre los arrays es ");
		for (int b : division) {
			System.out.print(b+" ");
			
		}
		
		

	}

}
