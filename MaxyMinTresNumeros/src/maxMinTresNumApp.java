import java.util.Scanner;
public class maxMinTresNumApp {

	public static void main(String[] args) {
		// Order de menor a mayor de tres numeros introducidos por teclado
		
	int num1, num2, num3, inter, mayor, menor;
	String input1, input2, input3;
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduzca el primer numero: ");
	 input1=teclado.nextLine();
	 num1=Integer.parseInt(input1);
	 
	 System.out.println("Introduzca el segundo numero: ");
	 input2=teclado.nextLine();
	 num2=Integer.parseInt(input2);
	 
	 System.out.println("Introduzca el tercer numero: ");
	 input3=teclado.nextLine();
	 num3=Integer.parseInt(input3);
	 
	 if(num1==num2 && num1==num3 && num2==num3 ){
		   System.out.println("Los tres números son iguales");
	 }
	 else{
		 
		 if(num1<=num2 && num1<=num3 && num2<=num3){
			 menor=num1;
			 inter=num2;
			 mayor=num3;
			 System.out.println("El orden de menor a mayor es : "+menor+" "+inter+" "+mayor);
		 }
		 if(num1>=num2 && num1>=num3 && num2<=num3){
					 mayor=num1;
					 inter=num2;
					 menor=num3;
			 System.out.println("El orden de menor a mayor es : "+menor+" "+inter+" "+mayor);
					 }
		 if (num1<=num2 && num1>=num3 && num2>=num3 ){
							 mayor=num2;
							 menor=num3;
							 inter=num1;
			 System.out.println("El orden de menor a mayor es : "+menor+" "+inter+" "+mayor);
							 
						 }
					 }	 
	 
			 
			 }
		  
	 

	 
}
	
	


