
public class EjercicioR4_7 {

	public static void main(String[] args) {
		/*Escribe una función “InsertaArrayEnArray” a la que le pasas tres parámetros: un array 
	de enteros, una posición de ese array, y otro array de enteros. La función insertará en 
	el primer array, a partir de la posición indicada, todo el contenido del segundo array. 
	Ej.: [6, 2, 1, 3], posición: 2, insertar: [12, 13], resultado = [6, 2, 12, 13, 1, 3].*/
		
		int[]miArray={3,2,5,3,9,8,5,8,7,4,8,12};
		int[]intruso={65,89};
		int indice=8;
		int[]arrayModificado;
		
		arrayModificado=InsertaArrayEnArray(miArray,indice,intruso);
		System.out.println("El array resultante es :");
		ImprimeArray(arrayModificado);
				

	}
	public static int[]InsertaArrayEnArray(int[]array,int index,int[]enchufado){
		int[]nuevoArray=new int[array.length+enchufado.length];
		
		for(int i=0;i<index;i++){
			nuevoArray[i]=array[i];
		}
		
		int j=0;
		for(int i=index;i<index+enchufado.length;i++){
			
			nuevoArray[i]=enchufado[j];
			j++;
			
		}
		int k=index;
		for(int i=index+enchufado.length;i<nuevoArray.length;i++){
			
			nuevoArray[i]=array[k];
			k++;
		}
		return nuevoArray;
	}
	
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}

	}

}
