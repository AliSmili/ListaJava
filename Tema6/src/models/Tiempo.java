package models;

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;

	// false 24H - true 12 am/pm
	private boolean modoAMPM = false;

	public Tiempo(int horas, int minutos, int segundos) {
		if (horas > 24 || horas < 0) {
			this.horas = 0;
		} else {
			this.horas = horas;
		}

		if (minutos > 60 || minutos < 0) {
			this.minutos = 0;
		} else {
			this.minutos = minutos;
		}

		if (segundos > 60 || segundos < 0) {
			this.horas = 0;
		} else {
			this.segundos = segundos;
		}

	}

	public Tiempo(int horas, int minutos) {
		this(horas, minutos, 0);
	}

	public Tiempo(int horas) {
		this(horas, 0);
	}

	public int getHoras() {

		return horas;

	}

	public void setHoras(int horas) {
		if (horas <= 24 && horas >= 0) {
			this.horas = horas;
		} else {
			this.horas = 0;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos <= 60 && minutos >= 0) {
			this.minutos = minutos;
		} else {
			this.minutos = 0;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos <= 0 && segundos >= 0) {
			this.segundos = segundos;
		} else {
			this.segundos = 0;
		}
	}
	
	public void setAMPM(boolean AMPM){
		this.modoAMPM = AMPM;
	}
	
	@Override
	public String toString(){
		int h,m,seg;
		String s, pmAm = "";
		
		//Con ternarios
		s =  ((modoAMPM&&horas>=12)?(modoAMPM&&horas>=12):horas) + ":" + 
				minutos + ":" + segundos+" "+
	((modoAMPM&&horas>12)?"PM":((modoAMPM&&horas<=12)?"AM":""));
		
		//Con if else
		
		if(modoAMPM&&horas>=12){
			h = (horas - 12);
		} else {
			h = horas;
		}
		
		m = minutos;
		seg = segundos;
		
		if(modoAMPM&&horas>12){
			pmAm = "PM";
		}else if (modoAMPM&&horas<=12){
			pmAm = "AM";
		}
		
		s = h+":"+m+":"+s+" ";	
		
		if(modoAMPM){
			s += pmAm;
		}
		
		return s;
	}

}
