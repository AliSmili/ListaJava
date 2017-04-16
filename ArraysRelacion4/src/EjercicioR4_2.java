
public class EjercicioR4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={2,3,4,5,8};
		int[] Resultante;
		
		Resultante=CopiaArrayPro(array);
		
		for (int i : Resultante) {
			System.out.print(" "+i+" ");
		}

	}
	
	public static int[] CopiaArrayPro(int[]a){
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			
		}
		return b;
	}

} 
