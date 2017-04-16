
public class EjercicioR4_8 {

	public static void main(String[] args) {
		/* Escribe una función “SubArray” a la que le pasas un array y dos posiciones. La función 
		te devuelve otro array que contiene los datos comprendidos entre ambas posiciones 
		(incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].*/
		
		
		
		int[]miArray={3,2,5,3,9,8,5,8,7,4,8,12};
		int indice1=3;
		int indice2=6;
		int[]arrayModificado;
		
		arrayModificado=SubArray(indice1,indice2,miArray);
		System.out.println("El array resultante es :");
		ImprimeArray(arrayModificado);

	}
	public static int[]SubArray(int index1,int index2, int[]array){
		
		int tamaño=0;
		int indiceMayor;
		int indiceMenor;
		if(index1>index2){
			tamaño=(index1-index2)+1;
			indiceMayor=index1;
			indiceMenor=index2;
		}else{
			tamaño=(index2-index1)+1;
			indiceMayor=index2;
			indiceMenor=index1;
		}
		int[]nuevoArray=new int[tamaño];
		
		if(index1==index2){
			System.out.println("ERROR! Los indices no pueden ser iguales !");
		}else{
		
		for(int i=0;i<tamaño;i++){
			nuevoArray[i]=array[indiceMenor];
			indiceMenor++;
			
			
		}
		}
		return nuevoArray;
		
		
		
	}
	
	
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}

	}

}
