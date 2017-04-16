
public class EjercicioR4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={2,3,4,56,9};
		int pos=3;
		int[]Resultante;
		
		Resultante=BorraDeArray(array,pos);
		
		for (int i : Resultante) {
			System.out.print(" "+i+" ");
		}

	}

	
	public static int[]BorraDeArray(int[]a,int pos){
		int aux;
		int[]b=new int[a.length-1];
		for(int i=0;i<pos;i++){
			
			b[i]=a[i];
		}
		for(int j=a.length-1;j>pos;j--){
			b[j-1]=a[j];
			
		}
		
		return b;
	}

}
