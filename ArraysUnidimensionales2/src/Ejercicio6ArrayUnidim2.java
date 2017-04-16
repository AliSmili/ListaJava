
public class Ejercicio6ArrayUnidim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int miArray[]={3,4,5,6,7,9,43,1,7};
		int arrayCeros[];
		
			arrayCeros=PonCeros(miArray);
			for (int i : arrayCeros) {
				System.out.print(i);
			}
		
	}
		public static int[] PonCeros(int array[]){
			
			for(int i=0;i<array.length;i++){
				array[i]=0;
							
				
			}
			return(array);

	}

}
