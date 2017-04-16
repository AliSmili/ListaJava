
public class Ejercicio1 {

	public static void main(String[] args) {
		// CREAR UN PROGRAMA JAVA QUE TENGA 3 FUNCIONES
		// LA PRIMERA FUNCION DEVOLVERA ARRAY DE 100 ELEMENTOS Y DEVOLVERA DEL 1 AL 100 CADA UNO EN SU RESPECTIVA RELACION
		// LA SEGUNDA FUNCION   UNA ARRAY DE ENTEROS Y DEVOLVERA LA SUMA DE TODOS LOS ELEMENTOS DEL ARRAY
		// LA TERCERA FUNCION  DEVOLVERA LA MEDIA: CALCULA LA MEDIA DE TODOS LOS ELEMENTOS DE LOS ARRAYS
		
		
			int[] miArray=new int[100];
			int suma=0;
			float media;
			
			miArray=DevolverArray();
			
			for (int i : miArray) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
			
			suma=FuncionSuma(miArray);
			
			System.out.println("La suma de los elementos del array es :"+suma);
			
			media=mediaArrays(miArray);
			
			System.out.println("La media de los elementos del array es "+media);
		}
			
		

	
	public static int[] DevolverArray(){
		int[]array=new int[100];
		for(int i=0;i<100;i++){
			array[i]=i+1;
			
		}
		return array;
	}
	
	public static int FuncionSuma(int[]array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			
		}
		return sum;
	}
	
	public static float mediaArrays(int[]array){
		
	float med=0f;
	int sum=0;
	int contador=0;
	
	for(int i=1;i<=array.length;i++){
		sum+=i;
		contador++;
		
	}
	med=sum/contador;
	
	return med;
	
	}	
		
	}
 

