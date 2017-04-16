import java.util.Scanner;
public class Argumentos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean error=false;
		
		int n1=0,n2=0;
		
		
		if(args.length<2){
			System.out.println("El programa debe tener minimo 2 números");
		}else if(args.length>2){
			System.out.println("el programa debe tener máximo 2 números ");
		}
		
		try{
			
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		}catch(Exception e){
			
			System.out.println("ERROR! Uno de los argumentos o ambos no es un número!");
			error=!error;
		}
		
		
		
		
		
		
		if(!error){		
		
		System.out.println("La suma es :"+(n1+n2));
		System.out.println("La resta es :"+(n1-n2));
		
		}
		

	}

}
