package main;
import java.util.*;

import models.persona;
public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<persona>miLista = new ArrayList<persona>();
		
		persona p1 = new persona("Victor", 32);
		persona p2 = new persona("Ali", 34);
		persona p3 = new persona("Pepito", 35);
		persona p4 = new persona ("Juan",36 );
		
		miLista.add(p1);
		miLista.add(p2);
		miLista.add(p3);
		
		for (persona persona : miLista) {
			System.out.println(persona);
		}

	}

}
