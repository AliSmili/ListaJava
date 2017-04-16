package main;
import java.util.ArrayList;
import java.util.Random;
import models.*;
public class testPartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				Random rnd = new Random();
				
				// Crear jugadores
				
				Jugador pepe = new Jugador(22, "Pepe");
				Jugador casillas = new Jugador(1, "Casillas");
				Jugador cr7 = new Jugador(7, "Cristiano");
				Jugador bale = new Jugador(11, "Bale");
				
				// Array de jugadores
				ArrayList<Jugador> jugadoresMadrid = new ArrayList<Jugador>();
				jugadoresMadrid.add(pepe);
				jugadoresMadrid.add(casillas);
				jugadoresMadrid.add(cr7);
				jugadoresMadrid.add(bale);
				
				// Crear equipo
				Equipo madrid = new Equipo("Real Madrid", jugadoresMadrid);
				
				// Nuevo equipo
				Equipo barsa = new Equipo("FC Barcelona");
				
				// Crear jugadores para el Barsa
				Jugador valdes = new Jugador(1, "Valdes");
				Jugador messi = new Jugador(10, "Messi");
				Jugador xavi = new Jugador(6, "Xavi");
				Jugador iniesta = new Jugador(8, "Iniesta");
				
				System.out.println(barsa); // Mostrar jugadores (Res: Vacío)
				
				// Obtener lista de jugadores y trabajar con ella (Añadir jugadores dado el array actual)
//				barsa.getJugadores().add(valdes);
//				barsa.getJugadores().add(messi);
//				barsa.getJugadores().add(xavi);
//				barsa.getJugadores().add(iniesta);
				
				// Añadir jugadores con el método "fichaje" de la clase Equipo
				barsa.fichaje(valdes);
				barsa.fichaje(messi);
				barsa.fichaje(xavi);
				barsa.fichaje(iniesta);
				
				System.out.println(barsa.getJugadores()); // Mostar jugadores
				
				// Se realiza un partido
				Partido encuentro = new Partido(madrid, barsa);
				int tiempoSeg = 90; // Duración del encuentro
				int transcurso=0;
				int evento=1;
				
				ArrayList<String>sucesos=new ArrayList<String>();
				
				// Encuentro
				do{
					evento = (int)(Math.abs(rnd.nextInt(40)));
					
					// Gol
					if(evento==3 || evento==14 || evento==26){
						 if((int)(Math.abs(rnd.nextInt(3)))==1){ // Anota equipo local
							 encuentro.setMarcadorL(1);
							 sucesos.add("GOL: "+madrid.getNombre()+" | Min: "+(int)(transcurso)+" | Anotador: "+madrid.getJugadores().get((int)Math.abs(rnd.nextInt(madrid.getJugadores().size()))).getNombre());
						 }
						 else if((int)(Math.abs(rnd.nextInt(3)))==2){ // Anota equipo visitante
							 encuentro.setMarcadorV(1);
							 sucesos.add("GOL: "+barsa.getNombre()+" | Min: "+(int)(transcurso)+" | Anotador: "+barsa.getJugadores().get((int)Math.abs(rnd.nextInt(barsa.getJugadores().size()))).getNombre());
						 }
					}
					
					// Falta
					else if(evento==7 || evento==19 || evento==21){
						if((int)(Math.abs(rnd.nextInt(3)))==1){ // Falta equipo local
							 sucesos.add("Falta: "+madrid.getNombre()+" | Min: "+(int)(transcurso)+" | Infractor: "+madrid.getJugadores().get((int)Math.abs(rnd.nextInt(madrid.getJugadores().size()))).getNombre());
						 }
						 else if((int)(Math.abs(rnd.nextInt(3)))==2){ // Falta equipo visitante
							 sucesos.add("Falta: "+barsa.getNombre()+" | Min: "+(int)(transcurso)+" | Infractor: "+barsa.getJugadores().get((int)Math.abs(rnd.nextInt(barsa.getJugadores().size()))).getNombre());
						 }
					}

					transcurso++;
				}while(transcurso<tiempoSeg);
				
				System.out.printf("Marcador:\n%s\t%s\n%s\t\t%s\n\nDetalles del partido:\n", encuentro.getLocal().getNombre(), encuentro.getVisitante().getNombre(), encuentro.getMarcadorL(), encuentro.getMarcadorV());
				for(int i=0; i<sucesos.size(); i++){
					System.out.println(sucesos.get(i));
				}
				
			}

}
