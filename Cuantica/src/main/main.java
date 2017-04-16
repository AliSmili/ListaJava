package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Animal;
import models.Araña;
import models.CajaSchrodinger;
import models.Rata;

public class main {

	public static void main(String[] args) {
		List<Animal> listaDeLaMuerte = new ArrayList<Animal>();
		listaDeLaMuerte.add(new Rata("Gris", "Ratatouille", 3));
		listaDeLaMuerte.add(new Rata("Rosa", "Pep", 5));
		listaDeLaMuerte.add(new Araña(true, "Spidi Gonzales", 3));
		listaDeLaMuerte.add(new Araña(false, "Spidi Peres", 1));
		listaDeLaMuerte.add(new Araña(true, "Ella", 500));

		int tamInicial = listaDeLaMuerte.size();

		CajaSchrodinger<Animal> cajitaDeLaMuerte = new CajaSchrodinger<Animal>();

		Iterator<Animal> it = listaDeLaMuerte.iterator();

		while (it.hasNext()) {
			cajitaDeLaMuerte.add(it.next());
			if(cajitaDeLaMuerte.observar()==null){
				
			it.remove();
		}
	}
		System.out.println(String.format("En esta ronda han sobrevivido un %.2f%%", ((float)listaDeLaMuerte.size() /(float) tamInicial * 100)));
				

	}

}
