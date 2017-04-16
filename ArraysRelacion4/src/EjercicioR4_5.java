
public class EjercicioR4_5 {

	public static void main(String[] args) {
		/*Escribe una funci�n �Elimina1ElementoArray� a la que le pasas dos par�metros: un 
		array de enteros y un valor entero. La funci�n eliminar� del array el valor entero 
		independientemente de la posici�n en la que se encuentre. Si el valor se repite, se 
		eliminar� s�lo la primera vez que aparece el valor*/
		
		
		int[]miArray={3,2,5,3,9,8};
		int numero=3;
		int[]arrayModificado;
		
		arrayModificado=Elimina1ElementoArray(miArray,numero);
		System.out.println("El array resultante es :");
		ImprimeArray(arrayModificado);
		
		
		
		
		

	}
	public static int[]Elimina1ElementoArray(int[]array ,int num){
		
		int[]nuevoArray=new int[array.length-1];			//Primero redimensiono creando un nuevo array
		int contador=0;
		int pos=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==num ){
				contador++;
				//pos=i;//break;								Asi se resuelve, pero intentare evitar el break
				if(contador==1){
					pos=i;										//No soy cobarde ! :) Me capta la primera posicion donde aparece el numero
				}
			}
		}
		if(contador==0){									
			return array;									//En caso de que el numero introducido no este en array, me devuelve el array original
		}else{
			
				for(int i=0;i<pos;i++ ){
					nuevoArray[i]=array[i];
				}
				for(int i=pos+1;i<array.length;i++){
					nuevoArray[i-1]=array[i];
					
		
				}
		}return nuevoArray;
		
	}
	public static void ImprimeArray(int[] fs){
		for (int i : fs) {
			System.out.print(" "+i+" ");
		}
	}

}
