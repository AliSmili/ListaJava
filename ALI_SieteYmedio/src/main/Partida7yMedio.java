package main;
import models.*;
import java.util.*;
public class Partida7yMedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		String opcion ="";
		float suma1=0;
		float suma2=0;
		boolean SigueJugador = true;
		boolean SigueBanca = true;
		boolean oculta=false;
		int num;
		boolean SiguePartida= true;
		
		Carta[] cartasJugador = new Carta[10];								//Defino un valor maximo de 10 ya que es imposible llegar a ese tama�o
		Carta[] cartasBanca = new Carta[10];
		
		
		
		//Crear Baraja nueva de 40 cartas
		
		 Baraja misCartas = new Baraja("Espa�ola", 1);						//Se crea una baraja nueva de 40 cartas
	        misCartas.barajar();											//Se baraja el mazo
	        
	        System.out.println("Barajamos y ense�amos todas las cartas de la baraja para averiguar la integridad de la baraja");
	        misCartas.mostrarCartas(misCartas);								//Se reparten todas las cartas para averiguar le veracidad del metodo barajar
	        
	        misCartas.barajar();
	        
	     for(int i=0; i<10 && SigueJugador && SiguePartida; i++){
	        System.out.println("El jugador pide una carta :");
	         
	        cartasJugador[i]=misCartas.repartirCartas();
	        
	        suma1 +=cartasJugador[i].getValor7yMedia();
	        System.out.println("El jugador le ha tocado esta carta :"+cartasJugador[i].getNombreCarta());
	        
	        if (suma1 < 7.5f ){
	        	SigueJugador = true;
	        	
	        	
		        System.out.println("Elija una opcion : 1-Ocultar   2-Mostrar ");
				num=ValidarOpcion(opcion);
	        	
	        	
		        switch(num){
		        
	    		case 1:
	    			System.out.println("El jugador ha ocultado su carta ");
	    			
	    			oculta=true;
	    			break;
	    
	    		case 2:
	    			System.out.println("La carta a la vista del jugador es :"+cartasJugador[i].getNombreCarta());break;
	    	
	    		}
		        
	 	       	System.out.println("Elija una opcion : 1-Seguir   2-Plantarse ");
	 	    	num=ValidarOpcion(opcion);
	 	    	
	 	    	switch(num){											
	 	    	
	 	    	    	
	 	    	case 2:
	 	    		System.out.println("El jugador se ha plantado !");
	 	        	SigueJugador = false;
	 	        	SiguePartida = true;break;
	 	    		
	 	    	}
	        	     
	        
	        	}else{
	        		if (suma1 > 7.5f){
	        			 SigueJugador = false;
	     	    	    
	      	    	   System.out.println(" Que pena !! Se ha pasado de 7.5 y El jugador pierde !!");
	      	    	   SiguePartida=false;
	      	    	   SigueJugador=false;
	      	    	   break;
	    		   
	        		}
	    		   
	    	    
	    	   }
	    	   
	    	   
	       }
	        
	     
	     
	     //Le toca a la banca
	     //La banca siempre ense�a sus cartas
	     
	     if(SigueJugador==false && SiguePartida==true ){
	    	 
	    	 for(int i=0; i<10 && SigueBanca && SiguePartida; i++){
	 	        System.out.println("La banca se autoreparte una carta :");
	 	        
	 	        
	 	        cartasBanca[i]=misCartas.repartirCartas();
	 	       System.out.println("La banca le ha tocado esta carta :"+cartasBanca[i].getNombreCarta());
	 	        
	 	        suma2 +=cartasBanca[i].getValor7yMedia();
	 	        
	 	        if (suma2 < 7.5f){
	 	        	SigueBanca = true;
	 	        	
	 	       	System.out.println("Elija una opcion : 1-Seguir   2-Plantarse ");
	 	    	num=ValidarOpcion(opcion);
	 	    	
	 	    	switch(num){											//El case 1 lo omito ya que si sigue vuelve al bucle
	 	    	
	 	    	
	 	    	
	 	    	
	 	    	case 2:
	 	    		System.out.println("La banca se ha plantado !");
	 	        	SigueBanca = false;break;
	 	    		
	 	    	}
	 	        	     
	 	        
	 	       }else{
	 	    	   if (suma2 == 7.5f){
	 	    		   
	 	    		   System.out.println("Maravilloso !! tiene 7.5 justo ! La banca gana !!");
	 	    		   System.out.println("FIN DEL JUEGO");
	 	    		   SigueBanca=false;
	 	    		   SiguePartida=false;
	 	    		   break;
	 	    	   }
	 	    		   
	 	    	   else{
	 	    	   
	 	    	   SigueBanca = false;
	 	    	    
	 	    	   System.out.println(" Que pena para la banca !! Se ha pasado de 7.5 y Gana el Jugador !!");
	 	    	   SiguePartida=false;
	 	    	   break;
	 	       
	 	    	   }
	 	       }
	    	 }
	 	        
	    	 }
	 	        
	 	    //Comparativa de resultados en caso de que ambos se planten
	 	    	
	 	    	if(suma2>=suma1 && SiguePartida){
	 	    		System.out.println("Gana la banca contra el Jugador !");
	 	    		System.out.println("Resultado de la banca : "+suma2);
	 	    		SiguePartida=false;
	 	    	}else{
	 	    		if(suma2<suma1 && SiguePartida){
	 	    		System.out.println("Gana el Jugador contra banca !");
	 	    		System.out.println("Resultado del jugador : "+suma1);
	 	    		SiguePartida=false;
	 	    	}
	 	    	}
	 	    	
	 	    	
	     
	 	       
	             
	    	 }
	        
	       
	
            
	//Metodo para validar las opciones de switch

	public static int ValidarOpcion(String entrada){
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
			if((num<1 || num>2) && !error){
				System.out.println("La Opcion introducida no es v�lida !");
				error=true;
			}
					
		}while(error);
		
		return num;
		
		
	}
	    
}       
	      
	        
	        
	        
	 
	        
	        
		

		
		
		
	
		
		
		
		
		
		
		

	


