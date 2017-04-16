import java.util.Arrays;

public class EjercicioR4_9 {

	public static void main(String[] args) {
		/*Escribe una función “RecortaArray” a la que le pasas un array y dos posiciones. La 
	función modificará el array inicial quedándose sólo con lo contenido entre ambas 
	posiciones (como el ejercicio anterior pero en vez de devolver un array diferente 
	modifica el array que le pasas).*/
		
		

		
		int[]miArray={3,2,5,3,9,8,5,8,7,4,8,12};
		int indice1=3;
		int indice2=6;
		
		
		miArray=RecortaArray(indice1,indice2,miArray);
		System.out.println("El array resultante es :");
		ImprimeArray(miArray);

	}
	public static int[]RecortaArray(int index1,int index2, int[]array){
		
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
		
		
		if(index1==index2){
			System.out.println("ERROR! Los indices no pueden ser iguales !");	//Primero pongo los elementos que me interesan al principio
		}else{
		
			int j=0;
		for(int i=indiceMenor;i<=indiceMayor;i++){					
			array[j]=array[i];		
			j++;	
			
		}
		
		array=RedimensionarArray(array, tamaño);								//Luego utiizo esta funcion para coìar los elementos en un array redimensionado
		
		
		
		}
		return array;
		
		
		
	}
	public static int[] RedimensionarArray(int[]a, int NuevoTamaño){
		
		int[]b =Arrays.copyOf(a,NuevoTamaño);
		return b;
	}
	
	
	
	
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}

	}

}
