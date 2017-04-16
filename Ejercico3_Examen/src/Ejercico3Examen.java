import java.util.Scanner;
public class Ejercico3Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	Scanner teclado = new Scanner(System.in); 
	System.out.print("\nIngresa altura de la piramide: "); 
	int alto = teclado.nextInt();
	int ancho=13;
	
	 				
	for(int i=0; i<alto; i++){ 
		for(int j=0;j<ancho;j++){
			
			if(j<i){
				System.out.print("*"); 
			}
			else{
				
				System.out.print(".");
				System.out.println();
			
			}
		}
		}
	} 
}