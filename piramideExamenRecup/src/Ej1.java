import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean error=false;
		String caracter1="*.";
		String caracter2="* ";
		String cadena="";
		String resultado="";
		int N=0;									//N SE REFIERE AL NUMERO DE PISOS
		Scanner teclado= new Scanner(System.in);
		
		do{
			
			System.out.println("Introduzca el numero de pisos ");
			resultado = teclado.next();
			error=false;
			try{
				N = Integer.parseInt(resultado);
				
			}catch(Exception e){
				error=true;
				System.out.println("ERROR ! No has introducido un n�mero");
			}
			if(N<=0 && error==false){
				error=true;
				System.out.println("Ha introducido un n�mero negativo !");
				 
			}
		}while(error);
		
		
		String linea="";
		
		
		System.out.println("Introduzca el n�mero de pisos: ");
		N=teclado.nextInt();
		
		for(int i=1;i<=N;i++){
						
				linea=" "+linea;
				for(int j=0;j<=N-i;j++){
					if(j==N-i){
					cadena=cadena+caracter2;
					}else{
						cadena=cadena+caracter1;
					}
			}
				System.out.println(linea+cadena);
				cadena="";
						
				
			}

	}

}
