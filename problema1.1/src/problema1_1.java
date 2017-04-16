import java.util.*;
public class problema1_1 {
	
	//MEDIA DE 4 NUMEROS

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero :");
	float a = entrada.nextFloat();
	System.out.println("Introduzca el segundo numero:");
	float b=entrada.nextFloat();
	System.out.println("Introduzca el tercer numero");
	float c=entrada.nextFloat();
	System.out.println("Introduzca el cuarto numero");
	float d=entrada.nextFloat();
	float resultado= (a+b+c+d)/4;
	System.out.println("La media de los cuatro numeros es: "+ resultado);

	
		

	}

}
