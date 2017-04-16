
public class Ejercicio3R3 {					//Pendiente por el tema de la division entre arrays

	public static void main(String[] args) {
		/* Escribe  también las  funciones  “RestaArrays”,  “MultiplicaArrays” 
		y “DivideArrays”.*/
		
		int[]primero={2,4,7,9,5};
		int[]segundo={4,1,9,1,3};
		int[] resta;
		int[]multipl;
		float[]division;
		
		resta=RestaArrays(primero,segundo);
		multipl=MultiplicaArrays(primero,segundo);
		division=DivideArrays(primero,segundo);
		
		//Mis Funciones :)
		System.out.println("La resta resultante de los dos arrays es :");
		
		ImprimeArray(resta=RestaArrays(primero,segundo));
		System.out.println();
		
		System.out.println("La multiplicacion resultante de los dos arrays es :");
		
		ImprimeArray(multipl=MultiplicaArrays(primero,segundo));
		System.out.println();
		
		System.out.println("La división resultante de los dos arrays es :");
		
		ImprimeArrayFloat(division=DivideArrays(primero,segundo));
		
		
		
		
		

	}
	
	public static int[]RestaArrays(int[] a, int[]b){
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i]-b[i];
		}
		return c;
	}
	
	public static int[]MultiplicaArrays(int[]a, int[]b){
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i]*b[i];
		}
		return c;
	}
	
	public static float[]DivideArrays(int[]a, int[]b){
		float[]c=new float[a.length];
		
		for(int i=0;i<a.length;i++){
			c[i]=a[i]/b[i];
		}
		
		return c;
	}
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}
	}
	
	public static void ImprimeArrayFloat(float[] fs){
		for (float i : fs) {
			System.out.print(" "+i+" ");
		}
	}
	

}
