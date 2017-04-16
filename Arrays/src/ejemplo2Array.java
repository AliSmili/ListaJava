import java.util.Scanner;
public class ejemplo2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numerosEnteros[]=new int[5];
		Scanner teclado= new Scanner(System.in);
		
		for (int i=0;i<numerosEnteros.length;i++){
		System.out.println("Introduce numero Entero");
		numerosEnteros[i]=teclado.nextInt();
		}
		System.out.print("numerosEnteros[]=");
		
		for (int i=0; i<numerosEnteros.length; i++){
			System.out.print(numerosEnteros[i]+" ");
		}
		int suma=0;
		for(int i=0;i<numerosEnteros.length;i++){   //LA SUMA DE TODOS LOS INDICES DE UN VECTOR
		suma +=numerosEnteros[i];
		}
		System.out.println("");
		System.out.println("Suma = "+suma);		

	    int producto=1;
	   for(int i=0;i<numerosEnteros.length;i++){    //EL PRODUCTO DE TODOS LOS ÍNDICES 
		  producto*=numerosEnteros[i] ;
	   }
	   System.out.println("");
		System.out.println("Producto = "+producto);  
	}
}
