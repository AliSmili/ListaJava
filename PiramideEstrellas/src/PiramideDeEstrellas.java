
public class PiramideDeEstrellas {

	public static void main(String[] args) {
		// ABOL NAVIDAD
		
	/*  1234*6789
		123*5*789
		12*4*6*89                 //los números representan los espacios en blanco
		1*3*5*7*9
		*2*4*6*8*     */
		
		String linea="";
		
		for (int i=1;i<=5;i++){
			for (int j=1;j<=5-i;j++){
				linea=" "+linea;
			}
			//esas son las lineas en blanco que tengo que concatenar
			for(int k=1;k<=i;k++){
				linea=linea+"* ";
			}
			System.out.println(linea);
			linea="";
		}
			

	}

}
