package models;

public class Carta {

	private String numero;
	private String palo;
	
	
	
	//Constructor
	
	
	public Carta (String numero , String palo){
	
	this.numero = numero;												
	this.palo = palo;										
			
}
		
	@Override
	   public String toString(){
	        return numero + " de " + palo;
	    }
	
	//Getters y Setters
	

	
	
	public String getNumero(){
		
		return numero;
	}

	public String getPalo(){
	
	return palo;
	}
	
	public String getNombreNumero(){
		
		return "1=as , 2=dos , 3=tres , 4=cuatro , 5=cinco , 6=seis , 7=siete , 8=sota , 9=caballo , 10=rey ";
	}
	
	public String getNombrePalo (){
		
		return " 0=Oros , 1=Copas , 2=Espadas , 3=Bastos ";
	}
	
	public String getNombreCarta(){
		
		return numero+" de "+palo;
	}
	
	public float getValor7yMedia(){									//Devuelve el valor de la carta en juego
		float valor=0f;
		
		for(int i=1; i<8; i++){
			if(getNumero().equals("sota")|| getNumero().equals("caballo")||getNumero().equals("rey")){
				valor = 0.5f;
				
			}else{
				valor = i;
				
			}
		}	
		return valor;
		
	}
	

}

	
	
	
	
	

	
	
	
	
	
	
	
	






