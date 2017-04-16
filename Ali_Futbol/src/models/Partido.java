package models;

public class Partido {

	
	private Equipo Local ;
	private Equipo Visitante;
	private int golesL;
	private int golesV;
	
	
	public Partido (Equipo Local, Equipo Visitante){
		
		this.Local = Local;
		this.Visitante = Visitante;
		this.golesL = 0;
		this.golesV = 0;
		
		
	}
	
	@Override
	public String  toString(){
		
		return "El equipo local es : "+Local+" , el visitante es : "+Visitante+
				"\n El marcador es : \n"
				+ +golesL+"        "+golesV;
	}
	
	public Equipo getLocal(){
		return Local;
	}
	
	public Equipo gerVisitante(){
		return Visitante;
	}
	
	public void setLocal(Equipo Local){
		this.Local = Local;
	}
	
	public void setVisitante(Equipo Visitante){
		this.Visitante = Visitante;
	}
	
	public int getGolesL(){
		return golesL;
	}
	
	public int getGolesV(){
		return golesV;
	}
	
	public int setGolesV(){
		return golesV;
	}
	
	public int setGolesL(){
		return golesL;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
