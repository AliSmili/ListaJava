
public class EjercicioR4_6 {

	public static void main(String[] args) {
		/*Escribe una función “EliminaElementosArray” a la que le pasas dos parámetros: un 
		array de enteros y un valor entero. La función eliminará del array el valor entero 
		independientemente de la posición en la que se encuentre. Si el valor se repite, se 
		eliminarán todas las veces que se repite. */
		
		
		int[]miArray={3,2,5,3,9,8,5,8,7,4,8,12};
		int numero=8;
		int[]arrayModificado;
		
		arrayModificado=EliminaElementoArray(miArray,numero);
		System.out.println("El array resultante es :");
		ImprimeArray(arrayModificado);
		
		
		
		
		

	}
	public static int[]EliminaElementoArray(int[]array ,int num){
		int cont1=0;										//cont1 e incrementa al toparse con el numero
		int cont2=0;										//se incrementa para controlar la copia de los elementos
		int[]nuevoArray=new int[array.length];				//Primero redimensiono creando un nuevo array
		int contador=0;
		
		for(int i=0;i<array.length;i++){
			
			if(array[i]==num ){
				contador++;
				
				nuevoArray=new int[array.length-contador];
							
			
			}
		}
		
	for(int i=0;i<array.length;i++){
			
			if(array[i]==num ){
				cont1++;						
			}
			else{
				nuevoArray[cont2]=array[cont1];
				cont1++;
				cont2++;
			}
		}
		
					
														    //Ahora sabemos ctas veces aparece el num dentro del array (contador)
		if(contador==0){									
			return array;									//En caso de que el numero introducido no este en array, me devuelve el array original
		}else{
			
				
			return nuevoArray;
		}
	}
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}

	}

}
