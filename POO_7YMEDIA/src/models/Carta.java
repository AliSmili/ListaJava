package models;
import java.util.*;

public class Carta {
	
    private String valor; 				//Valor de la Carta As, dos…
    private String figura; 				//Oro, Copas,..

    //Constructor de la clase
    
    public Carta( String NumeroCarta, String FiguraCarta ){
        this.valor = NumeroCarta; 													//Inicializa el valor de la carta
        this.figura = FiguraCarta; 													//Inicializa la figura de la carta
    }

    //Retorna un String del valor y figura de la carta
    
    public String toString(){
        return valor + " de " + figura;
    }
} 																					//Fin de la Clase Carta
