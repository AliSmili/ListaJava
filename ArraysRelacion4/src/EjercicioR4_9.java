import java.util.Arrays;

public class EjercicioR4_9 {

	public static void main(String[] args) {
		/*Escribe una funci�n �RecortaArray� a la que le pasas un array y dos posiciones. La 
	funci�n modificar� el array inicial qued�ndose s�lo con lo contenido entre ambas 
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
		
		int tama�o=0;
		int indiceMayor;
		int indiceMenor;
		if(index1>index2){
			tama�o=(index1-index2)+1;
			indiceMayor=index1;
			indiceMenor=index2;
		}else{
			tama�o=(index2-index1)+1;
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
		
		array=RedimensionarArray(array, tama�o);								//Luego utiizo esta funcion para co�ar los elementos en un array redimensionado
		
		
		
		}
		return array;
		
		
		
	}
	public static int[] RedimensionarArray(int[]a, int NuevoTama�o){
		
		int[]b =Arrays.copyOf(a,NuevoTama�o);
		return b;
	}
	
	
	
	
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}

	}

}
