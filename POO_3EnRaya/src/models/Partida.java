package models;

public class Partida {
	
	private int modoJuego ;
	public int[] tablero;
	private final int CASILLAS = 9;
	public String symbol;
	private String nombre;
	private boolean machine;
	private int num;
	

	
public Partida (){
	this.tablero = tablero;
}

public Partida (Jugador jug1, Jugador jug2){
	
	
	jug1.setSymbol("X");
	jug2.setSymbol ("O");
	
	if(jug1.getSymbol().equals("X")){
		this.num = 1;
	}else{
		this.num = 2;											//Dentro del array se introduce 1 o 2...0 significa que no se ha colocado nada en la casilla
	}
	
	
	if(jug1.esUnaMaquina()==false && jug2.esUnaMaquina()==false){
		setModoJuego(0) ;
	}else{
		if(jug1.esUnaMaquina()==false && jug2.esUnaMaquina()==true){
			setModoJuego(1);
		}if(jug1.esUnaMaquina()==true && jug2.esUnaMaquina()==true){
			setModoJuego(2);
		}
	}
		
	this.tablero = new int[CASILLAS];					//instanciamos el array
		
}

@Override
public String toString(){
     return "El modo de juego es "+modoJuego + " El nombre del jugador 1 es  " ;
 }
//GETTERS //SETTERS

public int[] getTablero(){
	return this.tablero;
}

public void setModoJuego(int mod){
	this.modoJuego = mod;
}

public int getNumModoJuego(){
	return this.modoJuego; 
}

public  String getModoJuego(){
	String s="";
	if(modoJuego == 0){
		s= "El juego se desarrollara entre 2 jugadores humanos";
	}else{
		if(modoJuego==1){
			s="El juego se disputara entre un jugador contra la m�quina";
		}else{
			if(modoJuego==2){
				s="El juego se disputar� entre dos m�quinas";
			}
			
		}
	}
	return s;	
}

int[] tab = new int[CASILLAS];
public void Iniciar(){
	
	this.tablero = tab;
	for(int i=0; i<tab.length;i++){
		tab[i]=0;	
}	
}
//No hace falta un setModoJuego ya que al introducr los jugadores ya se define el modo

public int getNum(){
	return num;
}

public  boolean QuedanMovimientos(){
	
	boolean val= false;

	for(int i=0;i<tablero.length; i++){
		
		if (tablero[i] == 0){
			val = true;
		}else{
			val = false;
		}
	}
	return val;
}
	
public boolean GanaJugador1(){
	
	int val = 1;
    if((tablero[0]==val) && (tablero[1]==val) && (tablero[2]==val)){
        return true;
    }
    if((tablero[3]==val) && (tablero[4]==val) && (tablero[5]==val)){
        return true;
    }
    if((tablero[6]==val) && (tablero[7]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[0]==val) && (tablero[3]==val) && (tablero[6]==val)){
        return true;
    }
    if((tablero[1]==val) && (tablero[4]==val) && (tablero[7]==val)){
        return true;
    }
    if((tablero[2]==val) && (tablero[5]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[0]==val) && (tablero[4]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[2]==val) && (tablero[4]==val) && (tablero[6]==val)){
        return true;
    }
    return false;
}

public boolean GanaJugador2(){
	
	boolean gan= false;
	int val = 2;
    if((tablero[0]==val) && (tablero[1]==val) && (tablero[2]==val)){
        return true;
    }
    if((tablero[3]==val) && (tablero[4]==val) && (tablero[5]==val)){
        return true;
    }
    if((tablero[6]==val) && (tablero[7]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[0]==val) && (tablero[3]==val) && (tablero[6]==val)){
        return true;
    }
    if((tablero[1]==val) && (tablero[4]==val) && (tablero[7]==val)){
        return true;
    }
    if((tablero[2]==val) && (tablero[5]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[0]==val) && (tablero[4]==val) && (tablero[8]==val)){
        return true;
    }
    if((tablero[2]==val) && (tablero[4]==val) && (tablero[6]==val)){
        return true;
    }
    return false;
}

//DIBUJO DEL TABLERO

public void DibujaTablero(){         
    int filas_tablero=0;
    int columnas_tablero;
     
     System.out.println("-------------");
     for(int i=0; i<tablero.length;i++){
         for(int j=0; j<tablero.length;j++){
            
             if(tablero[j]==0){                    
                 System.out.print("| "  + " ");
             }
             if (tablero[j]==1)
             {
                  System.out.print("| " + "X" + " ");
                 
             }
             if (tablero[j]==2)
             {
                  System.out.print("|" + "O"+"  ");
                 
             }
         }
         System.out.print("|");
         System.out.println("");
     }
     System.out.println("-------------");
     
 }
	
}

















