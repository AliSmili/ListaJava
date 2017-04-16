import java.util.Scanner;
public class Ejrcicio1Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner  (System.in);
		float nota=0f;
		int numAlumnos=0;
		String entrada="";
		float[]notas;
		float numSusp=0f;
		float numAprob=0f;
		float numBien=0f;
		float numNotable=0f;
		float numSobreSal=0f;
		float notaMedia=0f;
		
		
		//Función para validar la entrada por teclado del número de alumnos
		numAlumnos=NumeroAlumnos(entrada);
		
		//Función para almacenar las notas en un array con dimensión numAlumnos
		notas=notasAlumnos(entrada,numAlumnos);
		
		//Función que nos calcula el número de suspensos de la clase
		numSusp=PorcentageSuspensos(notas, numAlumnos );
		
		//Función que nos calcula el número de aprobados de la clase
		numAprob=PorcentageAprobados(notas, numAlumnos);
		
		//Función que nos calcula el número de alumnos con calificación Bien de la clase
		numBien=PorcentageBien(notas , numAlumnos);
		
		//Función que nos calcula el número de alumnos con calificación Notable de la clase
				numNotable=PorcentageNotable(notas , numAlumnos);
				
		//Función que nos calcula el número de alumnos con calificación SobreSaliente de la clase
				numSobreSal=PorcentageSobreSaliente(notas , numAlumnos);
				
		//Mostar dtos de salida
				
				System.out.println("El porcentage de suspensos en la clase es "+numSusp+" %");
				System.out.println("El porcentage de aprobados en la clase es "+numAprob+" %");
				System.out.println("El porcentage de Bien en la clase es "+numBien+" %");
				System.out.println("El porcentage de Notables en la clase es "+numNotable+" %");
				System.out.println("El porcentage de Sobresalientes en la clase es "+numSobreSal+" %");
				
		//La Función media
				notaMedia=notaMediaPro(notas, numAlumnos);
				
				System.out.println("La nota media de la clase es : "+notaMedia);
		
		
		
		
		
		
		
		
		

	}
	public static int NumeroAlumnos(String entrada){
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		int num=0;
		do{
			System.out.println("Introduzca el número de alumnos que hay :");
			entrada=teclado.next();
			error=false;
			try{
				
				num=Integer.parseInt(entrada);
							
			}catch(Exception e){
				System.out.println("Error! No ha introducido un número !");
				error=true;
			}
			if(num<1 && !error){
				System.out.println("El número de alumnos no puede ser infrior a uno !");
				error=true;
			}
					
		}while(error);
		
		return num;
		
		
	}
	public static float[] notasAlumnos(String entrada,int num){
		float[] miArray=new float[num];
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		String resultado="";
		do{
			for(int i=0;i<miArray.length;i++){
				
				System.out.println("Introduzca una nota en el array : ");
				resultado=teclado.next();											
				error=false;
				try{
					miArray[i]=Float.parseFloat(resultado);
					
				}catch(Exception e){
					System.out.println("ERROR ! No ha introducido un numero entero !");
					error=true;break;													
				}
				if(miArray[i]>10 && error==false){
					error=true;
					System.out.println("La nota del alumno no puede ser superior a 10!");break;
				}
				
				
			}
			
			
		}while(error);
	
	return miArray;
	
	}
	public static float PorcentageSuspensos(float[] array, int num){
		
		int contador=0;
		float porcentage1=0f;
		for(int i=0;i<array.length;i++){
			if(array[i]<5.0f){
				contador++;
			}
			porcentage1=(float)(contador*(100/num));
		}
		return porcentage1;
		
	}
	public static float PorcentageAprobados(float[]array, int num){
		float porcentage2=0f;
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]>=5.0f && array[i]<6.0f){
				contador++;
			}
			porcentage2=(float)(contador*(100/num));
		}
		return  porcentage2;
		
	}
	
	public static float PorcentageBien(float[]array, int num){
		float porcentage3=0f;
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]>=6.0f && array[i]<7.0f){
				contador++;
			}
			porcentage3=(float)(contador*(100/num));
		}
		return  porcentage3;
		
	}
	
	public static float PorcentageNotable(float[]array, int num){
		float porcentage4=0f;
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]>=7.0f && array[i]<9.0f){
				contador++;
			}
			porcentage4=(float)(contador*(100/num));
		}
		return porcentage4;
		
	}
	
	public static float PorcentageSobreSaliente(float[]array, int num){
		float porcentage5=0f;
		int contador=0;
		for(int i=0;i<array.length;i++){
			if(array[i]>=9.0f && array[i]<10.0f){
				contador++;
			}
			porcentage5=(float)(contador*(100/num));
		}
		return  porcentage5;
		
	}
	
	public static float notaMediaPro(float[] array ,int num){
		float media=0f;
		int contador=0;
		float acumulador=0f;
		
		
			for(int i=0;i<array.length;i++){
					
					acumulador+=array[i];
					media=(float)(acumulador/num);
				}		
			
			return media;
			
		}
		
		
		
	
	
	

}
