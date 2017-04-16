package test;

import models.Rectangulo;
import models.Tiempo;

public class TestRect {

	public static void main(String[] args) {
		Tiempo t = new Tiempo(12,23,54);
	
		t.setAMPM(true);
		
		System.out.println(t);
	
	}

}
