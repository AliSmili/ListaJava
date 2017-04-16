
public class Ejercicio4R3 {

	public static void main(String[] args) {
		//Escribe una función “InvierteArray” a la que le pasamos un array de enteros y modifica su 
		//contenido invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).
		
		int[] miArray={2,5,8,0,1,9};
		int[] Invertido;
		
		
		
		int[] arrayInverso=InvierteArray( miArray);
		
		System.out.println("El array invertido es: ");
		
		for (int i : arrayInverso) {
			System.out.print(" "+i+" ");
		}
		
		
		

	}
	public static int[] InvierteArray(int[] array){
		int[] array2=new int[array.length];
		
		for(int i=0;i<array.length;i++){
			 array2[i]=array[array.length-i-1];
			}
		return array2;
			
			
		}
	

}
