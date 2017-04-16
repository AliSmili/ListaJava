
public class primeraClaseArray {

	public static void main(String[] args) {
		// Mi primera clase de arrays.
		
		int numerosEnteros []= new int[5];
		System.out.println(numerosEnteros.length);
		for (int i=0; i<numerosEnteros.length; i++){
			numerosEnteros[i]=0;
		}
		numerosEnteros[2]=24;
		for(int i=0;i<numerosEnteros.length;i++){
			System.out.println("numerosEnteros[]= ");
			System.out.println(numerosEnteros[i]+" ");
			
		}
		

	}

}
