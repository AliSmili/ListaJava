import java.util.Scanner;
public class Ejercicio12bucle {

	public static void main(String[] args) {
		// EJERCICIO 12: Dado un importe queremos saber cuantos billetes contiene de cada tipo de billete
		
		int importe;
		int numbil500,numbil200,numbil100,numbil50,numbil20,numbil10,numbil5,sobra;
		int resto1,resto2,resto3,resto4,resto5,resto6;
		
        Scanner teclado=new Scanner(System.in);
        

		System.out.println("Introduzca la cantidad en euros");
	   importe=teclado.nextInt();
	   
	   if (importe<0){
		   System.out.println("El importe introducido no puede ser inferior a zero");
	   }
	   else{
		   numbil500=importe/500;
		   resto1=importe%500;
		   
		   numbil200=resto1/200;
		   resto2=resto1%200;
		   
		   numbil100=resto2/100;
		   resto3=resto2%100;
		   
		   numbil50=resto3/50;
		   resto4=resto3%50;
		   
		   numbil20=resto4/20;
		   resto5=resto4%20;
		   
		   numbil10=resto5/10;
		   resto6=resto5%10;
		   
		   numbil5=resto6/5;
		   sobra=resto6%5;
		   
		   System.out.println("El importe introducido contiene :");
		   System.out.println(numbil500 + " billetes de 500eur");
		   System.out.println(numbil200 + " billetes de 200eur");
		   System.out.println(numbil100 + " billetes de 100eur");
		   System.out.println(numbil50 + " billetes de 50eur");
		   System.out.println(numbil20 + " billetes de 20eur");
		   System.out.println(numbil10 + " billetes de 10eur");
		   System.out.println(numbil5 + " billetes de 5eur");
		   System.out.println("Sobran "+ sobra+"eur.");
		   
		   
	   }
	}

}
