package Models;

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;
	
	
	private boolean modoAMPM = false;


	public Tiempo(int horas, int minutos, int segundos){
		this.horas=horas;
		this.horas=minutos;
		this.segundos=segundos;
		
		
		
	}
	
	
	public Tiempo (int horas){
		
		
	}
	public int getHoras(){
		
		return horas;
		
	}
	
	
	public int getMinutos(){
		return minutos;
		
	}
	
	public int getSegundos(){
		return segundos;
		
	}
	
	public void setHoras(int horas){
		if(horas <= 24 && horas >=0){
			this.horas=horas;
		}else{
			this.horas=0;
		}
		
	}
	
	
	public void setMinutos(int minutos){
		if(minutos <= 60 && minutos >=0){
			this.minutos=minutos;
		}else{
			this.minutos=0;
		}
		
	}
	
	public void setSegundos(int segundos){
		if(segundos >=0 && segundos <=60){
			this.segundos=segundos;
		}else{
			this.segundos=0;
		}
	
	}
	
	public void setAMPM(boolean AMPM){
		this.modoAMPM = AMPM;
		
		
	}
	

	
	
	
	
}