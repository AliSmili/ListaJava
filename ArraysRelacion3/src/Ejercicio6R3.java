
public class Ejercicio6R3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] miArray={2,5,8,0,1,9};
		boolean contiene=false;
		int numero=8;
		
		System.out.println("Esta? "+Contiene(numero, miArray));
		
		

	}
	public static boolean Contiene(int n, int[]array){
		for(int num: array){
			if(n==num) return true;
				
			
		}return false;
	}

}
//Otra forma de hacer usando el binarySearch que devuelve el indice del valor buscado...ojo, que el array tiene que ser ordenado (Arrays.sort)
//Arrays.sort(array);
//return Arrays.binarySearch(array,n) > -1 ? true : false;