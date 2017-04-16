package models;
//import java.util.ArrayList;
import java.util.Random;

public class Baraja {
	
	private Carta[] lista_cartas;
	
	private String nombre;
	private int tipoBaraja;
	private  final int NUMCARTAS ;
	private int cartaActual; 											//Indice de la próxima carta a ser repartida
	private Random numeroAleatorio;
	
	

	//Constructor
	
	public Baraja(String nombre ,int tipoBaraja) {	
		
		String[] numero = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
		String[] palo  = {"oros","copas","espadas","bastos"};
		
		
		if(tipoBaraja == 1){
		this.NUMCARTAS = 40;
		this.lista_cartas = new Carta[NUMCARTAS];
		cartaActual =0;
		 numeroAleatorio = new Random();
		
		
		
			
			
		this.tipoBaraja = tipoBaraja ;
		
		}else{
		
		if(tipoBaraja == 2){
			this.tipoBaraja = tipoBaraja ;
			this.NUMCARTAS = 80;
			this.lista_cartas = new Carta[NUMCARTAS];
			cartaActual =0;
			}else{
				this.tipoBaraja = 0 ;
				this.NUMCARTAS = 0;
				this.lista_cartas = new Carta[NUMCARTAS];
				numeroAleatorio = new Random();
			}
		}
		/*El resultado de contador % 10 (modulo)  es un número entre 0 y 10
		  y el resultado de contador/13 (división)  es un número entre 0 y 3*/
			
		  for( int contador = 0; contador < lista_cartas.length; contador++){
	            lista_cartas[contador] = new Carta ( numero[ contador % 10 ], palo[ contador/13 ] );
	                         
	        }
	    }
		
			
	
	@Override
	
	public String toString() {
		
		return "Baraja [nombre=" + nombre + ",tipoBaraja=" + tipoBaraja + "Las Cartas que lo componen son :"+lista_cartas+"  ]";
	}
	
	
	public int getTipoBaraja(){
	
		return tipoBaraja;
	
	}
	
	public String getNombreBaraja(){
		
		return nombre;
	
	}
	
	
	//Metodos
	
    public void barajar(){
        //Antes de barajar la banca debe iniciar en lista_cartas[0] nuevamente
    	
        cartaActual = 0;

        //Para cada carta, al mostrar otra aleatoriamente debe intercambiarse por la anterior
       
        for( int i = 0; i < lista_cartas.length; i++ ){

            //Seleccionar una carta de manera aleatoria entre 0 y 39
        	Random rnd = new Random();
        	
            int aleatorio = numeroAleatorio.nextInt(NUMCARTAS-1)+0;

            //Intercambiar la carta actual por la seleccionada aleatoriamente
            
            Carta temporal = lista_cartas[ i ];
            lista_cartas[ i ] = lista_cartas[ aleatorio ];
            lista_cartas[ aleatorio ] = temporal;
        }
    }
    
    public Carta repartirCartas(){
    	
        //Determinar si la carta pertenece al mazo
    	
        if( cartaActual < lista_cartas.length )
            return lista_cartas[ cartaActual++ ]; 					//Retorna carta actual en el array
        else
            return null; 											//Indica que todas las cartas han sido repartidas
    }
    
   
    
    public void mostrarCartas(Baraja b){
    	  for( int i = 0; i < 10; i++){
              //Repatir e imprimir 4 cartas
              //El guión antes del 20 es para alinear a la izquierda con un ancho de 20
              System.out.printf("%-20s%-20s%-20s%-20s\n",  b.repartirCartas(),
                      b.repartirCartas(), b.repartirCartas(),
                      b.repartirCartas());
          }
    }
    
	

	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
