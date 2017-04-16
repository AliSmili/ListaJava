
public class Ejercicio1R3 {

	public static void main(String[] args) {
		/* Escribe una función “CopiaArrayInvertido” a la que le pasas dos 
		arrays por parámetro y te copia el contenido del primer array al 
		segundo  array  pero  en  orden  inverso  (Ej.:  si  el  primero  es 
		[5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]). */
		
		int[]miArray={5,6,7,8,9};
		int[]Invertido;
		
		Invertido=InvierteArray(miArray);
		
		System.out.println("El array invertido es :");
		for (int i : Invertido) {
			System.out.print(" "+i+" ");
		}
		

	}
	public static int[]InvierteArray(int[]array){
		int[] b=new int[array.length];
		for(int i=0;i<array.length;i++){
			b[i]=array[array.length-1-i];
			
		}
		
		return b;
		
	}

}
