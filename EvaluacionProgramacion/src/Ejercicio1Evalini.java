import java.util.Scanner;
public class Ejercicio1Evalini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		float nota=0;
		
		System.out.println("Introduzca la nota del módulo formativo: ");
		
		nota=teclado.nextFloat();
		
		if(nota<0){
			System.out.println("El dato introducido no puede ser inferior a cero");
		}
		else{
			if(nota>=0 && nota<5f){
				System.out.println("La calificación es un suspenso");
				
				
				
				
			}else{
				if(nota>=5.0f && nota<6.0f){
					System.out.println("La calificación es un Aprobado");
					
				}
				else{
					if(nota>=6.0f && nota<7.0f){
						System.out.println("La calificación es un Bien");
					
					}
					else{
						if(nota>=7.0f && nota<9.0f){
							System.out.println("La calificación es un Notable");
						}
						else{
							if(nota>=9.0f && nota<=10.0f){
							System.out.println("La calificación es un Sobresaliente");
						}
							else{
								System.out.println("El dato introducido no puede ser superior a 10");
							}
					}
				}
			}
		}
		
		}
	}
}

	


