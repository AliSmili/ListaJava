package main;
import java.util.*;

import models.persona;
public class Iterator_test {

	public static void main(String[] args) {
		
		List<persona>miLista = new ArrayList<persona>();
		
		persona p1 = new persona("Victor", 32);
		persona p2 = new persona("Ali", 32);
		persona p3 = new persona("Pepito", 32);
		
		miLista.add(p1);
		miLista.add(p2);
		miLista.add(p3);
		
		ListIterator<persona>z=miLista.listIterator();				//Hay que hacerlo con listIterator
		
		while(z.hasNext()){
			
			System.out.println();
		}
		
		
		
		
		
	}

}
