import java.util.Scanner;
public class Ejercicio2Examen {

	public static void main(String[] args) {
		// Encriptar y Desencriptar
		
		int entrada=0;
		int N=0;
		char texto[]={'H','O','L','A','M','U','N','D','O'};
		Scanner teclado= new Scanner(System.in);
		
		
		
		System.out.println("Desea Encriptar, pulse 1; Si prefiere desencriptar, pulse 2");
		entrada=teclado.nextInt();
		
		if(entrada<1 || entrada>2){
			System.out.println("Dato Introducido No válido");
		}
		else{
			
			if(entrada==1){
				
				System.out.println("Introduzca el número de posiciónes que se deben saltar:");
				N=	teclado.nextInt();
				
		
					
					
						
							
							for (int i=0;i<texto.length;i++) {
								if(texto[i]=='z'){								//La excepción esta en la 'z' y 'Z'
									texto[i]='a';
								}
								else{
									if(texto[i]=='Z'){
									texto[i]='A';
									}
									else{
										int numCaracter=(int)texto[i];		
										numCaracter=numCaracter+N;
										texto[i]=(char)numCaracter;
									}
							}
							}
							System.out.println("Encriptado con N=1");
							System.out.println("Texto original: HOLAMUNDO");
							System.out.println("Texto Encriptado:");
							for (char c : texto) {
								System.out.print(c+" ");
							}
						
						
						
					
				
					
				}
			if(entrada==2){
				System.out.println("Introduzca el número de posiciónes que se deben saltar:");
				N=	teclado.nextInt();
				
		
					
					
						
							
							for (int i=0;i<texto.length;i++) {
								if(texto[i]=='a'){								//La excepción esta en la 'a' y 'A'
									texto[i]='z';
								}
								else{
									if(texto[i]=='A'){
									texto[i]='Z';
									}
									else{
										int numCaracter=(int)texto[i];		
										numCaracter=numCaracter-N;
										texto[i]=(char)numCaracter;
									}
							}
							}
							System.out.println("Encriptado con N=1");
							System.out.println("Texto original: HOLAMUNDO");
							System.out.println("Texto Desencriptado:");
							for (char c : texto) {
								System.out.print(c+" ");
							}
				
			}
				
			}
			
					
		
		
		
	}

}
