package main;
import models.*;
import java.util.*;
public class tresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ganador1 = false;
		boolean ganador2 = false;
		Scanner teclado = new  Scanner(System.in);
		String aux="";
		
		Jugador jugador1 =new  Jugador("Ali", false);
		Jugador jugador2 =new  Jugador("Pepito", false);
		
		Partida miPartida = new Partida(jugador1, jugador2);
	
		
		
		System.out.println(miPartida.getModoJuego());
		System.out.println("El nombre del jugador 1 es "+jugador1.getNombreJugador());
		System.out.println("El nombre del jugador 2 es "+jugador2.getNombreJugador());
		
		miPartida.Iniciar();																// Se resetea el tablero
			
		System.out.println("El numero asignado al modo de juego actual es : "+miPartida.getNumModoJuego());
		
		 if(miPartida.getNumModoJuego()== 0){
		        for (int i = 1; i <= 9; i++) {
		            if(i%2==0){
		            	System.out.println("Mueve el jugador 1:");
		                jugador1.MueveJugador1(ValidarPosicion());
		                ganador1 = miPartida.GanaJugador1();									//Se verifica si ha ganado el jugador 1
		            }else{
		            	System.out.println("Mueve el jugador 2:");
		            	
		                jugador2.MueveJugador2(ValidarPosicion());								//ERROR AKI
		                ganador2 = miPartida.GanaJugador2();									//Se verifica si ha ganado el jugador 2
		            }
		           //miPartida.DibujaTablero();
		            if(ganador1 || ganador2){
		                break;
		            }
		        }
		        if(ganador1){
		            System.out.println("Ha ganado el jugador 1!");
		        }else{
		        	if(ganador2){
		        		System.out.println("Ha ganado el jugador 2!");
		        }else{
		        	System.out.println("Vuelvan a intentarlo de nuevo!");
			 }
		 }
		        miPartida.DibujaTablero();
		 }
		 if(miPartida.getNumModoJuego()== 1){
	        for (int i = 1; i <= 9; i++) {
	            if(i%2==0){
	            	System.out.println("Mueve el jugador 1:");
	                jugador1.MueveJugador1(ValidarPosicion());
	                ganador1 = miPartida.GanaJugador1();									//Se verifica si ha ganado el jugador 1
	            }else{
	            	System.out.println("Mueve el jugador 2:");
	                jugador2.MueveOrdenador1();
	                ganador2 = miPartida.GanaJugador2();									//Se verifica si ha ganado el jugador 2
	            }
	          
	            if(ganador1 || ganador2){
	                break;
	            }
	        }
	            if(ganador1){
		            System.out.println("Ha ganado el jugador 1!");
		        }else{
		        	if(ganador2){
		        		System.out.println("Ha ganado el jugador 2!");
		        }else{
		        	System.out.println("Vuelvan a intentarlo de nuevo!");
			 }
		        }
	            miPartida.DibujaTablero();
	        }
		 
		 if(miPartida.getNumModoJuego()== 2){
		        for (int i = 1; i <= 9; i++) {
		            if(i%2==0){
		            	System.out.println("Mueve el jugador 1:");
		                jugador1.MueveOrdenador1();
		                ganador1 = miPartida.GanaJugador1();									//Se verifica si ha ganado el jugador 1
		            }else{
		            	System.out.println("Mueve el jugador 2:");
		                jugador2.MueveOrdenador2();
		                ganador2 = miPartida.GanaJugador2();									//Se verifica si ha ganado el jugador 2
		            }
		           miPartida.DibujaTablero();
		            if(ganador1 || ganador2){
		                break;
		            }
		        }
		            if(ganador1){
			            System.out.println("Ha ganado el jugador 1!");
			        }else{
			        	if(ganador2){
			        		System.out.println("Ha ganado el jugador 2!");
			        }else{
			        	System.out.println("Vuelvan a intentarlo de nuevo!");
				 }
			        }
		            miPartida.DibujaTablero();
		        }	 
	}
	//Metodo para validar las opciones 

	public static int ValidarOpcion(String entrada){												//Al final, no lo usare ya que la opcion se predefine al crear los jugadores
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		int num=0;
		do{
			       
			entrada=teclado.next();
			error=false;
			try{
				
				num=Integer.parseInt(entrada);
							
			}catch(Exception e){
				System.out.println("Error! No ha introducido un n�mero !");
				error=true;
			}
			if((num<1 || num>3) && !error){
				System.out.println("La Opcion introducida no es v�lida !");
				error=true;
			}
					
		}while(error);
		
		return num;
		
		
	}
	
	public static int ValidarPosicion(){
		boolean error=false;
		Scanner teclado=new Scanner(System.in);
		int num=0;
		do{
			       
			String entrada=teclado.next();
			error=false;
			try{
				
				num=Integer.parseInt(entrada);
							
			}catch(Exception e){
				System.out.println("Error! No ha introducido un n�mero !");
				error=true;
			}
			if((num<0 || num>8) && !error){											//La primera casilla es el numero 1, etc...
				System.out.println("La Opcion introducida no es v�lida !");
				error=true;
			}
					
		}while(error);
		
		return num;
		
		
	}

}
