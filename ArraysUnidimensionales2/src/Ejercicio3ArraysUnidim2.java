import java.util.Scanner;
public class Ejercicio3ArraysUnidim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] miArray=new int[5];
		
		LeeArray5(miArray);
		
		

	}
	public static void LeeArray5(int[]array){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca los elementos del array");
		for(int i=0;i<array.length;i++){
			array[i]=teclado.nextInt();
		}
		
		
	}

}
