
public class Ejercicio2R3 {

	public static void main(String[] args) {
		/* Escribe  una  función  “SumaArrays”  a  la  que  le  pasamos  tres 
		arrays.  Los  dos  primeros  contendrán  los  datos  que  hay  que 
		sumar y en el tercero guardaremos el resultado (Ej.: [1,2,3] + [8, 
		6, 8] = [9, 8, 11]). */
		
		int[]primero={1,2,3,4,5};
		int[] segundo={9,6,5,1,4};
		int[]suma;
		
		suma=SumaArrays(primero,segundo);
		
		System.out.println("La suma de los dos arrays es :");
		for (int i : suma) {
			System.out.print(" "+i+" ");
		}

	}
	public static int[] SumaArrays(int[]a, int[]b){
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i]+b[i];
			
		}
		return c;
	}

}
