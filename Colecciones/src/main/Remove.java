package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import models.persona;

public class Remove {

	public static void main(String[] args) {
		
	List<persona>miLista = new ArrayList<persona>();
		
		persona p1 = new persona("Victor", 32);
		persona p2 = new persona("Ali", 34);
		persona p3 = new persona("Pepito", 35);
		persona p4 = new persona ("Juan",36 );
		
		miLista.add(p1);
		miLista.add(p2);
		miLista.add(p3);
		miLista.add(p4);
		
		ListIterator<persona>T=miLista.listIterator();
		
		while(T.hasNext()){
			
			System.out.println(miLista);
		}
	
		
	}

}
