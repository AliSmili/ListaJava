package models;

public class Tiempo {
	
	
	private int horas;
	private int minutos;
	private int segundos;
	private String AMPM;
	
	
	
	
	
	public Tiempo(int horas, int minutos, int segundos){
		
		this.horas = horas;
		this.minutos=minutos;
		this.segundos = segundos;
		
		
			
	}
	public Tiempo(int horas , int minutos){
		
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public Tiempo(int horas){
		
		this.horas=horas;
	}
	
	
	public void cambiaHora(int hor, int min, int seg){
		
		this.horas = hor ;
		this.minutos=min;
		this.segundos=seg;
		
	}
	
	
		
	public String dimeHora(){
		
	
		
		if(horas >24 || minutos >60 || segundos>60 || horas<0 || minutos <0 || segundos<0 ){
			this.horas =0;
			this.minutos=0;
			this.segundos=0;
			this.AMPM = "Error !!";
			
			
			
			//return "Uno o varios de los parámetros introducidos no son correctos !!";//
		}else{
			if(horas>12 ){
				this.horas = horas- 12;
				this.AMPM ="PM";
				
				
				
			}else{
				this.horas = horas;
				this.AMPM ="AM";
					
			}
		}
		
		return "La hora introducida es : "+horas+" : "+minutos+" : "+segundos+" "+AMPM;
	}

	
	
	
	
	}
	
	
	
	
	
	
	

