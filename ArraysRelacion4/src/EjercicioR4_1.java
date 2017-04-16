import java.util.*;
public class EjercicioR4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1={2,3,4,5};
		int[] array2={6,8,2,1,2,3,4,5};
		int[] Resultante;
		
		
		Resultante=ConcatenaArrayPro(array1,array2);
		
		for (int i : Resultante) {
			System.out.print(" "+i+" ");
		}
		
		

	}
	public static int[] ConcatenaArrayPro(int[]a, int[]b){
		
		int tam1,tam2, tam;
		int[]c;
		int num=0;
		
		tam1=a.length;
		tam2=b.length;
		
		tam=tam1+tam2;
		c =new int[tam];
		
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++){
			c[i]=b[num];
			num++;
		
		}
		return c;
	}

}
