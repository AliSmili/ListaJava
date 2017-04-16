import java.util.Scanner;
public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final char[]array={'a','d','e','z','f','x','c'};
		char caracter=' ';
		boolean esta=false;
		boolean error=false;
		String resultado="";
		
		Scanner teclado=new Scanner(System.in);
		
		
		
			System.out.println("Introduzca un caracter: ");
			caracter=teclado.next().charAt(0);
			
			esta=CompruebaLetra(array,caracter);
			
			System.out.println(esta);
		
		
		
		
		
		
	} 
	public static boolean CompruebaLetra(char[]a, char car){
		boolean existe=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==car){
				return true;
			}
			
		}
		return false;
		
		
	}

}
