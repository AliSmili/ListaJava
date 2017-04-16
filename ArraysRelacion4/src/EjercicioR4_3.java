
public class EjercicioR4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={2,3,4,5,8};
		int[] Resultante ;
		int numero=26;
		int tam;
		int pos=0;
		
		tam=array.length+1;
		//Array.Resize(Resultante,tam);
		
		Resultante=InsertaEnArray(array, numero, pos);
		
		for (int i : Resultante) {
			System.out.print(" "+i+" ");
		}
		
		
		
		

	}
	public static int[] InsertaEnArray(int[] a, int num, int pos){
		int[]b =new int[a.length+1];
		int aux;
		
		for(int i=a.length-1;i>pos;i--){
			
			b[i+1]=a[i];
			aux=a[pos];
			b[pos+1]=aux;
							
		}
		b[pos]=num;
		
		return b;
	}

}
