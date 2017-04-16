import java.util.Scanner;
public class captarCerosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int a=0;
				int numerosEnteros[]=new int[5];
				Scanner teclado= new Scanner(System.in);
				
				for (int i=0;i<numerosEnteros.length;i++){
				System.out.println("Introduce numero Entero");
				numerosEnteros[i]=teclado.nextInt();
				}
		
				
				for (int i=0; i<numerosEnteros.length; i++){
					if (numerosEnteros[i]==0){
						a++;
					}
					
				}
				System.out.println("El numero de ceros de este vector es: "+a);

	}

}
